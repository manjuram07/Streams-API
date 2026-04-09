import java.util.Arrays;
import java.util.Optional;

public class Main {

    /*
     * Find the word with the highest length in a given string using Stream API.
     * Input: "I am learning stream api in java"
     * Output: "learning"

     */
    public static void main(String[] args) {

        String str = "I am learning stream api in java";

        String[] worrds = str.split("\\s+");

        Optional<String> max = Arrays.stream(worrds)
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        max.ifPresent(System.out::println);


    }
}