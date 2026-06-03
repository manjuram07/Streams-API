import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMinAvg {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9, 3, 5, 1, 7);

        // sum
        int sum = list.stream()
                .reduce(0, Integer::sum);
//                        .mapToInt(Integer::intValue)
//                        .sum();

        System.out.println(sum);

        // max
        int max = list.stream()
                            .mapToInt(Integer::intValue)
                            .max()
                            .getAsInt();

        System.out.println(max);

        // min
        int min = list.stream()
                        .mapToInt(Integer::intValue)
                        .min()
                        .getAsInt();

        System.out.println(min);

        // avg
        double avg = list.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .getAsDouble();

        System.out.println(avg);

        // print duplicates
        Set<Integer> seen = new LinkedHashSet<>();

        List<Integer> collect = list.stream()
                .filter(n -> !seen.add(n)).toList();

        collect.forEach(value -> System.out.print(value+" "));

    }
}
