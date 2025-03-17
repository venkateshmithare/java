public class Venkatesh3 {
    public static void bookInfo(String title) {
        System.out.println("Title: " + title);
    }

    public static void bookInfo(String title, int bookId) {
        System.out.println("Title: " + title + " : Book ID: " + bookId);
    }

    public static void bookInfo(String title, String author) {
        System.out.println("Title: " + title + " : Author: " + author);
    }

    public static void bookInfo(String title, String author, String genre) {
        System.out.println("Title: " + title + " : Author: " + author + " : Genre: " + genre);
    }

    public static void bookInfo(String title, int bookId, double rating) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Rating: " + rating);
    }

    public static void bookInfo(String title, boolean isBestSeller) {
        System.out.println("Title: " + title + " : Best Seller: " + isBestSeller);
    }

    public static void bookInfo(String title, int bookId, int year) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Year: " + year);
    }

    public static void bookInfo(String title, String author, int year) {
        System.out.println("Title: " + title + " : Author: " + author + " : Year: " + year);
    }

    public static void bookInfo(String title, String genre, double price) {
        System.out.println("Title: " + title + " : Genre: " + genre + " : Price: " + price);
    }

    public static void bookInfo(String title, String author, boolean isBestSeller) {
        System.out.println("Title: " + title + " : Author: " + author + " : Best Seller: " + isBestSeller);
    }

    public static void bookInfo(String title, int bookId, String author, int year) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Author: " + author + " : Year: " + year);
    }

    public static void bookInfo(String title, String genre, boolean isBestSeller, double rating) {
        System.out.println("Title: " + title + " : Genre: " + genre + " : Best Seller: " + isBestSeller + " : Rating: " + rating);
    }

    public static void bookInfo(String title, int bookId, int year, double price) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Year: " + year + " : Price: " + price);
    }

    public static void bookInfo(String title, String author, String genre, double rating) {
        System.out.println("Title: " + title + " : Author: " + author + " : Genre: " + genre + " : Rating: " + rating);
    }

    public static void bookInfo(String title, int bookId, boolean isBestSeller, double rating) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Best Seller: " + isBestSeller + " : Rating: " + rating);
    }

    public static void bookInfo(String title, String author, int year, double rating) {
        System.out.println("Title: " + title + " : Author: " + author + " : Year: " + year + " : Rating: " + rating);
    }

    public static void bookInfo(String title, int bookId, String author, boolean isBestSeller, double price) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Author: " + author + " : Best Seller: " + isBestSeller + " : Price: " + price);
    }

    public static void bookInfo(String title, String genre, int year, double rating, boolean isBestSeller) {
        System.out.println("Title: " + title + " : Genre: " + genre + " : Year: " + year + " : Rating: " + rating + " : Best Seller: " + isBestSeller);
    }

    public static void bookInfo(String title, int bookId, String author, String genre, int year, double price, boolean isBestSeller, int pages) {
        System.out.println("Title: " + title + " : Book ID: " + bookId + " : Author: " + author + " : Genre: " + genre + " : Year: " + year + " : Price: " + price + " : Best Seller: " + isBestSeller + " : Pages: " + pages);
    }

    public static void bookInfo(String title, String author, String genre, int year, double price, double rating) {
        System.out.println("Title: " + title + " : Author: " + author + " : Genre: " + genre + " : Year: " + year + " : Price: " + price + " : Rating: " + rating);
    }

    public static void main(String[] args) {
        bookInfo("The Hobbit");
        bookInfo("The Hobbit", 12345);
        bookInfo("The Hobbit", "J.R.R. Tolkien");
        bookInfo("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        bookInfo("The Hobbit", 12345, 4.8);
        bookInfo("The Hobbit", true);
        bookInfo("The Hobbit", 12345, 1937);
        bookInfo("The Hobbit", "J.R.R. Tolkien", 1937);
        bookInfo("The Hobbit", "Fantasy", 15.99);
        bookInfo("The Hobbit", "J.R.R. Tolkien", true);
        bookInfo("The Hobbit", 12345, "J.R.R. Tolkien", 1937);
        bookInfo("The Hobbit", "Fantasy", true, 4.8);
        bookInfo("The Hobbit", 12345, 1937, 15.99);
        bookInfo("The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.8);
        bookInfo("The Hobbit", 12345, true, 4.8);
        bookInfo("The Hobbit", "J.R.R. Tolkien", 1937, 4.8);
        bookInfo("The Hobbit", 12345, "J.R.R. Tolkien", true, 15.99);
        bookInfo("The Hobbit", "Fantasy", 1937, 4.8, true);
        bookInfo("The Hobbit", 12345, "J.R.R. Tolkien", "Fantasy", 1937, 15.99, true, 310);
        bookInfo("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, 15.99, 4.8);
    }
}
