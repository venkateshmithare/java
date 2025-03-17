public class Venkatesh14 {
    public static void ottInfo(String name) {
        System.out.println("OTT Platform: " + name);
    }

    public static void ottInfo(String name, int launchYear) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear);
    }

    public static void ottInfo(String name, String country) {
        System.out.println("OTT Platform: " + name + " : Country: " + country);
    }

    public static void ottInfo(String name, String country, double subscriptionCost) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Subscription Cost: $" + subscriptionCost);
    }

    public static void ottInfo(String name, int launchYear, boolean isAdSupported) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear + " : Ad Supported: " + isAdSupported);
    }

    public static void ottInfo(String name, String country, int totalUsers) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Total Users: " + totalUsers + " million");
    }

    public static void ottInfo(String name, int launchYear, double subscriptionCost, boolean isAdSupported) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear + " : Subscription Cost: $" + subscriptionCost + " : Ad Supported: " + isAdSupported);
    }

    public static void ottInfo(String name, String country, int totalUsers, double revenue) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Total Users: " + totalUsers + " million : Revenue: $" + revenue + " billion");
    }

    public static void ottInfo(String name, int launchYear, String type, double rating) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear + " : Type: " + type + " : Rating: " + rating);
    }

    public static void ottInfo(String name, String country, String type, boolean isGlobal) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Type: " + type + " : Global: " + isGlobal);
    }

    public static void ottInfo(String name, int launchYear, int contentCount) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear + " : Content Count: " + contentCount);
    }
    
    public static void ottInfo(String name, String country, double rating, int contentCount) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Rating: " + rating + " : Content Count: " + contentCount);
    }

    public static void ottInfo(String name, boolean hasLiveTV) {
        System.out.println("OTT Platform: " + name + " : Has Live TV: " + hasLiveTV);
    }

    public static void ottInfo(String name, String country, boolean hasLiveTV, double revenue) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Has Live TV: " + hasLiveTV + " : Revenue: $" + revenue + " billion");
    }

    public static void ottInfo(String name, int launchYear, String language) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear + " : Language: " + language);
    }

    public static void ottInfo(String name, int contentCount, double subscriptionCost) {
        System.out.println("OTT Platform: " + name + " : Content Count: " + contentCount + " : Subscription Cost: $" + subscriptionCost);
    }

    public static void ottInfo(String name, int launchYear, String colorTheme, int contentCount) {
        System.out.println("OTT Platform: " + name + " : Launch Year: " + launchYear + " : Color Theme: " + colorTheme + " : Content Count: " + contentCount);
    }
    
    public static void ottInfo(String name, int totalUsers, boolean hasOriginals) {
        System.out.println("OTT Platform: " + name + " : Total Users: " + totalUsers + " million : Has Originals: " + hasOriginals);
    }
    
    public static void ottInfo(String name, String country, int contentCount, String genre) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Content Count: " + contentCount + " : Genre: " + genre);
    }
    
    public static void ottInfo(String name, String country, int totalUsers, String category, boolean isPremium) {
        System.out.println("OTT Platform: " + name + " : Country: " + country + " : Total Users: " + totalUsers + " million : Category: " + category + " : Premium: " + isPremium);
    }
    
    public static void main(String[] args) {
        ottInfo("Netflix");
        ottInfo("Netflix", 2007);
        ottInfo("Netflix", "USA");
        ottInfo("Netflix", "USA", 15.99);
        ottInfo("Netflix", 2007, true);
        ottInfo("Netflix", "USA", 250);
        ottInfo("Netflix", 2007, 15.99, true);
        ottInfo("Netflix", "USA", 250, 32.6);
        ottInfo("Netflix", 2007, "Subscription", 4.8);
        ottInfo("Netflix", "USA", "Subscription", true);
        ottInfo("Netflix", 2007, 5000);
        ottInfo("Netflix", "USA", 4.8, 5000);
        ottInfo("Netflix", true);
        ottInfo("Netflix", "USA", true, 32.6);
        ottInfo("Netflix", 2007, "English");
        ottInfo("Netflix", 5000, 15.99);
        ottInfo("Netflix", 2007, "Dark Mode", 5000);
        ottInfo("Netflix", 250, true);
        ottInfo("Netflix", "USA", 5000, "Drama");
        ottInfo("Netflix", "USA", 250, "Entertainment", true);
    }
}
