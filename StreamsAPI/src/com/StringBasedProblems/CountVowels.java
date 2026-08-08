package com.StringBasedProblems;

import java.util.stream.Stream;

public class CountVowels {
    public static void main(String[] args) {

        // Count vowels in a string using streams.

        String names = "manjuram";

        long count = names.chars()
                            .filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                            .distinct()
                            .count();

        System.out.println(count);
    }
}
