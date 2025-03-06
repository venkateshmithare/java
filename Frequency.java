public class Frequency {
    public static void main(String[] args) {
        int[] lens = {2,2,3,4,5,6,6,3};
        int count=1;
        int n=0;
        for(int i=0;i<lens.length;i++){
            for(int j=i+1;j<lens.length;j++){
                if(lens[i]==lens[j]){
                    count++;
                    n=lens[i];
                }

            }
            

        }
        if(n!=0){
            System.out.println(n+"is repeated :"+count);
        }
}
}