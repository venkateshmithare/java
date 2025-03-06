public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {999,999,999};
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i]; 
        }

        int number = Integer.parseInt(result);
        int add =1;
        int sum=number +add;
        System.out.println(sum);
}
}