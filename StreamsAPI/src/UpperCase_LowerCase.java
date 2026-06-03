import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase_LowerCase {
    public static void main(String[] args) {

        String str = "ManjuRaam";

        // uppercase
        String upperCase = str.chars()
                .mapToObj(ch -> String.valueOf((char) Character.toUpperCase(ch)))
                .collect(Collectors.joining());

        System.out.println(upperCase);

        // lowercase
        String lowerCase = str.chars()
                .mapToObj(ch -> String.valueOf((char) Character.toLowerCase(ch)))
                .collect(Collectors.joining());

        System.out.println(lowerCase);

    }
}
