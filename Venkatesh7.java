public class Venkatesh7 {
    public static void laptopInfo(String model) {
        System.out.println("Laptop Model: " + model);
    }

    public static void laptopInfo(String model, String brand) {
        System.out.println("Laptop Model: " + model + " : Brand: " + bdrand);
    }

    public static void laptopInfo(String model, int year) {
        System.out.println("Laptop Model: " + model + " : Release Year: " + year);
    }

    public static void laptopInfo(String model, double price) {
        System.out.println("Laptop Model: " + model + " : Price: " + price);
    }

    public static void laptopInfo(String model, String processor, int ram) {
        System.out.println("Laptop Model: " + model + " : Processor: " + processor + " : RAM: " + ram + "GB");
    }

    public static void laptopInfo(String model, String brand, String gpu) {
        System.out.println("Laptop Model: " + model + " : Brand: " + brand + " : GPU: " + gpu);
    }

    public static void laptopInfo(String model, int year, boolean isGaming) {
        System.out.println("Laptop Model: " + model + " : Release Year: " + year + " : Gaming: " + isGaming);
    }

    public static void laptopInfo(String model, String brand, double weight) {
        System.out.println("Laptop Model: " + model + " : Brand: " + brand + " : Weight: " + weight + "kg");
    }

    public static void laptopInfo(String model, int year, String os) {
        System.out.println("Laptop Model: " + model + " : Release Year: " + year + " : OS: " + os);
    }

    public static void laptopInfo(String model, String processor, int ram, double price) {
        System.out.println("Laptop Model: " + model + " : Processor: " + processor + " : RAM: " + ram + "GB : Price: " + price);
    }

    public static void main(String[] args) {
        laptopInfo("MacBook Air");
        laptopInfo("MacBook Air", "Apple");
        laptopInfo("MacBook Air", 2023);
        laptopInfo("MacBook Air", 999.99);
        laptopInfo("MacBook Air", "M2", 16);
        laptopInfo("MacBook Air", "Apple", "Integrated");
        laptopInfo("MacBook Air", 2023, false);
        laptopInfo("MacBook Air", "Apple", 1.29);
        laptopInfo("MacBook Air", 2023, "macOS");
        laptopInfo("MacBook Air", "M2", 16, 999.99);
        laptopInfo("Dell XPS 15");
        laptopInfo("Dell XPS 15", "Dell");
        laptopInfo("Dell XPS 15", 2022);
        laptopInfo("Dell XPS 15", 1399.99);
        laptopInfo("Dell XPS 15", "Intel i7", 32);
        laptopInfo("Dell XPS 15", "Dell", "NVIDIA RTX 3050 Ti");
        laptopInfo("Dell XPS 15", 2022, true);
        laptopInfo("Dell XPS 15", "Dell", 1.8);
        laptopInfo("Dell XPS 15", 2022, "Windows 11");
        laptopInfo("Dell XPS 15", "Intel i7", 32, 1399.99);
    }
}
