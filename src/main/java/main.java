import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Math Class
      //   int result = (int) (Math.random() * 100); // this will generate a random number we have to use explicit casting
        // System.out.println(result);

        // NumberFormat currency = NumberFormat.getCurrencyInstance();
       // String result = currency.format(1234567.891); // $1,234,567.89
        // System.out.println(result);

        //NumberFormat percent = NumberFormat.getPercentInstance();
        //String result = percent.format(0.1); // 10%
        //System.out.println(result);

        // Reading input: (we use the Scanner class for this)
       // Scanner scanner = new Scanner(System.in);
        //System.out.print("Name: ");
        //String name = scanner.nextLine().trim();
       // System.out.println("You are "  +  name);

        //Comparison Operators
        // int x = 1;
        //  int y = 1;
        //System.out.println(x==y); //this expression runs true.
        // other expressions are != (not equal) if we run that expression it will say false ,
        // <= (less than or equal to),
        // >= greater than or equal to

        //Logical Operators
        int temperature = 25;
        boolean isWarm = temperature >20 && temperature< 30; // && represent and
        //System.out.println(isWarm); // if temperature is less than 20 or more than 30 it will run false

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;                       // that ! is like a no
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || represents or

    }
    }

