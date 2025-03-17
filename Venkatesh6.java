public class Venkatesh6 {
    public static void planeInfo(String name) {
        System.out.println("Plane Name: " + name);
    }

    public static void planeInfo(String name, int modelYear) {
        System.out.println("Plane Name: " + name + " : Model Year: " + modelYear);
    }

    public static void planeInfo(String name, String manufacturer) {
        System.out.println("Plane Name: " + name + " : Manufacturer: " + manufacturer);
    }

    public static void planeInfo(String name, String manufacturer, double price) {
        System.out.println("Plane Name: " + name + " : Manufacturer: " + manufacturer + " : Price: " + price);
    }

    public static void planeInfo(String name, int modelYear, boolean isCommercial) {
        System.out.println("Plane Name: " + name + " : Model Year: " + modelYear + " : Commercial: " + isCommercial);
    }

    public static void planeInfo(String name, String manufacturer, int capacity) {
        System.out.println("Plane Name: " + name + " : Manufacturer: " + manufacturer + " : Capacity: " + capacity);
    }

    public static void planeInfo(String name, int modelYear, double price, boolean isCommercial) {
        System.out.println("Plane Name: " + name + " : Model Year: " + modelYear + " : Price: " + price + " : Commercial: " + isCommercial);
    }

    public static void planeInfo(String name, String manufacturer, int capacity, double range) {
        System.out.println("Plane Name: " + name + " : Manufacturer: " + manufacturer + " : Capacity: " + capacity + " : Range: " + range);
    }

    public static void planeInfo(String name, int modelYear, String engineType, double maxSpeed) {
        System.out.println("Plane Name: " + name + " : Model Year: " + modelYear + " : Engine Type: " + engineType + " : Max Speed: " + maxSpeed);
    }

    public static void planeInfo(String name, String manufacturer, String engineType, boolean isCommercial) {
        System.out.println("Plane Name: " + name + " : Manufacturer: " + manufacturer + " : Engine Type: " + engineType + " : Commercial: " + isCommercial);
    }

    public static void planeInfo(String name, double wingspan) {
        System.out.println("Plane Name: " + name + " : Wingspan: " + wingspan + " meters");
    }

    public static void planeInfo(String name, int modelYear, double price) {
        System.out.println("Plane Name: " + name + " : Model Year: " + modelYear + " : Price: " + price);
    }

    public static void planeInfo(String name, String manufacturer, String engineType) {
        System.out.println("Plane Name: " + name + " : Manufacturer: " + manufacturer + " : Engine Type: " + engineType);
    }

    public static void planeInfo(String name, int modelYear, String manufacturer, String engineType, int capacity, double range, boolean isCommercial, double maxSpeed) {
        System.out.println("Plane Name: " + name + " : Model Year: " + modelYear + " : Manufacturer: " + manufacturer + " : Engine Type: " + engineType + " : Capacity: " + capacity + " : Range: " + range + " : Commercial: " + isCommercial + " : Max Speed: " + maxSpeed);
    }

    public static void main(String[] args) {
        planeInfo("Boeing 747");
        planeInfo("Boeing 747", 1990);
        planeInfo("Boeing 747", "Boeing");
        planeInfo("Boeing 747", "Boeing", 379.5);
        planeInfo("Boeing 747", 1990, true);
        planeInfo("Boeing 747", "Boeing", 416);
        planeInfo("Boeing 747", 1990, 379.5, true);
        planeInfo("Boeing 747", "Boeing", 416, 8000);
        planeInfo("Boeing 747", 1990, "Turbofan", 988);
        planeInfo("Boeing 747", "Boeing", "Turbofan", true);
        planeInfo("Boeing 747", 59.6);
        planeInfo("Boeing 747", 2005, 400.0);
        planeInfo("Boeing 747", "Boeing", "Turbofan");
        planeInfo("Airbus A380");
        planeInfo("Airbus A380", 2007);
        planeInfo("Airbus A380", "Airbus");
        planeInfo("Airbus A380", "Airbus", 445.6);
        planeInfo("Airbus A380", 2007, "Turbofan", 1020);
        planeInfo("Airbus A380", "Airbus", "Turbofan", true);
        planeInfo("Airbus A380", 2007, "Airbus", "Turbofan", 555, 15000, true, 1020);
    }
}
