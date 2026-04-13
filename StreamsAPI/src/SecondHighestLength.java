import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestLength {

    public static void main(String[] args) {

        String words = "I am learning stream api in java";

        Optional<String> first = Arrays.stream(words.split("\\s+"))
                .sorted((o1, o2) -> Integer.compare(o2.length(), o1.length()))
                .skip(1)
                .findFirst();

        first.ifPresent(word -> System.out.println(word.length()));

    }
}
