public class Venkatesh20 {
    public static void fanInfo(String name) {
        System.out.println("Fan: " + name);
    }

    public static void fanInfo(String name, int blades) {
        System.out.println("Fan: " + name + " : Blades: " + blades);
    }

    public static void fanInfo(String name, String brand) {
        System.out.println("Fan: " + name + " : Brand: " + brand);
    }

    public static void fanInfo(String name, String brand, double power) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Power: " + power + "W");
    }

    public static void fanInfo(String name, int blades, boolean isRemoteControlled) {
        System.out.println("Fan: " + name + " : Blades: " + blades + " : Remote Controlled: " + isRemoteControlled);
    }

    public static void fanInfo(String name, String brand, int speedLevels) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Speed Levels: " + speedLevels);
    }

    public static void fanInfo(String name, int blades, double price, boolean isSmart) {
        System.out.println("Fan: " + name + " : Blades: " + blades + " : Price: " + price + " : Smart Fan: " + isSmart);
    }

    public static void fanInfo(String name, String brand, int speedLevels, double power) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Speed Levels: " + speedLevels + " : Power: " + power + "W");
    }

    public static void fanInfo(String name, int blades, String color) {
        System.out.println("Fan: " + name + " : Blades: " + blades + " : Color: " + color);
    }

    public static void fanInfo(String name, String brand, boolean hasTimer) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Has Timer: " + hasTimer);
    }

    public static void fanInfo(String name, int speedLevels, double weight) {
        System.out.println("Fan: " + name + " : Speed Levels: " + speedLevels + " : Weight: " + weight + "kg");
    }

    public static void fanInfo(String name, String brand, double price) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Price: " + price);
    }

    public static void fanInfo(String name, boolean isEnergyEfficient) {
        System.out.println("Fan: " + name + " : Energy Efficient: " + isEnergyEfficient);
    }

    public static void fanInfo(String name, String brand, int warrantyYears) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Warranty: " + warrantyYears + " years");
    }

    public static void fanInfo(String name, int blades, int speedLevels) {
        System.out.println("Fan: " + name + " : Blades: " + blades + " : Speed Levels: " + speedLevels);
    }

    public static void fanInfo(String name, String brand, String color) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Color: " + color);
    }

    public static void fanInfo(String name, double price, boolean isSmart) {
        System.out.println("Fan: " + name + " : Price: " + price + " : Smart Fan: " + isSmart);
    }

    public static void fanInfo(String name, String brand, double weight, boolean isSilent) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Weight: " + weight + "kg" + " : Silent: " + isSilent);
    }

    public static void fanInfo(String name, int speedLevels, boolean hasRemote) {
        System.out.println("Fan: " + name + " : Speed Levels: " + speedLevels + " : Has Remote: " + hasRemote);
    }

    public static void fanInfo(String name, String brand, int blades, String roomType) {
        System.out.println("Fan: " + name + " : Brand: " + brand + " : Blades: " + blades + " : Room Type: " + roomType);
    }

    public static void main(String[] args) {
        fanInfo("CoolAir");
        fanInfo("CoolAir", 3);
        fanInfo("CoolAir", "Bajaj");
        fanInfo("CoolAir", "Bajaj", 50.5);
        fanInfo("CoolAir", 3, true);
        fanInfo("CoolAir", "Bajaj", 5);
        fanInfo("CoolAir", 3, 3000.0, false);
        fanInfo("CoolAir", "Bajaj", 5, 55.5);
        fanInfo("CoolAir", 3, "White");
        fanInfo("CoolAir", "Bajaj", true);
        fanInfo("CoolAir", 5, 3.5);
        fanInfo("CoolAir", "Bajaj", 3200.0);
        fanInfo("CoolAir", false);
        fanInfo("CoolAir", "Bajaj", 2);
        fanInfo("CoolAir", 3, 5);
        fanInfo("CoolAir", "Bajaj", "Black");
        fanInfo("CoolAir", 3500.0, true);
        fanInfo("CoolAir", "Bajaj", 4.5, false);
        fanInfo("CoolAir", 5, true);
        fanInfo("CoolAir", "Bajaj", 3, "Living Room");
    }
}
