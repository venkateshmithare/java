public class SpecificTriangular{
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 4},
            {4, 1, 8},
            {6, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            
            
            for (int j = 0; j <= i; j++) {
                sum += matrix[i][j];
            
            }
        }
        System.out.println("Sum of row in lower trangular matrix is: "+sum);
}
}