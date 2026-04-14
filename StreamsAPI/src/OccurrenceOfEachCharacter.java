import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfEachCharacter {

    /*
        count the occurrence of each character in a given string.
        input: "hello world"
        output:
        h: 1 e: 1 l: 3 o: 2 w: 1 r: 1 d: 1
     */
    public static void main(String[] args) {

        String str = "Mississippi";

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(collect);

    }
}
