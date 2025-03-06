public class Palindromes{
public static void main(String[] args) {
			palindrome();
			
		}

            public static void palindrome(){
			int number=121;
			int originalnumber=number;
			int reversenumber=0;
			while(number!=0){
				int digit = number%10;
				reversenumber = reversenumber*10 + digit;
				number=number/10;
			}
				if(reversenumber== originalnumber){
					System.out.println("The number is Palindrome");
				}
				else {
					System.out.println("The number is not  a Palindrome");

				}

			}
			
			
			}