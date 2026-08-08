package com.StringBasedProblems;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestWordInSentence {
    public static void main(String[] args) {

        String words = "java is easy and java is powerful";

        String max = Arrays.stream(words.split(" "))
                                .max(Comparator.comparingInt(String::length)).get();

        System.out.println(max);
    }
}
