public class Venkatesh10 {
    public static void gameInfo(String title) {
        System.out.println("Title: " + title);
    }

    public static void gameInfo(String title, int gameId) {
        System.out.println("Title: " + title + " | Game ID: " + gameId);
    }

    public static void gameInfo(String title, String developer) {
        System.out.println("Title: " + title + " | Developer: " + developer);
    }

    public static void gameInfo(String title, String developer, String genre) {
        System.out.println("Title: " + title + " | Developer: " + developer + " | Genre: " + genre);
    }

    public static void gameInfo(String title, int gameId, double rating) {
        System.out.println("Title: " + title + " | Game ID: " + gameId + " | Rating: " + rating);
    }

    public static void gameInfo(String title, boolean isMultiplayer) {
        System.out.println("Title: " + title + " | Multiplayer: " + isMultiplayer);
    }

    public static void gameInfo(String title, int gameId, int year) {
        System.out.println("Title: " + title + " | Game ID: " + gameId + " | Year: " + year);
    }

    public static void gameInfo(String title, String developer, int year) {
        System.out.println("Title: " + title + " | Developer: " + developer + " | Year: " + year);
    }

    public static void gameInfo(String title, String genre, double price) {
        System.out.println("Title: " + title + " | Genre: " + genre + " | Price: " + price);
    }

    public static void gameInfo(String title, String developer, boolean isMultiplayer) {
        System.out.println("Title: " + title + " | Developer: " + developer + " | Multiplayer: " + isMultiplayer);
    }

    public static void gameInfo(String title, int gameId, String developer, int year) {
        System.out.println("Title: " + title + " | Game ID: " + gameId + " | Developer: " + developer + " | Year: " + year);
    }

    public static void gameInfo(String title, String genre, boolean isMultiplayer, double rating) {
        System.out.println("Title: " + title + " | Genre: " + genre + " | Multiplayer: " + isMultiplayer + " | Rating: " + rating);
    }

    public static void gameInfo(String title, int gameId, int year, double price) {
        System.out.println("Title: " + title + " | Game ID: " + gameId + " | Year: " + year + " | Price: " + price);
    }

    public static void gameInfo(String title, String developer, String genre, double rating) {
        System.out.println("Title: " + title + " | Developer: " + developer + " | Genre: " + genre + " | Rating: " + rating);
    }

    public static void gameInfo(String title, int gameId, boolean isMultiplayer, double rating) {
        System.out.println("Title: " + title + " | Game ID: " + gameId + " | Multiplayer: " + isMultiplayer + " | Rating: " + rating);
    }

    public static void gameInfo(String title, String developer, int year, double rating) {
        System.out.println("Title: " + title + " | Developer: " + developer + " | Year: " + year + " | Rating: " + rating);
    }

    public static void gameInfo(String title, int gameId, String developer, boolean isMultiplayer, double price) {
        System.out.println("Title: " + title + " | Game ID: " + gameId + " | Developer: " + developer + " | Multiplayer: " + isMultiplayer + " | Price: " + price);
    }

    public static void gameInfo(String title, String genre, int year, double rating, boolean isMultiplayer) {
        System.out.println("Title: " + title + " | Genre: " + genre + " | Year: " + year + " | Rating: " + rating + " | Multiplayer: " + isMultiplayer);
    }

    public static void main(String[] args) {
        gameInfo("Cyberpunk 2077");
        gameInfo("Cyberpunk 2077", 101);
        gameInfo("Cyberpunk 2077", "CD Projekt Red");
        gameInfo("Cyberpunk 2077", "CD Projekt Red", "RPG");
        gameInfo("Cyberpunk 2077", 101, 4.5);
        gameInfo("Cyberpunk 2077", true);
        gameInfo("Cyberpunk 2077", 101, 2020);
        gameInfo("Cyberpunk 2077", "CD Projekt Red", 2020);
        gameInfo("Cyberpunk 2077", "RPG", 59.99);
        gameInfo("Cyberpunk 2077", "CD Projekt Red", false);
        gameInfo("Cyberpunk 2077", 101, "CD Projekt Red", 2020);
        gameInfo("Cyberpunk 2077", "RPG", true, 4.7);
        gameInfo("Cyberpunk 2077", 101, 2020, 59.99);
        gameInfo("Cyberpunk 2077", "CD Projekt Red", "RPG", 4.8);
        gameInfo("Cyberpunk 2077", 101, true, 4.6);
        gameInfo("Cyberpunk 2077", "CD Projekt Red", 2020, 4.9);
        gameInfo("Cyberpunk 2077", 101, "CD Projekt Red", true, 59.99);
        gameInfo("Cyberpunk 2077", "RPG", 2020, 4.5, true);
    }
}
