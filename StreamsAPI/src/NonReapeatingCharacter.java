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

        String str = "abcabcde";
/*
        String s = Arrays.stream(str.split(""))
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .get();

        System.out.println(s);

 */

        LinkedHashMap<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch)
                                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        Character c = collect.entrySet()
                            .stream().filter(map -> map.getValue() == 1)
                            .map(m -> m.getKey())
                            .findFirst()
                            .get();

        System.out.println(c);


    }
}
