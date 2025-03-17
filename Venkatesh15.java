public class Venkatesh15 {
    public static void channelInfo(String name) {
        System.out.println("Channel: " + name);
    }

    public static void channelInfo(String name, int launchYear) {
        System.out.println("Channel: " + name + " : Launch Year: " + launchYear);
    }

    public static void channelInfo(String name, String country) {
        System.out.println("Channel: " + name + " : Country: " + country);
    }

    public static void channelInfo(String name, String country, boolean isLive) {
        System.out.println("Channel: " + name + " : Country: " + country + " : Live: " + isLive);
    }

    public static void channelInfo(String name, int viewers, double rating) {
        System.out.println("Channel: " + name + " : Viewers: " + viewers + "M : Rating: " + rating);
    }

    public static void channelInfo(String name, String language, String owner) {
        System.out.println("Channel: " + name + " : Language: " + language + " : Owner: " + owner);
    }

    public static void channelInfo(String name, int employees, boolean is24Hour) {
        System.out.println("Channel: " + name + " : Employees: " + employees + " : 24-Hour: " + is24Hour);
    }

    public static void channelInfo(String name, String type, double revenue) {
        System.out.println("Channel: " + name + " : Type: " + type + " : Revenue: $" + revenue + "B");
    }

    public static void channelInfo(String name, boolean isHD, boolean isSubscriptionBased) {
        System.out.println("Channel: " + name + " : HD: " + isHD + " : Subscription Based: " + isSubscriptionBased);
    }

    public static void channelInfo(String name, String headquarter, int bureaus) {
        System.out.println("Channel: " + name + " : HQ: " + headquarter + " : Bureaus: " + bureaus);
    }

    public static void channelInfo(String name, double TRP, int awards) {
        System.out.println("Channel: " + name + " : TRP: " + TRP + " : Awards: " + awards);
    }

    public static void channelInfo(String name, String genre, int programs) {
        System.out.println("Channel: " + name + " : Genre: " + genre + " : Programs: " + programs);
    }

    public static void channelInfo(String name, String digitalPresence, int subscribers) {
        System.out.println("Channel: " + name + " : Digital Presence: " + digitalPresence + " : Subscribers: " + subscribers + "M");
    }

    public static void channelInfo(String name, String country, String sisterChannel) {
        System.out.println("Channel: " + name + " : Country: " + country + " : Sister Channel: " + sisterChannel);
    }

    public static void channelInfo(String name, int revenue, int employees) {
        System.out.println("Channel: " + name + " : Revenue: $" + revenue + "M : Employees: " + employees);
    }

    public static void channelInfo(String name, boolean hasBreakingNews, int dailyReports) {
        System.out.println("Channel: " + name + " : Breaking News: " + hasBreakingNews + " : Daily Reports: " + dailyReports);
    }

    public static void channelInfo(String name, String CEO, String mainAnchor) {
        System.out.println("Channel: " + name + " : CEO: " + CEO + " : Main Anchor: " + mainAnchor);
    }

    public static void channelInfo(String name, int newsCoverage, boolean hasInvestigativeReports) {
        System.out.println("Channel: " + name + " : News Coverage: " + newsCoverage + " Countries : Investigative Reports: " + hasInvestigativeReports);
    }

    public static void channelInfo(String name, int yearsRunning, int exclusiveReports) {
        System.out.println("Channel: " + name + " : Years Running: " + yearsRunning + " : Exclusive Reports: " + exclusiveReports);
    }

    public static void main(String[] args) {
        channelInfo("BBC News");
        channelInfo("BBC News", 1922);
        channelInfo("BBC News", "UK");
        channelInfo("BBC News", "UK", true);
        channelInfo("BBC News", 50, 8.5);
        channelInfo("BBC News", "English", "BBC Group");
        channelInfo("BBC News", 2000, true);
        channelInfo("BBC News", "News", 4.3);
        channelInfo("BBC News", true, false);
        channelInfo("BBC News", "London", 30);
        channelInfo("BBC News", 7.8, 120);
        channelInfo("BBC News", "International", 250);
        channelInfo("BBC News", "YouTube", 15);
        channelInfo("BBC News", "UK", "BBC World");
        channelInfo("BBC News", 600, 2000);
        channelInfo("BBC News", true, 40);
        channelInfo("BBC News", "Tim Davie", "Huw Edwards");
        channelInfo("BBC News", 180, true);
        channelInfo("BBC News", 100, 500);
    }
}
