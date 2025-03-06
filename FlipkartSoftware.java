public class FlipkartSoftware{
	static String mobils  ;
	static String headphones;
	static String watches;
	static String shoes;
	static String mouse;

	public static void main(String[] args) {
		venkatesh();
	}
	public static void venkatesh(){
		FlipkartSoftware.mobils="samsung,iphone,vivo";
		FlipkartSoftware.headphones="redgear,jbl,sony";
		FlipkartSoftware.watches="sonata,casio,fasttrach";
		FlipkartSoftware.shoes="puma,adidas,HRX";
		FlipkartSoftware.mouse="redgear,Evofox,hp";
		System.out.println("mobils:"+mobils);
		System.out.println("headphones:"+headphones);
		System.out.println("watches:"+watches);
		System.out.println("shoes:"+shoes);
		System.out.println("mouse:"+mouse);
	}
}