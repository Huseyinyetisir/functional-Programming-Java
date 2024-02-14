package com.huseyinyetisir;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 45, 6);

        printNumbersFunctional(numbers);
        printNumbersFunctional2(numbers);

    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP01Functional::print);
    }

    private static void printNumbersFunctional2(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

}
