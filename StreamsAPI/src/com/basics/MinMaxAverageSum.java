package com.basics;

import java.util.*;
import java.util.stream.IntStream;

public class MinMaxAverageSum {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 10, 9, 5, 6, 2, 7, 4,8);

        // Find the maximum number in a list.
        int max = list.stream()
                        .reduce(0, Integer::max);

        System.out.println("Maximum value: "+ max);

        // Find the minimum number in a list.
        int min = list.stream()
                        .mapToInt(Integer::intValue)
                        .min()
                        .getAsInt();

        System.out.println("Minimum value: "+min);


        // Find the sum of all numbers.
        int sum = list.stream()
                        .reduce(0, Integer::sum);

        System.out.println("sum value: "+sum);

        // Find the average of numbers.
        double average = list.stream()
                                .mapToInt(Integer::intValue)
                                .average().getAsDouble();

        System.out.println("Average value: "+average);


        //Find the second highest number.
        Integer secondHighest = list.stream()
                                .sorted((x1,x2) -> x2.compareTo(x1))
                                .skip(1)
                                .findFirst().get();

        System.out.println("second Highest value: "+secondHighest);


        // Find the second lowest number.
        Integer secondLowest = list.stream()
                                    .sorted()
                                    .skip(1)
                                    .findFirst().get();

        System.out.println("second Lowest value: "+secondLowest);


        //Find the 4th highest number.
        Integer nHigest = list.stream()
                                .sorted(Comparator.reverseOrder())
                                .skip(4-1)
                                .findFirst().get();

        System.out.println("nth Highest value: "+nHigest);


        // Find the largest string by length.
        List<String> names = List.of("manju","ram","krish","hanuman");

        int length = names.stream()
                            .mapToInt(String::length)
                            .max()
                            .getAsInt();

        System.out.println("Maximum length of String : "+length);

    }
}
