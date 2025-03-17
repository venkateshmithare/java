public class Venkatesh2 {
    public static void movieInfo(String title) {
        System.out.println("Title: " + title);
    }

    public static void movieInfo(String title, int movieId) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId);
    }

    public static void movieInfo(String title, String director) {
        System.out.println("Title: " + title + " : Director: " + director);
    }

    public static void movieInfo(String title, String director, String genre) {
        System.out.println("Title: " + title + " : Director: " + director + " : Genre: " + genre);
    }

    public static void movieInfo(String title, int movieId, double rating) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Rating: " + rating);
    }

    public static void movieInfo(String title, boolean isAwardWinning) {
        System.out.println("Title: " + title + " : Award Winning: " + isAwardWinning);
    }

    public static void movieInfo(String title, int movieId, int year) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Year: " + year);
    }

    public static void movieInfo(String title, String director, int year) {
        System.out.println("Title: " + title + " : Director: " + director + " : Year: " + year);
    }

    public static void movieInfo(String title, String genre, double boxOffice) {
        System.out.println("Title: " + title + " : Genre: " + genre + " : Box Office: " + boxOffice);
    }

    public static void movieInfo(String title, String director, boolean isAwardWinning) {
        System.out.println("Title: " + title + " : Director: " + director + " : Award Winning: " + isAwardWinning);
    }

    public static void movieInfo(String title, int movieId, String director, int year) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Director: " + director + " : Year: " + year);
    }

    public static void movieInfo(String title, String genre, boolean isAwardWinning, double rating) {
        System.out.println("Title: " + title + " : Genre: " + genre + " : Award Winning: " + isAwardWinning + " : Rating: " + rating);
    }

    public static void movieInfo(String title, int movieId, int year, double budget) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Year: " + year + " : Budget: " + budget);
    }

    public static void movieInfo(String title, String director, String genre, double rating) {
        System.out.println("Title: " + title + " : Director: " + director + " : Genre: " + genre + " : Rating: " + rating);
    }

    public static void movieInfo(String title, int movieId, boolean isAwardWinning, double rating) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Award Winning: " + isAwardWinning + " : Rating: " + rating);
    }

    public static void movieInfo(String title, String director, int year, double rating) {
        System.out.println("Title: " + title + " : Director: " + director + " : Year: " + year + " : Rating: " + rating);
    }

    public static void movieInfo(String title, int movieId, String director, boolean isAwardWinning, double boxOffice) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Director: " + director + " : Award Winning: " + isAwardWinning + " : Box Office: " + boxOffice);
    }

    public static void movieInfo(String title, String genre, int year, double rating, boolean isAwardWinning) {
        System.out.println("Title: " + title + " : Genre: " + genre + " : Year: " + year + " : Rating: " + rating + " : Award Winning: " + isAwardWinning);
    }

    public static void movieInfo(String title, int movieId, String director, String genre, int year, double boxOffice, boolean isAwardWinning, int runtime) {
        System.out.println("Title: " + title + " : Movie ID: " + movieId + " : Director: " + director + " : Genre: " + genre + " : Year: " + year + " : Box Office: " + boxOffice + " : Award Winning: " + isAwardWinning + " : Runtime: " + runtime + " minutes");
    }

    public static void movieInfo(String title, String director, String genre, int year, double budget, double boxOffice) {
        System.out.println("Title: " + title + " : Director: " + director + " : Genre: " + genre + " : Year: " + year + " : Budget: " + budget + " : Box Office: " + boxOffice);
    }

    public static void main(String[] args) {
        movieInfo("Inception");
        movieInfo("Inception", 2010);
        movieInfo("Inception", "Christopher Nolan");
        movieInfo("Inception", "Christopher Nolan", "Sci-Fi");
        movieInfo("Inception", 2010, 8.8);
        movieInfo("Inception", true);
        movieInfo("Inception", 2010, 2010);
        movieInfo("Inception", "Christopher Nolan", 2010);
        movieInfo("Inception", "Sci-Fi", 829.9);
        movieInfo("Inception", "Christopher Nolan", true);
        movieInfo("Inception", 2010, "Christopher Nolan", 2010);
        movieInfo("Inception", "Sci-Fi", true, 8.8);
        movieInfo("Inception", 2010, 2010, 160.0);
        movieInfo("Inception", "Christopher Nolan", "Sci-Fi", 8.8);
        movieInfo("Inception", 2010, true, 8.8);
        movieInfo("Inception", "Christopher Nolan", 2010, 8.8);
        movieInfo("Inception", 2010, "Christopher Nolan", true, 829.9);
        movieInfo("Inception", "Sci-Fi", 2010, 8.8, true);
        movieInfo("Inception", 2010, "Christopher Nolan", "Sci-Fi", 2010, 829.9, true, 148);
        movieInfo("Inception", "Christopher Nolan", "Sci-Fi", 2010, 160.0, 829.9);
    }
}
