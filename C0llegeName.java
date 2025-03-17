public class C0llegeName{
	static String[] college={null,null,null};
	static int index=0;
public static void collegename(String collegee ){
	if(college!=null){
		if(index<college.length){
				college[index]=collegee;
				index++;
			System.out.println("college  added succesfully");
		}else{
			System.out.println("list is full");
		}
		}else{
			System.out.println("list is null");
		}
	}

		public static void collegedisplay(){
			for(int i=0;i<college.length;i++){
				System.out.println(college[i]);
			}
		}
		public static void search(){
		String target="AGMR";
		for(int i=0;i<college.length;i++){
			if(target==college[i]){
				System.out.println("target is present ");
				return;

			}else {
				System.out.println("target is not present ");
				return;
			}
		}
	}

}