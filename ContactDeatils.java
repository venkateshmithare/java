public class ContactDeatils{
	static long[] numbers ={0,0,0,0,0};
	static int index=0;
		public static void ContactList(long number){
		if(numbers!=null){
			if(index<numbers.length){
				numbers[index]=number;
				index++;
				System.out.println("number adder succesfully");
			}else{
				System.out.println("number cannot be added in the list ");
			}}else {
				System.out.println("index is full ");
		}


		}
	}



