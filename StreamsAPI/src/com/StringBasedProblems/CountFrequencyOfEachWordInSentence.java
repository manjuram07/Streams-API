package com.StringBasedProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountFrequencyOfEachWordInSentence {

    public static void main(String[] args) {

        String words = "java is easy and java is powerful";

        Map<String, Long> collect = Arrays.stream(words.split(" "))
                                            .collect(Collectors
                                                    .groupingBy(Function.identity(),
                                                            Collectors.counting()));

        collect.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}
