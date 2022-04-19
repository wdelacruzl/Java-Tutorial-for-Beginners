public class main {
    public static void main(String[] args) {
        byte age = 30; // this is better than int because it takes less space + 30 is < 127
        long viewCount = 3_123_456_789L; // REMEMBER: write _ for , and use an L at the end
        float price = 10.99F; // just like long, use an F at the end
        char letter = 'A'; // only for single characters, string is for multiple. use single '' for this.
        boolean isEligible = false; // either true or false
        System.out.println(age);
    }
}
