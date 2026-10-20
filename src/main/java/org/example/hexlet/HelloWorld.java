package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.example.hexlet.repository.BaseRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import org.example.hexlet.controller.SessionsController;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.dto.MainPage;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.users.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;
import org.example.hexlet.util.NamedRoutes;

import javax.naming.Name;

public class HelloWorld {
    public static void main(String[] args) throws Exception{

        var hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:h2:mem:hexlet_project;DB_CLOSE_DELAY=-1;");

        var dataSource = new HikariDataSource(hikariConfig);

        var url = HelloWorld.class.getClassLoader().getResourceAsStream("schema.sql");
        var sql =
                new BufferedReader(new InputStreamReader(url))
                        .lines()
                        .collect(Collectors.joining("\n"));
        try (var connection = dataSource.getConnection(); var statement = connection.createStatement()) {
            statement.execute(sql);
        }

        BaseRepository.dataSource = dataSource;

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(createTemplateEngine()));

            config.routes.get(NamedRoutes.rootPath(), ctx -> {
                var visited = Boolean.valueOf(ctx.cookie("visited"));
                var page = new MainPage(visited, ctx.sessionAttribute("currentUser"));
                ctx.render("index.jte", Map.of("page", page));
                ctx.cookie("visited", String.valueOf(true));
            });

            config.routes.get(NamedRoutes.usersPath(), UsersController::index);
            config.routes.get(NamedRoutes.buildUserPath(), UsersController::build);
            config.routes.get(NamedRoutes.userPath("{id}"), UsersController::show);
            config.routes.post(NamedRoutes.usersPath(), UsersController::create);
            config.routes.get(NamedRoutes.userPathEdit("{id}"), UsersController::edit);
            config.routes.patch(NamedRoutes.userPath("{id}"), UsersController::update);
            config.routes.post(NamedRoutes.deleteUserPath("{id}"), UsersController::destroy);

            config.routes.get(NamedRoutes.sessionsPathBuild(), SessionsController::build);
            config.routes.post(NamedRoutes.sessionsPath(), SessionsController::create);
            config.routes.delete(NamedRoutes.sessionsPath(), SessionsController::destroy);

            config.routes.get(
                    NamedRoutes.coursePath("{id}"),
                    ctx -> {
                        var id = ctx.pathParam("id");
                        // Как работать с базами данных мы разберем в следующих
                        // уроках
                        var course = new Course("Java", "Основы Java");
                        course.setId(1L);
                        var page = new CoursePage(course);
                        ctx.render("courses/show.jte", Map.of("page", page));
                    });

            config.routes.get(
                    NamedRoutes.coursesPath(),
                    ctx -> {

                        var course1 = new Course("Java", "Основы Java");
                        var course2 = new Course("PHP", "Основы PHP");
                        course1.setId(1L);
                        course2.setId(2L);
                        var allCourses = List.of(
                                course1,
                                course2
                                );
                        var term = ctx.queryParam("term");
                        List<Course> courses;
                        if (term != null) {
                            courses = allCourses.stream()
                                    .filter(
                                            course -> course.getName().toLowerCase().startsWith(term)
                                    )
                                    .toList();
                        } else {
                            courses = allCourses;
                        }

                        var header = "Курсы по программированию";
                        var page = new CoursesPage(courses, header, term);
                        ctx.render("courses/index.jte", Map.of("page", page));
                    }
            );
        });

        app.start(7070);
    }

    private static TemplateEngine createTemplateEngine() {
        var codeResolver = new DirectoryCodeResolver(Path.of("src/main/jte"));
        return TemplateEngine.create(codeResolver, ContentType.Html);
    }
}
