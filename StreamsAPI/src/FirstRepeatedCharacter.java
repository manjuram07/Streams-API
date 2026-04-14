import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

    /*
    Given a string, find the first repeated character in it.
        input: "hello world"
        output: "l"
     */
    public static void main(String[] args) {

        String word = "abba";

        // using logic
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<word.length(); i++){
            if (map.containsKey(word.charAt(i))){
                System.out.println(word.charAt(i));
                break;
            }
            map.put(word.charAt(i), 1);
        }

        // Using Set in streams
        Set<Character> seen = new HashSet<>();

        Character character = word.chars()
                            .mapToObj(ch -> (char) ch)
                            .filter(x -> !seen.add(x))
                            .findFirst().orElse(null);

        System.out.println(character);


    }
}
