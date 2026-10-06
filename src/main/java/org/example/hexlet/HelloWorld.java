package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import java.nio.file.Path;
import java.util.Map;
import java.util.List;

import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.UsersPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

public class HelloWorld {
    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(createTemplateEngine()));

            config.routes.get("/", ctx -> {
                ctx.render("index.jte");
            });

            config.routes.get("/users/build", ctx -> {
               ctx.render("users/build.jte");
            });

            config.routes.post("/users", ctx -> {
                var name = ctx.formParam("name").trim().toLowerCase();
                var email = ctx.formParam("email").trim().toLowerCase();
                var password = ctx.formParam("password");
                var passwordConfirmation = ctx.formParam("passwordConfirmation");

                var user = new User(name, email, password);
                UserRepository.save(user);
                ctx.redirect("/users");
            });

            config.routes.get("/users", ctx -> {
                var headers = "Пользователи";
                var page = new UsersPage(UserRepository.getEntities(), headers);
                ctx.render("users/index.jte", Map.of("page", page));
            });

            config.routes.get(
                    "/courses/{id}",
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
                    "/courses",
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
