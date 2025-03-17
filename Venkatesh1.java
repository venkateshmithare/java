public class Venkatesh1 {
    public static void gameList(String name) {
        System.out.println("name: " + name);
    }

    public static void gameList(String name, int gameid) {
        System.out.println("name: " + name + " gameid: " + gameid);
    }

    public static void gameList(String name, String username) {
        System.out.println("name: " + name + " username: " + username);
    }

    public static void gameList(String name, String username, String userrank) {
        System.out.println("name: " + name + " username: " + username + " userrank: " + userrank);
    }

    public static void gameList(String name, int gameid, int score) {
        System.out.println("name: " + name + " gameid: " + gameid + " score: " + score);
    }

    public static void gameList(String name, String username, int score) {
        System.out.println("name: " + name + " username: " + username + " score: " + score);
    }

    public static void gameList(String name, int gameid, String username, int score) {
        System.out.println("name: " + name + " gameid: " + gameid + " username: " + username + " score: " + score);
    }

    public static void gameList(String name, String username, String userrank, int score) {
        System.out.println("name: " + name + " username: " + username + " userrank: " + userrank + " score: " + score);
    }

    public static void gameList(String name, boolean isMultiplayer) {
        System.out.println("name: " + name + " multiplayer: " + isMultiplayer);
    }

    public static void gameList(String name, double rating) {
        System.out.println("name: " + name + " rating: " + rating);
    }

    public static void gameList(String name, int gameid, double rating) {
        System.out.println("name: " + name + " gameid: " + gameid + " rating: " + rating);
    }

    public static void gameList(String name, String username, boolean isMultiplayer) {
        System.out.println("name: " + name + " username: " + username + " multiplayer: " + isMultiplayer);
    }

    public static void gameList(String name, String username, int score, double rating) {
        System.out.println("name: " + name + " username: " + username + " score: " + score + " rating: " + rating);
    }

    public static void gameList(String name, int gameid, int score, boolean isMultiplayer) {
        System.out.println("name: " + name + " gameid: " + gameid + " score: " + score + " multiplayer: " + isMultiplayer);
    }

    public static void gameList(String name, String username, String userrank, double rating) {
        System.out.println("name: " + name + " username: " + username + " userrank: " + userrank + " rating: " + rating);
    }

    public static void gameList(String name, String username, String userrank, int score, boolean isMultiplayer) {
        System.out.println("name: " + name + " username: " + username + " userrank: " + userrank + " score: " + score + " multiplayer: " + isMultiplayer);
    }

    public static void gameList(String name, String username, int gameid, String userrank, double rating) {
        System.out.println("name: " + name + " username: " + username + " gameid: " + gameid + " userrank: " + userrank + " rating: " + rating);
    }

    public static void gameList(String name, int gameid, String username, String userrank, int score, double rating, boolean isMultiplayer) {
        System.out.println("name: " + name + " gameid: " + gameid + " username: " + username + " userrank: " + userrank + " score: " + score + " rating: " + rating + " multiplayer: " + isMultiplayer);
    }
    public static void gameList(String[] name) {
        for(int i=0;i<name.length;i++){
            System.out.println("name: " + name);
        }
    }

    public static void main(String[] args) {
    gameList("Valorant");
    gameList("Valorant", 123);
    gameList("Valorant", "Venky");
    gameList("Valorant", "Venky", "Gold");
    gameList("Valorant", 123, 1500);
    gameList("Valorant", "Venky", 2000);
    gameList("Valorant", 123, "Venky", 2500);
    gameList("Valorant", "Venky", "Gold", 3000);
    gameList("Valorant", true);
    gameList("Valorant", 4.5);
    gameList("Valorant", 123, 4.8);
    gameList("Valorant", "Venky", false);
    gameList("Valorant", "Venky", 3500, 4.7);
    gameList("Valorant", 123, 4000, true);
    gameList("Valorant", "Venky", "Gold", 4.9);
    gameList("Valorant", "Venky", "Gold", 4500, false);
    gameList("Valorant", "Venky", 123, "Gold", 5.0);
    gameList("Valorant", 123, "Venky", "Gold", 5000, 5.0, true);
    gameList("Valorant array");
}
} 
	




