import java.text.NumberFormat;
import java.util.Scanner;

public class main2 { // Mortgage Calculator
    public static void main(String[] args) {
        final byte monthInYear = 12; // create final variables to avoid "magic numbers"
        final byte percent = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in); // this is used to define the scanner object

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt(); // integer is the most appropriate to use in this project since it's up to 2b
            if (principal >= 1000 && principal <= 1_000_000)
            break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat(); // this is good as a float because interest is going to be a small decimal
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / percent / monthInYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while (true) {
            System.out.println("Period (Years): ");
            byte periodOfYears = scanner.nextByte();// Byte is the most appropriate since our number is less than 127.
            if (periodOfYears >=1  && periodOfYears <=30) {
                numberOfPayments = periodOfYears * monthInYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage = principal * (monthlyInterest * Math.pow((1+monthlyInterest),numberOfPayments))
                  / (Math.pow((1+monthlyInterest), numberOfPayments)-1);
        String mortgageFormatted =NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage:  " + mortgageFormatted); // this will allow it to change format into currency


    }
}
