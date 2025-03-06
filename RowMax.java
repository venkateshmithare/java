public class RowMax{
	public static void main(String[] args) {
		int [][] Array={{5,8,9},{8,7,5},{3,8,7}};
		int number=Array[0][0];
		for(int i=0;i<Array.length;i++){
			number=Array[i][0];
			for(int j=0;j<Array.length;j++){
				if(Array[i][j]>number){
					number=Array[i][j];
				}
			}
System.out.println("max number in a row is:"+number);
		}

	}
	
}