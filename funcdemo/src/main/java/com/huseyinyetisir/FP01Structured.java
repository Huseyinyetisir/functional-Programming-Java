package com.huseyinyetisir;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        // printNumbersStructured(List.of(1, 2, 3, 4, 45, 6));

    }

    private static void printNumbersStructured(List<Integer> numbers) {

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }

}