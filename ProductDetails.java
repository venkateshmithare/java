public class ProductDetails{
	public static void main(String args[]){
		String name ="laptop";
	    int price =180000;
	    byte discount =50;
	    String brand_name="asus";
	    int delivery_fee=100;
	    int platform_fee=150;
	    System.out.println("product name:"+price);
	    System.out.println("product discount:"+discount);
	    System.out.println("brand name:"+brand_name);
	    System.out.println("product delivery fee:"+delivery_fee);
	    System.out.println("product platform fee:"+platform_fee);
	    System.out.println("Total Payable Amount: " + ((price - (price * discount) / 100) + delivery_fee + platform_fee));
	    System.out.println("Actual Payable Amount: " + price);



	}
}