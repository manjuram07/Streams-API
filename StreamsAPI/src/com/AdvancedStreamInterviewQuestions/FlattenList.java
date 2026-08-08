package com.AdvancedStreamInterviewQuestions;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlattenList {
    // Flatten a list of lists into a single list using streams.

    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
                                            List.of(1,2,3,4,5,6),
                                            List.of(7,8,9,10)
                                    );

        List<Integer> result = list.stream()
                                        .flatMap(List::stream)
                                        .toList();

        System.out.println(result);
    }
}
