public class RowSum{
    public static void main(String[] args) {
        int [][] num = {{1, 2, 3}, {2, 4, 6}, {2, 6, 3}};
        int totalSum = 0;
        for (int i = 0; i < num.length; i++) {
            int rowSum = 0; 
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
                rowSum += num[i][j];  
            }
            totalSum += rowSum;  
            System.out.println("Row Sum: " + rowSum);
        }

       
    }
}