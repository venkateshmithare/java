public class Venkatesh11
 {
    public static void bikeInfo(String name) {
        System.out.println("Bike: " + name);
    }

    public static void bikeInfo(String name, int year) {
        System.out.println("Bike: " + name + " : Year: " + year);
    }

    public static void bikeInfo(String name, String brand) {
        System.out.println("Bike: " + name + " : Brand: " + brand);
    }

    public static void bikeInfo(String name, String brand, double engineCapacity) {
        System.out.println("Bike: " + name + " : Brand: " + brand + " : Engine Capacity: " + engineCapacity + "cc");
    }

    public static void bikeInfo(String name, int year, boolean isElectric) {
        System.out.println("Bike: " + name + " : Year: " + year + " : Electric: " + isElectric);
    }

    public static void bikeInfo(String name, String brand, int topSpeed) {
        System.out.println("Bike: " + name + " : Brand: " + brand + " : Top Speed: " + topSpeed + "km/h");
    }

    public static void bikeInfo(String name, int year, double engineCapacity, boolean isElectric) {
        System.out.println("Bike: " + name + " : Year: " + year + " : Engine Capacity: " + engineCapacity + "cc" + " : Electric: " + isElectric);
    }

    public static void bikeInfo(String name, String brand, int topSpeed, double mileage) {
        System.out.println("Bike: " + name + " : Brand: " + brand + " : Top Speed: " + topSpeed + "km/h" + " : Mileage: " + mileage + "km/l");
    }

    public static void bikeInfo(String name, int year, String type, double weight) {
        System.out.println("Bike: " + name + " : Year: " + year + " : Type: " + type + " : Weight: " + weight + "kg");
    }

    public static void bikeInfo(String name, String brand, String type, boolean isElectric) {
        System.out.println("Bike: " + name + " : Brand: " + brand + " : Type: " + type + " : Electric: " + isElectric);
    }

    public static void bikeInfo(String name, int year, int price) {
        System.out.println("Bike: " + name + " : Year: " + year + " : Price: " + price);
    }
    
    public static void bikeInfo(String name, String brand, double mileage, int price) {
        System.out.println("Bike: " + name + " : Brand: " + brand + " : Mileage: " + mileage + "km/l" + " : Price: " + price);
    }

    public static void bikeInfo(String name, boolean hasABS) {
        System.out.println("Bike: " + name + " : Has ABS: " + hasABS);
    }

    public static void bikeInfo(String name, String brand, boolean hasABS, double weight) {
        System.out.println("Bike: " + name + " : Brand: " + brand + " : Has ABS: " + hasABS + " : Weight: " + weight + "kg");
    }

    public static void bikeInfo(String name, int year, String fuelType) {
        System.out.println("Bike: " + name + " : Year: " + year + " : Fuel Type: " + fuelType);
    }

    public static void bikeInfo(String name, int topSpeed, double fuelTankCapacity) {
        System.out.println("Bike: " + name + " : Top Speed: " + topSpeed + "km/h" + " : Fuel Tank Capacity: " + fuelTankCapacity + "L");
    }

    public static void bikeInfo(String name, int year, String color, int price) {
        System.out.println("Bike: " + name + " : Year: " + year + " : Color: " + color + " : Price: " + price);
    }
    
    public static void main(String[] args) {
        bikeInfo("Yamaha R15");
        bikeInfo("Yamaha R15", 2022);
        bikeInfo("Yamaha R15", "Yamaha");
        bikeInfo("Yamaha R15", "Yamaha", 155.0);
        bikeInfo("Yamaha R15", 2022, false);
        bikeInfo("Yamaha R15", "Yamaha", 140);
        bikeInfo("Yamaha R15", 2022, 155.0, false);
        bikeInfo("Yamaha R15", "Yamaha", 140, 45.0);
        bikeInfo("Yamaha R15", 2022, "Sports", 142.0);
        bikeInfo("Yamaha R15", "Yamaha", "Sports", false);
        bikeInfo("Yamaha R15", 2022, 150000);
        bikeInfo("Yamaha R15", "Yamaha", 45.0, 150000);
        bikeInfo("Yamaha R15", true);
        bikeInfo("Yamaha R15", "Yamaha", true, 142.0);
        bikeInfo("Yamaha R15", 2022, "Petrol");
        bikeInfo("Yamaha R15", 140, 11.0);
        bikeInfo("Yamaha R15", 2022, "Blue", 150000);
    }
}
