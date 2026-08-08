package com.StringBasedProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateCharacters {
    public static void main(String[] args) {

        String name = "manjmauram";
        Set<Character> set = new HashSet<>();

        System.out.println("---------------- using set approach----------");

        name.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !set.add(ch))
                .distinct()
                .forEach(ch -> System.out.print(ch +" "));

        System.out.println("\n------------using groupingBy approach----------");

        Map<Character, Long> collect = name.chars()
                                            .mapToObj(ch -> (char) ch)
                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Stream<Character> characterStream = collect.entrySet().stream()
                                                                .filter(value -> value.getValue() > 1)
                                                                .map(key -> key.getKey());

        characterStream.forEach(ch -> System.out.print(ch+" "));
    }
}
