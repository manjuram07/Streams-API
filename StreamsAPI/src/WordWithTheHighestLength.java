import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WordWithTheHighestLength {

    /*
     * Find the word with the highest length in a given string using Stream API.
     * Input: "I am learning stream api in java"
     * Output: "learning"

     */
    public static void main(String[] args) {

        String str = "I am learning stream api in java";

        int maxLength = Arrays.stream(str.split("\\s+"))
                .mapToInt(String::length)
                .max()
                .getAsInt();

        System.out.println(maxLength);
    }
}