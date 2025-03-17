public class Venkatesh4 {
    public static void productInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void productInfo(String name, int productId) {
        System.out.println("Name: " + name + " : Product ID: " + productId);
    }

    public static void productInfo(String name, String category) {
        System.out.println("Name: " + name + " : Category: " + category);
    }

    public static void productInfo(String name, String category, double price) {
        System.out.println("Name: " + name + " : Category: " + category + " : Price: " + price);
    }

    public static void productInfo(String name, int productId, boolean inStock) {
        System.out.println("Name: " + name + " : Product ID: " + productId + " : In Stock: " + inStock);
    }

    public static void productInfo(String name, String category, int stockQuantity) {
        System.out.println("Name: " + name + " : Category: " + category + " : Stock Quantity: " + stockQuantity);
    }

    public static void productInfo(String name, int productId, double price, boolean inStock) {
        System.out.println("Name: " + name + " : Product ID: " + productId + " : Price: " + price + " : In Stock: " + inStock);
    }

    public static void productInfo(String name, String category, int stockQuantity, double price) {
        System.out.println("Name: " + name + " : Category: " + category + " : Stock Quantity: " + stockQuantity + " : Price: " + price);
    }

    public static void productInfo(String name, int productId, String manufacturer, double rating) {
        System.out.println("Name: " + name + " : Product ID: " + productId + " : Manufacturer: " + manufacturer + " : Rating: " + rating);
    }

    public static void productInfo(String name, String category, String manufacturer, boolean inStock) {
        System.out.println("Name: " + name + " : Category: " + category + " : Manufacturer: " + manufacturer + " : In Stock: " + inStock);
    }

    public static void productInfo(String name, double weight) {
        System.out.println("Name: " + name + " : Weight: " + weight + " kg");
    }

    public static void productInfo(String name, int productId, double price) {
        System.out.println("Name: " + name + " : Product ID: " + productId + " : Price: " + price);
    }

    public static void productInfo(String name, String category, String manufacturer) {
        System.out.println("Name: " + name + " : Category: " + category + " : Manufacturer: " + manufacturer);
    }

    public static void productInfo(String name, int productId, String category, String manufacturer, int stockQuantity, double price, boolean inStock, double rating) {
        System.out.println("Name: " + name + " : Product ID: " + productId + " : Category: " + category + " : Manufacturer: " + manufacturer + " : Stock Quantity: " + stockQuantity + " : Price: " + price + " : In Stock: " + inStock + " : Rating: " + rating);
    }

    public static void main(String[] args) {
        productInfo("Laptop");
        productInfo("Laptop", 101);
        productInfo("Laptop", "Electronics");
        productInfo("Laptop", "Electronics", 999.99);
        productInfo("Laptop", 101, true);
        productInfo("Laptop", "Electronics", 50);
        productInfo("Laptop", 101, 999.99, true);
        productInfo("Laptop", "Electronics", 50, 999.99);
        productInfo("Laptop", 101, "Dell", 4.5);
        productInfo("Laptop", "Electronics", "Dell", true);
        productInfo("Laptop", 101, "Electronics", "Dell", 50, 999.99, true, 4.5);
        productInfo("Laptop", 2.5);
        productInfo("Laptop", 102, 899.99);
        productInfo("Laptop", "Electronics", "HP");
        productInfo("Smartphone");
        productInfo("Smartphone", 202);
        productInfo("Smartphone", "Gadgets");
        productInfo("Smartphone", "Gadgets", 799.99);
        productInfo("Smartphone", 202, "Samsung", 4.7);
    }
}
