package com.AdvancedStreamInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordsInSentence {

    public static void main(String[] args) {

        // Find duplicate words in a sentence.

        String sentence = "Java is a best and java is worldwide.";

        Set<String> seen = new HashSet<>();

        List<String> list = Arrays.stream(sentence.toLowerCase().split(" "))
                .filter(word -> !seen.add(word))
                .toList();

        list.forEach(System.out::println);

        // using groupingBy

        List<String> list1 = Arrays.stream(sentence.toLowerCase().split(" "))
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                    .entrySet()
                                    .stream()
                                    .filter(value -> value.getValue() > 1)
                                    .map(key -> key.getKey())
                                    .toList();

        list1.forEach(System.out::println);
    }
}
