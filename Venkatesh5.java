public class Venkatesh5 {
    public static void carInfo(String name) {
        System.out.println("Car Name: " + name);
    }

    public static void carInfo(String name, int modelYear) {
        System.out.println("Car Name: " + name + " : Model Year: " + modelYear);
    }

    public static void carInfo(String name, String brand) {
        System.out.println("Car Name: " + name + " : Brand: " + brand);
    }

    public static void carInfo(String name, String brand, double price) {
        System.out.println("Car Name: " + name + " : Brand: " + brand + " : Price: " + price);
    }

    public static void carInfo(String name, int modelYear, boolean isElectric) {
        System.out.println("Car Name: " + name + " : Model Year: " + modelYear + " : Electric: " + isElectric);
    }

    public static void carInfo(String name, String brand, int horsepower) {
        System.out.println("Car Name: " + name + " : Brand: " + brand + " : Horsepower: " + horsepower);
    }

    public static void carInfo(String name, int modelYear, double price, boolean isElectric) {
        System.out.println("Car Name: " + name + " : Model Year: " + modelYear + " : Price: " + price + " : Electric: " + isElectric);
    }

    public static void carInfo(String name, String brand, int horsepower, double price) {
        System.out.println("Car Name: " + name + " : Brand: " + brand + " : Horsepower: " + horsepower + " : Price: " + price);
    }

    public static void carInfo(String name, int modelYear, String fuelType, double mileage) {
        System.out.println("Car Name: " + name + " : Model Year: " + modelYear + " : Fuel Type: " + fuelType + " : Mileage: " + mileage);
    }

    public static void carInfo(String name, String brand, String fuelType, boolean isElectric) {
        System.out.println("Car Name: " + name + " : Brand: " + brand + " : Fuel Type: " + fuelType + " : Electric: " + isElectric);
    }

    public static void carInfo(String name, double weight) {
        System.out.println("Car Name: " + name + " : Weight: " + weight + " kg");
    }

    public static void carInfo(String name, int modelYear, double price) {
        System.out.println("Car Name: " + name + " : Model Year: " + modelYear + " : Price: " + price);
    }

    public static void carInfo(String name, String brand, String fuelType) {
        System.out.println("Car Name: " + name + " : Brand: " + brand + " : Fuel Type: " + fuelType);
    }

    public static void carInfo(String name, int modelYear, String brand, String fuelType, int horsepower, double price, boolean isElectric, double mileage) {
        System.out.println("Car Name: " + name + " : Model Year: " + modelYear + " : Brand: " + brand + " : Fuel Type: " + fuelType + " : Horsepower: " + horsepower + " : Price: " + price + " : Electric: " + isElectric + " : Mileage: " + mileage);
    }

    public static void main(String[] args) {
        carInfo("Tesla Model S");
        carInfo("Tesla Model S", 2022);
        carInfo("Tesla Model S", "Tesla");
        carInfo("Tesla Model S", "Tesla", 79999.99);
        carInfo("Tesla Model S", 2022, true);
        carInfo("Tesla Model S", "Tesla", 670);
        carInfo("Tesla Model S", 2022, 79999.99, true);
        carInfo("Tesla Model S", "Tesla", 670, 79999.99);
        carInfo("Tesla Model S", 2022, "Electric", 396);
        carInfo("Tesla Model S", "Tesla", "Electric", true);
        carInfo("Tesla Model S", 2.2);
        carInfo("Tesla Model S", 2023, 84999.99);
        carInfo("Tesla Model S", "Tesla", "Electric");
        carInfo("BMW M5");
        carInfo("BMW M5", 2023);
        carInfo("BMW M5", "BMW");
        carInfo("BMW M5", "BMW", 102500.50);
        carInfo("BMW M5", 2023, "Gasoline", 25.4);
        carInfo("BMW M5", "BMW", "Gasoline", false);
        carInfo("BMW M5", 2023, "BMW", "Gasoline", 600, 102500.50, false, 25.4);
    }
}
