public class EvenOdd1{
	public static void main(String[] args) {
		int array[]={2,1,5,4,6,8};
		int evencount=0;
		int oddcount=0;
		 for(int i =0;i<array.length;i++){
		 	if(array[i]%2==0){
		 		evencount++;
		 	}
		 	else{
		 		oddcount++;
		 	}

		 }
		 System.out.println("even number :"+evencount);
		 System.out.println("odd number :"+oddcount);

		}
	
}