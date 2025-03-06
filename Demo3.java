import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int array[] = {999, 999, 999};  
        int n = array.length;

        boolean carry = true;
        for (int i = n - 1; i >= 0; i--) {
            if (carry) {
                array[i] += 1;
                if (array[i] == 100) {
                    array[i] = 0;
                    carry = true;
                } else {
                    carry = false;
                }
            }
        }

        // If there's still a carry after the loop, we need to expand the array
        if (carry) {
            int[] newArray = new int[n + 1];
            newArray[0] = 1;  // Set the first element to 1 (e.g., 100, 0, 0)
            System.arraycopy(array, 0, newArray, 1, n);  // Copy the rest of the array
            array = newArray;
        }

        // Print the result
        System.out.println(Arrays.toString(array));
    }
}