import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "dabcadefg";

        Arrays.stream(str.split(""))
                .distinct()
                .forEach(System.out::print);

        // 🔥 Better Approach (Recommended)

        String result = str.chars()                                // IntStream
                            .mapToObj(c -> (char) c)            // IntStream
                            .distinct()                            // Remove duplicates
                            .map(String::valueOf)                   // Convert to String
                            .collect(Collectors.joining());         // Join back

        System.out.println(result);

    }
}
