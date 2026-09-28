package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.routes.get("/users", ctx -> ctx.result("GET /users"));
            config.routes.post("/users", ctx -> ctx.result("POST /users"));
        });
        app.start(7070);
    }
}
