import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
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

        //Logical Operator
       // int temperature = 25;
        ///boolean isWarm = temperature >20 && temperature< 30; // && represent and
        //System.out.println(isWarm); // if temperature is less than 20 or more than 30 it will run false

        //boolean hasHighIncome = true;
        //boolean hasGoodCredit = true;
        //boolean hasCriminalRecord = false;                       // that ! is like a no
        //boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // || represents or

        //If Statements
       //  int temperature = 12;
      //   if (temperature > 30) { // we need to code block this so that it doesn't mix with the other if statement
         //    System.out.println("It's a hot day"); // {} are only required if we have multiple statements
        //   System.out.println("Drink water!");
       //  }
        // else if (temperature > 20)
         //   System.out.println("Beautiful day!");
        // else
        //     System.out.println("Cold day!");

        // Simplifying If Statements
      //   int income = 120_000;
      //   if hasHighIncome = income > 100_000;

      //  int income = 120_000;
      //  String className = "Economy";
      //  if (income > 100_000) // if income is more than 100,000 then they are first class/
        //        className = "First";
       // System.out.println(className);
        // or
       //  int income = 90_000;
       //  String className = income > 100_000 ? "First" : "Economy";
       // System.out.println(className);

        // Switch Statements
        //String role = "admin";
       // switch (role){
        //    case "admin":
        //        System.out.println("You are an Admin");
          //      break;
            //case "moderator":
              //  System.out.println("You are a Moderator");
                //break;
            //default:
              //  System.out.println("You are a guest");

        // For Loops
         for (int i = 0; i < 5; i++) // this will make your message repeat 5 times
             System.out.println("Hello World"); // If you know how many times to repeat, this is better
         //OR
         int i = 0; // If you don't know how many times to repeat, this is better
         while (i <0) {
             System.out.println("Hello World");
             i++;



         }
        }
    }


