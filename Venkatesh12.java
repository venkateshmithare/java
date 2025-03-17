public class Venkatesh12 {
    public static void busInfo(String name) {
        System.out.println("Bus: " + name);
    }

    public static void busInfo(String name, int year) {
        System.out.println("Bus: " + name + " : Year: " + year);
    }

    public static void busInfo(String name, String brand) {
        System.out.println("Bus: " + name + " : Brand: " + brand);
    }

    public static void busInfo(String name, String brand, double engineCapacity) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Engine Capacity: " + engineCapacity + "cc");
    }

    public static void busInfo(String name, int year, boolean isElectric) {
        System.out.println("Bus: " + name + " : Year: " + year + " : Electric: " + isElectric);
    }

    public static void busInfo(String name, String brand, int topSpeed) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Top Speed: " + topSpeed + "km/h");
    }

    public static void busInfo(String name, int year, double engineCapacity, boolean isElectric) {
        System.out.println("Bus: " + name + " : Year: " + year + " : Engine Capacity: " + engineCapacity + "cc" + " : Electric: " + isElectric);
    }

    public static void busInfo(String name, String brand, int topSpeed, double mileage) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Top Speed: " + topSpeed + "km/h" + " : Mileage: " + mileage + "km/l");
    }

    public static void busInfo(String name, int year, String type, double weight) {
        System.out.println("Bus: " + name + " : Year: " + year + " : Type: " + type + " : Weight: " + weight + "kg");
    }

    public static void busInfo(String name, String brand, String type, boolean isElectric) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Type: " + type + " : Electric: " + isElectric);
    }

    public static void busInfo(String name, int year, int price) {
        System.out.println("Bus: " + name + " : Year: " + year + " : Price: " + price);
    }
    
    public static void busInfo(String name, String brand, double mileage, int price) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Mileage: " + mileage + "km/l" + " : Price: " + price);
    }

    public static void busInfo(String name, boolean hasABS) {
        System.out.println("Bus: " + name + " : Has ABS: " + hasABS);
    }

    public static void busInfo(String name, String brand, boolean hasABS, double weight) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Has ABS: " + hasABS + " : Weight: " + weight + "kg");
    }

    public static void busInfo(String name, int year, String fuelType) {
        System.out.println("Bus: " + name + " : Year: " + year + " : Fuel Type: " + fuelType);
    }

    public static void busInfo(String name, int topSpeed, double fuelTankCapacity) {
        System.out.println("Bus: " + name + " : Top Speed: " + topSpeed + "km/h" + " : Fuel Tank Capacity: " + fuelTankCapacity + "L");
    }

    public static void busInfo(String name, int year, String color, int price) {
        System.out.println("Bus: " + name + " : Year: " + year + " : Color: " + color + " : Price: " + price);
    }
    
    public static void busInfo(String name, int capacity, boolean isDoubleDecker) {
        System.out.println("Bus: " + name + " : Capacity: " + capacity + " : Double Decker: " + isDoubleDecker);
    }
    
    public static void busInfo(String name, String brand, int passengers, String route) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Passengers: " + passengers + " : Route: " + route);
    }
    
    public static void busInfo(String name, String brand, int topSpeed, String city, boolean isLuxury) {
        System.out.println("Bus: " + name + " : Brand: " + brand + " : Top Speed: " + topSpeed + "km/h" + " : City: " + city + " : Luxury: " + isLuxury);
    }
    
    public static void main(String[] args) {
        busInfo("Volvo");
        busInfo("Volvo", 2020);
        busInfo("Volvo", "Volvo Group");
        busInfo("Volvo", "Volvo Group", 7.0);
        busInfo("Volvo", 2020, false);
        busInfo("Volvo", "Volvo Group", 120);
        busInfo("Volvo", 2020, 7.0, false);
        busInfo("Volvo", "Volvo Group", 120, 10.5);
        busInfo("Volvo", 2020, "Tourist", 8000.0);
        busInfo("Volvo", "Volvo Group", "Tourist", false);
        busInfo("Volvo", 2020, 5000000);
        busInfo("Volvo", "Volvo Group", 10.5, 5000000);
        busInfo("Volvo", true);
        busInfo("Volvo", "Volvo Group", true, 8000.0);
        busInfo("Volvo", 2020, "Diesel");
        busInfo("Volvo", 120, 500.0);
        busInfo("Volvo", 2020, "Red", 5000000);
        busInfo("Volvo", 50, true);
        busInfo("Volvo", "Volvo Group", 60, "Downtown Route");
        busInfo("Volvo", "Volvo Group", 120, "New York", true);
    }
}
