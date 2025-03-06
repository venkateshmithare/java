public class Target1{
	public static void main(String[] args) {
		int array[]={2,5,8,};
		int target = 15;
		int sum =0;
		for(int i=0;i<array.length;i++){
			sum += array[i];
			}
				System.out.println("sum is "+sum);
			if(sum == target){
				System.out.println("target value is  equal to sum of all array");
			}
			else {
				System.out.println("target value is not equal to sum of all array");
			}
			
		}
		

	}
