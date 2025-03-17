public class Venkatesh17 {
    public static void drinkInfo(String name) {
        System.out.println("Drink: " + name);
    }

    public static void drinkInfo(String name, String brand) {
        System.out.println("Drink: " + name + " : Brand: " + brand);
    }

    public static void drinkInfo(String name, double price) {
        System.out.println("Drink: " + name + " : Price: $" + price);
    }

    public static void drinkInfo(String name, int quantity) {
        System.out.println("Drink: " + name + " : Quantity: " + quantity + "ml");
    }

    public static void drinkInfo(String name, boolean isCarbonated) {
        System.out.println("Drink: " + name + " : Carbonated: " + isCarbonated);
    }

    public static void drinkInfo(String name, String brand, double price) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Price: $" + price);
    }

    public static void drinkInfo(String name, String brand, int quantity) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Quantity: " + quantity + "ml");
    }

    public static void drinkInfo(String name, double price, boolean isCarbonated) {
        System.out.println("Drink: " + name + " : Price: $" + price + " : Carbonated: " + isCarbonated);
    }

    public static void drinkInfo(String name, int quantity, String flavor) {
        System.out.println("Drink: " + name + " : Quantity: " + quantity + "ml : Flavor: " + flavor);
    }

    public static void drinkInfo(String name, String brand, String flavor) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Flavor: " + flavor);
    }

    public static void drinkInfo(String name, String brand, double price, int quantity) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Price: $" + price + " : Quantity: " + quantity + "ml");
    }

    public static void drinkInfo(String name, int quantity, boolean hasSugar) {
        System.out.println("Drink: " + name + " : Quantity: " + quantity + "ml : Has Sugar: " + hasSugar);
    }

    public static void drinkInfo(String name, String brand, boolean isDiet) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Diet: " + isDiet);
    }

    public static void drinkInfo(String name, int quantity, String flavor, boolean isCarbonated) {
        System.out.println("Drink: " + name + " : Quantity: " + quantity + "ml : Flavor: " + flavor + " : Carbonated: " + isCarbonated);
    }

    public static void drinkInfo(String name, String brand, String flavor, boolean isDiet) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Flavor: " + flavor + " : Diet: " + isDiet);
    }

    public static void drinkInfo(String name, int quantity, String flavor, double price) {
        System.out.println("Drink: " + name + " : Quantity: " + quantity + "ml : Flavor: " + flavor + " : Price: $" + price);
    }

    public static void drinkInfo(String name, String brand, boolean isCarbonated, int quantity) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Carbonated: " + isCarbonated + " : Quantity: " + quantity + "ml");
    }

    public static void drinkInfo(String name, boolean isOrganic, boolean hasCaffeine) {
        System.out.println("Drink: " + name + " : Organic: " + isOrganic + " : Contains Caffeine: " + hasCaffeine);
    }
    
    public static void drinkInfo(String name, String brand, boolean isCarbonated, String flavor) {
        System.out.println("Drink: " + name + " : Brand: " + brand + " : Carbonated: " + isCarbonated + " : Flavor: " + flavor);
    }

    public static void main(String[] args) {
        drinkInfo("Coca-Cola");
        drinkInfo("Coca-Cola", "Coca-Cola Company");
        drinkInfo("Coca-Cola", 1.5);
        drinkInfo("Coca-Cola", 500);
        drinkInfo("Coca-Cola", true);
        drinkInfo("Coca-Cola", "Coca-Cola Company", 1.5);
        drinkInfo("Coca-Cola", "Coca-Cola Company", 500);
        drinkInfo("Coca-Cola", 1.5, true);
        drinkInfo("Coca-Cola", 500, "Cola");
        drinkInfo("Coca-Cola", "Coca-Cola Company", "Cola");
        drinkInfo("Coca-Cola", "Coca-Cola Company", 1.5, 500);
        drinkInfo("Coca-Cola", 500, false);
        drinkInfo("Coca-Cola", "Coca-Cola Company", false);
        drinkInfo("Coca-Cola", 500, "Cola", true);
        drinkInfo("Coca-Cola", "Coca-Cola Company", "Cola", false);
        drinkInfo("Coca-Cola", 500, "Cola", 1.5);
        drinkInfo("Coca-Cola", "Coca-Cola Company", true, 500);
        drinkInfo("Coca-Cola", false, true);
        drinkInfo("Coca-Cola", "Coca-Cola Company", true, "Cola");
    }
}