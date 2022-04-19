import java.util.Arrays;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // first way to set up arrays
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {2, 4, 5, 8, 6}; // second way to set up arrays
        System.out.println(numbers2.length);

        System.out.println(Arrays.toString(numbers2));
        // CONSTANTS: Add "final" at the beginning so that the value of a variable stays the same.
    }
    }

