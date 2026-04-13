import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighestLength {
    public static void main(String[] args) {

        String words = "I am learning stream api in java";

        Optional<String> first = Arrays.stream(words.split("\\s+"))
                                        .sorted((o1, o2) -> Integer.compare(o2.length(), o1.length()))
                                        .skip(1)
                                        .findFirst();

        System.out.println(first.get());


    }
}
