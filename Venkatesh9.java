public class MobilePhones {
    public static void phoneInfo(String model) {
        System.out.println("Model: " + model);
    }

    public static void phoneInfo(String model, String brand) {
        System.out.println("Model: " + model + " : Brand: " + brand);
    }

    public static void phoneInfo(String model, int year) {
        System.out.println("Model: " + model + " : Release Year: " + year);
    }

    public static void phoneInfo(String model, double price) {
        System.out.println("Model: " + model + " : Price: $" + price);
    }

    public static void phoneInfo(String model, String brand, int batteryLife) {
        System.out.println("Model: " + model + " : Brand: " + brand + " : Battery Life: " + batteryLife + " hours");
    }

    public static void phoneInfo(String model, boolean is5G) {
        System.out.println("Model: " + model + " : 5G Support: " + is5G);
    }

    public static void phoneInfo(String model, int year, double price) {
        System.out.println("Model: " + model + " : Release Year: " + year + " : Price: $" + price);
    }

    public static void phoneInfo(String model, String brand, String os) {
        System.out.println("Model: " + model + " : Brand: " + brand + " : Operating System: " + os);
    }

    public static void phoneInfo(String model, int year, String processor, double screenSize) {
        System.out.println("Model: " + model + " : Release Year: " + year + " : Processor: " + processor + " : Screen Size: " + screenSize + " inches");
    }

    public static void phoneInfo(String model, String brand, int batteryLife, boolean isWaterResistant) {
        System.out.println("Model: " + model + " : Brand: " + brand + " : Battery Life: " + batteryLife + " hours : Water Resistant: " + isWaterResistant);
    }
    
    public static void phoneInfo(String model, int storage) {
        System.out.println("Model: " + model + " : Storage: " + storage + "GB");
    }

    public static void phoneInfo(String model, String brand, int storage, double cameraQuality) {
        System.out.println("Model: " + model + " : Brand: " + brand + " : Storage: " + storage + "GB : Camera: " + cameraQuality + "MP");
    }

    public static void phoneInfo(String model, String brand, String os, double weight) {
        System.out.println("Model: " + model + " : Brand: " + brand + " : OS: " + os + " : Weight: " + weight + "g");
    }

    public static void phoneInfo(String model, int year, boolean is5G, int batteryCapacity) {
        System.out.println("Model: " + model + " : Year: " + year + " : 5G Support: " + is5G + " : Battery: " + batteryCapacity + "mAh");
    }

    public static void phoneInfo(String model, double price, boolean isWirelessCharging) {
        System.out.println("Model: " + model + " : Price: $" + price + " : Wireless Charging: " + isWirelessCharging);
    }

    public static void phoneInfo(String model, int refreshRate, boolean hasFaceID) {
        System.out.println("Model: " + model + " : Refresh Rate: " + refreshRate + "Hz : Face ID: " + hasFaceID);
    }

    public static void phoneInfo(String model, String processor, boolean isDualSIM) {
        System.out.println("Model: " + model + " : Processor: " + processor + " : Dual SIM: " + isDualSIM);
    }

    public static void phoneInfo(String model, int year, double price, String color) {
        System.out.println("Model: " + model + " : Year: " + year + " : Price: $" + price + " : Color: " + color);
    }

    public static void phoneInfo(String model, String brand, String os, double screenSize, int batteryLife) {
        System.out.println("Model: " + model + " : Brand: " + brand + " : OS: " + os + " : Screen Size: " + screenSize + " inches : Battery Life: " + batteryLife + " hours");
    }

    public static void main(String[] args) {
        phoneInfo("iPhone 14");
        phoneInfo("iPhone 14", "Apple");
        phoneInfo("iPhone 14", 2022);
        phoneInfo("iPhone 14", 999.99);
        phoneInfo("iPhone 14", "Apple", 20);
        phoneInfo("iPhone 14", true);
        phoneInfo("iPhone 14", 2022, 999.99);
        phoneInfo("iPhone 14", "Apple", "iOS");
        phoneInfo("iPhone 14", 2022, "A16 Bionic", 6.1);
        phoneInfo("iPhone 14", "Apple", 20, true);
        phoneInfo("iPhone 14", 128);
        phoneInfo("iPhone 14", "Apple", 256, 12.0);
        phoneInfo("iPhone 14", "Apple", "iOS", 174.0);
        phoneInfo("iPhone 14", 2022, true, 3200);
        phoneInfo("iPhone 14", 1099.99, true);
        phoneInfo("iPhone 14", 120, true);
        phoneInfo("iPhone 14", "A16 Bionic", true);
        phoneInfo("iPhone 14", 2022, 1299.99, "Blue");
        phoneInfo("iPhone 14", "Apple", "iOS", 6.1, 18);
    }
}
