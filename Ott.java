``public class Ott{
	static String[] ottnames={null,null,null};
	static int index=0;
	public static void ottplatform(String otts){
		if(ottnames!=null){
			if(index<ottnames.length){
				ottnames[index]=otts;
				index++;
				System.out.println("ott added succesfully");
			}else{
				System.out.println(" list is full cant be added anymore furthe");
			}
		}
			else{
				
				System.out.println("ott list is null");
			}
	}
	public static void search(){
		String target="amazonprime";
		for(int i=0;i<ottnames.length;i++){
			if(target==ottnames[i]){
				System.out.println("ottapplication  is present ");
				return;

			}else {
				System.out.println("ottapplication is not present ");
				return;
			}
		}
	}
	public static void display(){
		for(int i=0;i<ottnames.length;i++){
			System.out.println(ottnames[i]);
		}
		
	}
	
}
