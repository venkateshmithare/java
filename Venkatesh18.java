public class Venkatesh18 {
    public static void tvInfo(String brand) {
        System.out.println("Brand: " + brand);
    }

    public static void tvInfo(String brand, int screenSize) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches");
    }

    public static void tvInfo(String brand, String model) {
        System.out.println("Brand: " + brand + " | Model: " + model);
    }

    public static void tvInfo(String brand, int screenSize, boolean isSmart) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Smart TV: " + isSmart);
    }

    public static void tvInfo(String brand, double price) {
        System.out.println("Brand: " + brand + " | Price: " + price);
    }

    public static void tvInfo(String brand, int screenSize, String resolution) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Resolution: " + resolution);
    }

    public static void tvInfo(String brand, String model, boolean isOLED) {
        System.out.println("Brand: " + brand + " | Model: " + model + " | OLED: " + isOLED);
    }

    public static void tvInfo(String brand, int screenSize, boolean isSmart, String resolution) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Smart TV: " + isSmart + " | Resolution: " + resolution);
    }

    public static void tvInfo(String brand, int screenSize, int refreshRate) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Refresh Rate: " + refreshRate + " Hz");
    }

    public static void tvInfo(String brand, int screenSize, double price) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Price: " + price);
    }

    public static void tvInfo(String brand, int screenSize, boolean isSmart, double price) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Smart TV: " + isSmart + " | Price: " + price);
    }

    public static void tvInfo(String brand, String resolution, double price) {
        System.out.println("Brand: " + brand + " | Resolution: " + resolution + " | Price: " + price);
    }

    public static void tvInfo(String brand, boolean hasHDR) {
        System.out.println("Brand: " + brand + " | HDR Support: " + hasHDR);
    }

    public static void tvInfo(String brand, int screenSize, boolean isSmart, boolean hasHDR) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Smart TV: " + isSmart + " | HDR Support: " + hasHDR);
    }

    public static void tvInfo(String brand, String model, String color) {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Color: " + color);
    }

    public static void tvInfo(String brand, int screenSize, boolean isSmart, int refreshRate) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Smart TV: " + isSmart + " | Refresh Rate: " + refreshRate + " Hz");
    }

    public static void tvInfo(String brand, int screenSize, String resolution, boolean hasHDR) {
        System.out.println("Brand: " + brand + " | Screen Size: " + screenSize + " inches | Resolution: " + resolution + " | HDR Support: " + hasHDR);
    }

    public static void tvInfo(String brand, String model, double weight) {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        tvInfo("Samsung");
        tvInfo("LG", 55);
        tvInfo("Sony", "Bravia");
        tvInfo("TCL", 65, true);
        tvInfo("Panasonic", 79999.99);
        tvInfo("Samsung", 50, "4K UHD");
        tvInfo("LG", "CX Series", true);
        tvInfo("Sony", 75, true, "8K");
        tvInfo("TCL", 43, 120);
        tvInfo("Panasonic", 85, 159999.99);
        tvInfo("Samsung", 55, true, 89999.99);
        tvInfo("LG", "Full HD", 45999.99);
        tvInfo("Sony", true);
        tvInfo("TCL", 65, true, true);
        tvInfo("Panasonic", "HX700", "Black");
        tvInfo("Samsung", 60, true, 144);
        tvInfo("LG", 75, "8K UHD", true);
        tvInfo("Sony", "A80J", 21.5);
    }
}
