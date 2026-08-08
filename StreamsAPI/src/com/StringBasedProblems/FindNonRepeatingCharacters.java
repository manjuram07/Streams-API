package com.StringBasedProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatingCharacters {
    public static void main(String[] args) {

        String name = "manjuram";

        Character character = name.chars()
                                    .mapToObj(ch -> (char) ch)
                                    .collect(Collectors
                                            .groupingBy(Function.identity(),
                                                    LinkedHashMap::new,
                                                    Collectors.counting()))
                                    .entrySet()
                                    .stream()
                                    .filter(value -> value.getValue() == 1)
                                    .map(Map.Entry::getKey).findFirst().get();

        System.out.println(character);
    }
}
