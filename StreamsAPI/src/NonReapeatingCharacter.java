import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReapeatingCharacter {

    /*
        Given a string, find the first non-repeating character.
        input: "hello world"
        output: "h"

        input: "abcabcde"
        output: "d"
     */
    public static void main(String[] args) {

        String str = "hello world";

        String s = Arrays.stream(str.split(""))
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .get();

        System.out.println(s);


    }
}
