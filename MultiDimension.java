
	public class MultiDimension {
    public static void main(String[] args) {
        int [][]num = {{1,2,3},{2,4,6},{2,6,3}};
        int sum=0; 
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+ " ");
                sum+= num[i][j];
            }
            System.out.println();
 }
 System.out.println("total sum is :"+sum);
}
}