public class Demo2 {
    public static void main(String[] args) {
        int[] digits = {99,99,99}; 

        
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  
                break;
            }
            digits[i] = 0;
        }

        
        if (digits[0] == 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; 
            digits = newDigits;
        }

        for (int num : digits) {
            System.out.print(num + " ");
            }
        }   

}