package com.StringBasedProblems;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {

        // Reverse a string using streams.

        String name = "manjuram";

        String reverString = IntStream.iterate(name.length() - 1, i -> i >= 0, i -> i - 1)
                                        .mapToObj(i -> Character.toString(name.charAt(i)))
                                        .collect(Collectors.joining());

        System.out.println(reverString);


    }
}
