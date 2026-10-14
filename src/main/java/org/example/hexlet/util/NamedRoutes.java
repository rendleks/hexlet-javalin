package org.example.hexlet.util;

import jakarta.enterprise.inject.Stereotype;

public class NamedRoutes {

    public static String usersPath() {
        return "/u";
    }

    public static String buildUserPath() {
        return "/u/build";
    }

    public static String coursesPath() {
        return "/courses";
    }

    public static String coursePath(Long id) {
        return coursePath(String.valueOf(id));
    }

    public static String coursePath(String id) {
        return "/courses/" + id;
    }
}
