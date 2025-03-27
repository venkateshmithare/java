class Tab {
    String brand;
    String model;
    String operatingSystem;
    double screenSize;
    int batteryCapacity;
    int storage;
    int ram;
    double cameraResolution;
    boolean hasStylusSupport;
    boolean hasSIMSupport;
    boolean is5GEnabled;
    boolean hasFaceUnlock;
    String processor;
    String color;
    double weight;
    int warrantyPeriod;
    String countryOfOrigin;
    double price;
    String connectivityType;
    String displayType;

    public Tab(String brand, String model, String operatingSystem, double screenSize, int batteryCapacity,
               int storage, int ram, double cameraResolution, boolean hasStylusSupport, boolean hasSIMSupport,
               boolean is5GEnabled, boolean hasFaceUnlock, String processor, String color, double weight,
               int warrantyPeriod, String countryOfOrigin, double price, String connectivityType, String displayType) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.storage = storage;
        this.ram = ram;
        this.cameraResolution = cameraResolution;
        this.hasStylusSupport = hasStylusSupport;
        this.hasSIMSupport = hasSIMSupport;
        this.is5GEnabled = is5GEnabled;
        this.hasFaceUnlock = hasFaceUnlock;
        this.processor = processor;
        this.color = color;
        this.weight = weight;
        this.warrantyPeriod = warrantyPeriod;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.connectivityType = connectivityType;
        this.displayType = displayType;
    }
}
