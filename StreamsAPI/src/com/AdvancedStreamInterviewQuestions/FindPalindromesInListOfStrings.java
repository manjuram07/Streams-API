package com.AdvancedStreamInterviewQuestions;

import java.util.List;

public class FindPalindromesInListOfStrings {

    public static void main(String[] args) {

        // Find palindromes in a list of strings
        List<String> list = List.of("madam", "raam", "radar", "hanuman", "malayalam");

        List<String> list1 = list.stream()
                .filter(word -> word.contentEquals(new StringBuilder(word).reverse()))
                .toList();

        list1.forEach(System.out::println);

    }
}
