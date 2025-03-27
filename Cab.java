class  {
    String brand;
    String model;Cab
    String fuelType;
    String color;
    int seatingCapacity;
    double engineCapacity;
    boolean isElectric;
    double mileage;
    double farePerKm;
    String registrationNumber;
    boolean hasAC;
    boolean hasWiFi;
    String driverName;
    String driverLicenseNumber;
    int manufacturingYear;
    boolean isAvailable;
    String cabType;
    String companyName;
    double rating;
    String cityOfOperation;

    public Cab(String brand, String model, String fuelType, String color, int seatingCapacity, double engineCapacity,
               boolean isElectric, double mileage, double farePerKm, String registrationNumber, boolean hasAC, boolean hasWiFi,
               String driverName, String driverLicenseNumber, int manufacturingYear, boolean isAvailable,
               String cabType, String companyName, double rating, String cityOfOperation) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.engineCapacity = engineCapacity;
        this.isElectric = isElectric;
        this.mileage = mileage;
        this.farePerKm = farePerKm;
        this.registrationNumber = registrationNumber;
        this.hasAC = hasAC;
        this.hasWiFi = hasWiFi;
        this.driverName = driverName;
        this.driverLicenseNumber = driverLicenseNumber;
        this.manufacturingYear = manufacturingYear;
        this.isAvailable = isAvailable;
        this.cabType = cabType;
        this.companyName = companyName;
        this.rating = rating;
        this.cityOfOperation = cityOfOperation;
    }
}
