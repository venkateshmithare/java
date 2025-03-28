public class Palindrome {
    public static void main(String[] args) {
        int num = 151; 
        int original = num;
        int revNum = 0;

        while (num > 0) {
            int digit = num % 10; 
            revNum = revNum * 10 + digit; 
            num /= 10; 
        }

        if (original == revNum) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
 }
}