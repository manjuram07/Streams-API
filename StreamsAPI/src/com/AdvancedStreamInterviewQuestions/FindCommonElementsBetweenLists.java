package com.AdvancedStreamInterviewQuestions;

import java.util.List;

public class FindCommonElementsBetweenLists {

    public static void main(String[] args) {

        // Find common elements between two lists.

        List<Integer> list1 = List.of(1,2,3,4,5,6);
        List<Integer> list2 = List.of(7,8,9,2,1);

        List<Integer> list = list1.stream()
                .flatMap(num1 -> list2.stream()
                        .filter(num2 -> num1.equals(num2)))
                .distinct()
                .toList();

        list.forEach(System.out::println);



    }
}
