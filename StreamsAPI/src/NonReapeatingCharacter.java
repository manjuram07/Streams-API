import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){

           if (entry.getValue() == 1) {
               System.out.println(entry.getKey());
               break;
           }
        }
    }
}
