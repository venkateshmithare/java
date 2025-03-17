public class ProductDetail{
	static String[] name={null,null,null,null};
	static int index=0;
	public static void productname(String product){
		if(name!=null){
			if(index<name.length){
				name[index]=product;
				index++;
				System.out.println("name add to the product succesfully");
			}else{
				System.out.println("product list is full cant be added anymore furthe");
		}
			}else{
				System.out.println("product list is null");
			

		}
	}
	public static void display(){
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}

	}
	public static void retrive(){
		String target="venkatesh";
		for(int i=0;i<name.length;i++){
			if(target==name[i]){
				System.out.println("target is present ");
				return;

			}else {
				System.out.println("target is not present ");
				return;
			}
		}
	}
}