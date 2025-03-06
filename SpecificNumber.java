public class SpecificNumber{
    public static void main(String[] args) {
        int[][] matrix = {{1, 90, 5},{5, 2, 7},{7, 9, 1} };
        int row = 2; 
        int sum = 0;

        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }

        System.out.println("Sum of specific row is:" + row + " is: "+sum);
}
}