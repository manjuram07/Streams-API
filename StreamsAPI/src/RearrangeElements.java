import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RearrangeElements {

    /*
         Given an array of integers, rearrange the elements to form the highest/lowest possible number.
         For example, given [1,2,3,4,5]
         output: 54321/12345
     */
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        List<Integer> list = Arrays.stream(numbers)             // convert int[] to IntStream
                                         .mapToObj(x->x)    // convert int to Integer
//                                        .boxed()             // convert IntStream to Stream<Integer>
                                        .collect(Collectors.toList()).reversed(); // collect to List<Integer> and reverse the order

        System.out.println(list);


        List<Integer> list1 = Arrays.stream(numbers)             // convert int[] to IntStream
//                                    .mapToObj(x->x)    // convert int to Integer
                                   .boxed()             // convert IntStream to Stream<Integer>
                                    .collect(Collectors.toList()).reversed(); // collect to List<Integer> and reverse the order

        System.out.println(list1);
    }
}
