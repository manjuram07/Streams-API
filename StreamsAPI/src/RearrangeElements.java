import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RearrangeElements {

    /*
         Given an array of integers, rearrange the elements to form the highest/lowest possible number.
         For example, given [1,2,3,4,5]
         output: 54321/12345
     */
    public static void main(String[] args) {

        Stream<Integer> boxed = IntStream.of(1, 2, 3)
                .boxed();// → Stream<Integer>

        System.out.println(boxed.toList());


        Stream<Integer> stream = IntStream.of(1, 2, 3)
                .mapToObj(x -> x);// → Stream<Integer> (via autoboxing)

        System.out.println(stream.toList());
    }
}
