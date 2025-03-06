public class Contact {
    public static void main(String[] args) {
        long contact = 6364208124L;
        String contactStr = contact + "";

        for (int i = 0; i < contactStr.length(); i--) {
            System.out.println(contactStr.charAt(i));
        }
    }
}
