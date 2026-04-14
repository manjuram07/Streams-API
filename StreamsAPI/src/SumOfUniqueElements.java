import java.util.Arrays;

public class SumOfUniqueElements {

    /*
Given an integer array nums, return the sum of all the unique elements of nums.
            input: nums = [1,6,7,8,1,1,8,8,7]
            output: 22
     */
    public static void main(String[] args) {

        int[] numbers = {1,6,7,8,1,1,8,8,7};

        int sum = Arrays.stream(numbers)
                .distinct()
                .sum();

        System.out.println(sum);

    }
}
