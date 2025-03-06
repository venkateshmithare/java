public class Contact1{
	public static void main(String[] args) {
		long contactnumber=6364208124l;
		long temp = contactnumber;
		while(contactnumber!=0)
		{
			long digit = contactnumber%10;
			//System.out.println(digit);
			contactnumber=contactnumber/10;
			if(digit==1){
				System.out.println("hi");
			}
			else if(digit==4) {
				System.out.println("bye");

			}
			else if(digit==3){
				System.out.println("movie");
			}
			
			
			else if(digit==6){
				System.out.println("hello");

			}
			else if(digit==2){
				System.out.println("king");
			}
			else if(digit==0){
				System.out.println("virat");

			}
			
			else if(digit==2){
				System.out.println("dhoni");
			}
			
				}
		}


	}
	
