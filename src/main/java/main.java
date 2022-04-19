
public class main {
    public static void main(String[] args) {
        // Implicit Casting
        // byte can be converted to short can be converted to> int > long
        short x=1;
        int y = x + 2;
        System.out.println(y);
        // byte > short > int > long > float > double
        double x = 1.1;
        double y = x + 2; // 2 turns into 2.0. this will be equal to 3.1 when printed and ran
        // Explicit Casting: can only happen between compatible types
        double x = 1.1;
        double y = (int)x + 2;

    }
    }

