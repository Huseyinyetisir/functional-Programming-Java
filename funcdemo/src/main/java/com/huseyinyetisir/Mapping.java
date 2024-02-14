package com.huseyinyetisir;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Mapping {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Docker");

        List<Integer> numbers = List.of(1, 2, 3, 4, 45, 6);

        // printNumbersSquare(numbers);
        // printLengthofCourses(courses);
        printOptional(courses);
    }

    private static void printOptional(List<String> courses) {
        Predicate<? super String> predicate = course -> course.startsWith("C");
        Optional<String> optional = courses.stream().filter(predicate).findFirst();
        System.out.println(optional.get());
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
