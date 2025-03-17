public class Product1{
	public static void main(String[] args) {

	 int[][]products={{0,2,3},{100,200,300}};
		for(int i=0;i<products.length-1;i++){
			for(int j=0;j<products[i].length;j++){
				System.out.println(products[0][j]+":"+products[1][j]);
			}
		}
	}
}

