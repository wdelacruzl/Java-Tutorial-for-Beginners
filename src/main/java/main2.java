import java.text.NumberFormat;
import java.util.Scanner;

public class main2 { // Mortgage Calculator
    public static void main(String[] args) {
        final byte monthInYear = 12; // create final variables to avoid "magic numbers"
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in); // this is used to define the scanner object
        System.out.println("Principal: ");
        int principal = scanner.nextInt(); // integer is the most appropriate to use in this project since it's up to 2b

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat(); // this is good as a float because interest is going to be a small decimal
        float monthlyInterest = annualInterest / percent / monthInYear;

        System.out.println("Period (Years): ");
        byte periodOfYears = scanner.nextByte(); // Byte is the most appropriate since our number is less than 127.
        int numberOfPayments = periodOfYears * monthInYear;

        double mortgage = principal * (monthlyInterest * Math.pow((1+monthlyInterest),numberOfPayments))
                  / (Math.pow((1+monthlyInterest), numberOfPayments)-1);
        String mortgageFormatted =NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage:  " + mortgageFormatted); // this will allow it to change format into currency


    }
}
