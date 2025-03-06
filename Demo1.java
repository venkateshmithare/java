import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int array[] = {99,99,99};  
        int n = array.length;

        
        boolean carry = true;
        for (int i = n - 1; i >= 0; i--) {
            array[i] += 1;
            if (array[i] == 10) {
                array[i] = 0;
                carry = true; 
            } else {
                carry = false;
                break; 
            }
        }

       
        if (carry == true) {
            array[0] = 10;
        }

      
        System.out.println(Arrays.toString(array));
    }
}
