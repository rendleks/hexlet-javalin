package org.example.hexlet.util;

import jakarta.enterprise.inject.Stereotype;

public class NamedRoutes {

    public static String rootPath() {
        return "/";
    }

    public static String sessionsPath() {
        return "/sessions";
    }

    public static String sessionsPathBuild() {
        return "/sessions/build";
    }
    public static String usersPath() {
        return "/users";
    }

    public static String buildUserPath() {
        return "/users/build";
    }

    public static String userPath(Long id) {
        return coursePath(String.valueOf((id)));
    }

    public static String userPath(String id) {
        return "/users/" + id;
    }

    public static String deleteUserPath(Long id) {
        return deleteUserPath(String.valueOf(id));
    }

    public static String deleteUserPath(String id) {
        return "/users/" + id + "/delete";
    }

    public static String userPathEdit(Long id) {
        return userPathEdit(String.valueOf(id));
    }

    public static String userPathEdit(String id) {
        return "/users/" + id + "/edit";
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
