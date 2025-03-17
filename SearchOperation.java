public class SearchOperation{
	static String[] cricket={null,null,null};
	static int index=0;
public static void cricketteam(String venkatesh ){
	if(cricket!=null){
		if(index<cricket.length){
				cricket[index]=venkatesh;
				index++;
			System.out.println("cricket team added succesfully");
		}else{
			System.out.println("list is full");
		}
		}else{
			System.out.println("list is null");
		}
	}

		public static void cricketdisplay(){
			for(int i=0;i<cricket.length;i++){
				System.out.println(cricket[i]);
			}
		}
		public static void search(){
		String target="RCB";
		for(int i=0;i<cricket.length;i++){
			if(target==cricket[i]){
				System.out.println("target is present ");
				return;

			}else {
				System.out.println("target is not present ");
				return;
			}
		}
	}

}
	

