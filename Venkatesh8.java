public class Venkatesh8 {
    public static void techInfo(String name) {
        System.out.println("Technology: " + name);
    }

    public static void techInfo(String name, int year) {
        System.out.println("Technology: " + name + " : Year: " + year);
    }

    public static void techInfo(String name, String developer) {
        System.out.println("Technology: " + name + " : Developer: " + developer);
    }

    public static void techInfo(String name, String developer, double version) {
        System.out.println("Technology: " + name + " : Developer: " + developer + " : Version: " + version);
    }

    public static void techInfo(String name, int year, boolean isOpenSource) {
        System.out.println("Technology: " + name + " : Year: " + year + " : Open Source: " + isOpenSource);
    }

    public static void techInfo(String name, String developer, int users) {
        System.out.println("Technology: " + name + " : Developer: " + developer + " : Users: " + users);
    }

    public static void techInfo(String name, int year, double version, boolean isOpenSource) {
        System.out.println("Technology: " + name + " : Year: " + year + " : Version: " + version + " : Open Source: " + isOpenSource);
    }

    public static void techInfo(String name, String developer, int users, double version) {
        System.out.println("Technology: " + name + " : Developer: " + developer + " : Users: " + users + " : Version: " + version);
    }

    public static void techInfo(String name, int year, String category, double popularity) {
        System.out.println("Technology: " + name + " : Year: " + year + " : Category: " + category + " : Popularity: " + popularity);
    }

    public static void techInfo(String name, String developer, String category, boolean isOpenSource) {
        System.out.println("Technology: " + name + " : Developer: " + developer + " : Category: " + category + " : Open Source: " + isOpenSource);
    }

    public static void main(String[] args) {
        techInfo("Artificial Intelligence");
        techInfo("Artificial Intelligence", 1956);
        techInfo("Artificial Intelligence", "John McCarthy");
        techInfo("Artificial Intelligence", "John McCarthy", 1.0);
        techInfo("Artificial Intelligence", 1956, true);
        techInfo("Artificial Intelligence", "John McCarthy", 1000000);
        techInfo("Artificial Intelligence", 1956, 1.0, true);
        techInfo("Artificial Intelligence", "John McCarthy", 1000000, 1.0);
        techInfo("Artificial Intelligence", 1956, "Machine Learning", 98.5);
        techInfo("Artificial Intelligence", "John McCarthy", "Machine Learning", true);
    }
}
