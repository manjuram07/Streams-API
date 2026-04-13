import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

    /*
             Grouping even and odd numbers from an array into a list of lists
             Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
             Output: [[2, 4, 6, 8, 10], [1, 3, 5, 7, 9]]
     */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.stream(numbers)
                                            .boxed().collect(Collectors.toList());

        List<List<Integer>> collect = list.stream()
                                                    .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                                                    .entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());

        System.out.println(collect);


    }
}
