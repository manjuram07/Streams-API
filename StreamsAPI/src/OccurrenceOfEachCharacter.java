import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfEachCharacter {

    /*
        count the occurrence of each character in a given string.
        input: "hello world"
        output:
        {p=2, s=4, i=4, M=1}
     */
    public static void main(String[] args) {

        String str = "Mississippi";

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(collect);

    }
}
