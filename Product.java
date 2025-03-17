public class Product{
	static String[] name={null,null,null,null};
	static int index=0;
	public static void productname(){
		if(name!=null){
			if(index<name.length){
				name[index]=name;
				index++;
				System.out.println("name add to the product succesfully");
			}else{
				System.out.println("product list is full cant be added anymore furthe");

			}else{
				System.out.println("product list is null");
			}

		}
	}
}