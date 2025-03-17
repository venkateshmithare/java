public class Aeroplane{

    public static void addAeroplaneDetails(String name) {
        System.out.println("Aeroplane Name: " + name);
    }

    public static void addAeroplaneDetails(String name, String model) {
        System.out.println("Aeroplane Name: " + name + ", Model: " + model);
    }

    public static void addAeroplaneDetails(String name, int year) {
        System.out.println("Aeroplane Name: " + name + ", Year: " + year);
    }

    public static void addAeroplaneDetails(String name, String model, int year) {
        System.out.println("Aeroplane Name: " + name + ", Model: " + model + ", Year: " + year);
    }

    public static void addAeroplaneDetails( boolean color) {
        System.out.println(" Color: " + color);
    }

    public static void addAeroplaneDetails(String name, double range) {
        System.out.println("Aeroplane Name: " + name + ", Range: " + range + " km");
    }

    public static void addAeroplaneDetails(String name, String model, double range) {
        System.out.println("Aeroplane Name: " + name + ", Model: " + model + ", Range: " + range + " km");
    }

    public static void addAeroplaneDetails(String name, int year, String airline) {
        System.out.println("Aeroplane Name: " + name + ", Year: " + year + ", Airline: " + airline);
    }

    public static void addAeroplaneDetails(String name, boolean availability) {
        System.out.println("Aeroplane Name: " + name + ", Available: " + availability);
    }

    public static void addAeroplaneDetails(String name, String model, int year, String airline, boolean availability) {
        System.out.println("Aeroplane Name: " + name + ", Model: " + model + ", Year: " + year + ", Airline: " + airline + ", Available: " + availability);
    }

    public static void addAeroplaneDetails(String name, int year, double range) {
        System.out.println("Aeroplane Name: " + name + ", Year: " + year + ", Range: " + range + " km");
    }

    public static void addAeroplaneDetails(String name, String model, int year, double range) {
        System.out.println("Aeroplane Name: " + name + ", Model: " + model + ", Year: " + year + ", Range: " + range + " km");
    }

    public static void addAeroplaneDetails(int year, String owner) {
        System.out.println("Year: " + year + ", Owner: " + owner);
    }

    public static void main(String[] args) {
        

        addAeroplaneDetails("Boeing");
        addAeroplaneDetails("Boeing", "747");
        addAeroplaneDetails("Boeing", 2023);
        addAeroplaneDetails("Boeing", "747", 2023);
        addAeroplaneDetails("Boeing", "White");
        addAeroplaneDetails("Boeing", 15000.0);
        addAeroplaneDetails("Boeing", "747", 14000.0);
        addAeroplaneDetails("Boeing", 2023, "Air India");
        addAeroplaneDetails("Boeing", true);
        addAeroplaneDetails("Boeing", "747", 2023, "British Airways", true);
        addAeroplaneDetails("Boeing", 2023, 12000.0);
        addAeroplaneDetails("Boeing", "747", 2023, 13000.0);
        addAeroplaneDetails(2023, "John");
    }
}