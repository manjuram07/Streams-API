import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonReapeatingCharacter {

    /*
        Given a string, find the first non-repeating character.
        input: "hello world"        input: "abcabcde"
        output: "h"                 output: "d"

     */
    public static void main(String[] args) {

        String str = "hello world";

        Map<Character, Long> collect = str.chars()
                                            .mapToObj(ch -> (char) ch)
                                            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()));

        Optional<Character> characterStream = collect.entrySet()
                                                    .stream().filter(value -> value.getValue() == 1)
                                                    .map(key -> key.getKey()).findFirst();

        System.out.println(characterStream.get());
    }
}
