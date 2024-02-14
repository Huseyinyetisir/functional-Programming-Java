package com.huseyinyetisir;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker");

        // printAllCourses(courses);
        printSpringCouses(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printSpringCouses(List<String> courses) {
        courses.stream()
                .filter(str -> str.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printSpringCouses2(List<String> courses) {
        courses.stream()
                .filter(str -> str.length() >= 4)
                .forEach(System.out::println);
    }
}
