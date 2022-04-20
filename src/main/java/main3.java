import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        // Exercise: FizzBuzz
        Scanner scanner = new Scanner(System.in); // this is used to read data from the terminal
        System.out.println("Number: ");

        int Number = scanner.nextInt();
        if (Number % 3 == 0 && Number % 5 ==0) // TIP: push the most specific conditions to the top
            System.out.println("FizzBuzz");
        else if (Number % 5 ==0) // if this was at the top the above condition would have been ignored
            System.out.println("Fizz");

        else if (Number % 3 ==0)
            System.out.println("Buzz");

        else System.out.println(Number);



    }
}
