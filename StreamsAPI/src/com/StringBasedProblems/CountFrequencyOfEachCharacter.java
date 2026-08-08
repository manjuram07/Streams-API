package com.StringBasedProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharacter {
    public static void main(String[] args) {
        
        String name = "programming";

        name.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                .forEach((key, value) -> System.out.println(key +" : "+value));

    }
}
