package com.StringBasedProblems;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharacters {
    public static void main(String[] args) {

        // Count the number of characters in a string.

        String names = "manjuram";

        long count = names.chars()
                            .count();

        System.out.println(count);

        // alternative
        Long collect = names.chars()
                            .mapToObj(ch -> (char) ch)
                            .collect(Collectors.counting());

        System.out.println(collect);
    }
}
