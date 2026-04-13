import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OccurrenceOfEachWord {

    public static void main(String[] args) {

        String words = "I am learning java stream api in java";

        Map<String, Long> occMap = Arrays.stream(words.split("\\s+"))
                .collect(Collectors.groupingBy(String::new, Collectors.counting()));

        System.out.println(occMap);

    }
}
