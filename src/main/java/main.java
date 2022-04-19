import java.text.NumberFormat;

public class main {
    public static void main(String[] args) {
        // Math Class
      //   int result = (int) (Math.random() * 100); // this will generate a random number we have to use explicit casting
        // System.out.println(result);

        // NumberFormat currency = NumberFormat.getCurrencyInstance();
       // String result = currency.format(1234567.891); // $1,234,567.89
        // System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.1); // 10%
        System.out.println(result);


    }
    }

