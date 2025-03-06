public class Multiple{
	public static void main(String[] args) {
		int array[] = {1,2,3,4,12,8};
		int target = 4;
		int countMultiple=0;
		for(int i =0; i<array.length;i++){
			if(array[i]%target==0){
				countMultiple++;
			}
		}
		System.out.println("count of multiple of target value:" +countMultiple);

	}
}