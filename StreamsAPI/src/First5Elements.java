import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class First5Elements {

    public static void main(String[] args) {

        List<Integer> list  = List.of(1,2,3,4,5,6,-1,7,8,9);

        Stream<Integer> limit = list.stream().limit(5);

        limit.forEach(System.out::println);

        boolean b = list.stream()
                .anyMatch(num -> num.equals(30));
        System.out.println(b);

        // Check if all numbers are positive.
        boolean flag = list.stream()
                .allMatch(num -> num > 0);
        System.out.println(flag);

        // Check if any number is negative.
        boolean flag1 = list.stream()
                                .anyMatch(n -> n<0);
        System.out.println(flag1);


        // Check if none of the strings are empty.
        List<String> words = List.of("manju", "ram", "krish");
        boolean isEmpty = words.stream()
                .noneMatch(String::isEmpty);

        System.out.println(isEmpty);

        // Find whether a string starts with a specific character
        String name = "manjuram";

        boolean b1 = name.chars()
                .findFirst()
                .stream()
                .mapToObj(ch -> (char) ch)
                .anyMatch(ch -> ch == 's');

//        char ch = (char) first.getAsInt();

        System.out.println(b1);

    }
}
