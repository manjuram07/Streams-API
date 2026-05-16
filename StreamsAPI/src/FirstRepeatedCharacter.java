import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstRepeatedCharacter {

    /*
    Given a string, find the first repeated character in it.
        input: "hello world"
        output: "l"
     */
    public static void main(String[] args) {

        String words = "hello world";

        LinkedHashMap<Character, Long> collect = words.chars().mapToObj(word -> (char) word)
                .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()));

        Character ch = collect.entrySet().stream().filter(value -> value.getValue() > 1)
                .map(key -> key.getKey()).findFirst().get();

        System.out.println(ch);


    }
}
