public class ClothesBrand{
	static String[] cloths={null,null,null};
	static int index=0;
public static void clothsname(String clothss ){
	if(cloths!=null){
		if(index<cloths.length){
				cloths[index]=clothss;
				index++;
			System.out.println("cloths  added succesfully");
		}else{
			System.out.println("list is full");
		}
		}else{
			System.out.println("list is null");
		}
	}

		public static void clothdisplay(){
			for(int i=0;i<cloths.length;i++){
				System.out.println(cloths[i]);
			}
		}
		public static void search(){
		String target="puma";
		for(int i=0;i<cloths.length;i++){
			if(target==cloths[i]){
				System.out.println("target is present ");
				return;

			}else {
				System.out.println("target is not present ");
				return;
			}
		}
	}

}