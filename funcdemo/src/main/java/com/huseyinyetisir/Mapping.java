package com.huseyinyetisir;

import java.util.List;

public class Mapping {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker");

        List<Integer> numbers = List.of(1, 2, 3, 4, 45, 6);

        // printNumbersSquare(numbers);
        printLengthofCourses(courses);
    }

    private static void printLengthofCourses(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }

    private static void printNumbersSquare(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

}
