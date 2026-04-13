import java.util.Arrays;
import java.util.stream.Stream;

public class NumberOfVowels {

    /*
            Find the words with a specified number of vowels
            NoOfVowels: 2

            input: "I am learning java stream api in java"
            output: stream, API, java

    */
    public static void main(String[] args) {

        String words = "I am learning stream api in java";
        int noOfVowels = 2;

        // using general logic

        for (String word : words.split("\\s+")) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    count++;
                }
            }
            if (count == noOfVowels) {
                System.out.println(word);
            }
        }

        // using stream API

        Stream<String> stringStream = Arrays.stream(words.split("\\s+"))
                                            .filter(word -> word.chars()
                                                                        .filter(ch -> ch == 'a' ||
                                                                                         ch == 'e' ||
                                                                                         ch == 'i' ||
                                                                                         ch == 'o' ||
                                                                                         ch == 'u')
                                                                        .count() == noOfVowels);

        stringStream.forEach(System.out::println);

    }
}
