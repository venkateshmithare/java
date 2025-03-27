public class GstCal{
	static String name;
	static  double price;
	static double total_price;
	public static boolean calGst(String productname,double productprice){
		name=productname;
		price=productprice;
		total_price= price+Gst.gst(price);
		return true;
	}
		public static void calGst(){
		System.out.println(name);
		System.out.println(price);
		System.out.println(total_price);
		}

}