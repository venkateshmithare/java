class Dustbin {
    String brand;
    String material;
    String color;
    double capacity;
    double height;
    double diameter;
    boolean hasLid;
    boolean isRecyclable;
    boolean hasFootPedal;
    String shape;
    String usageType;
    boolean isSmartDustbin;
    String sensorType;
    boolean hasDeodorizer;
    String countryOfOrigin;
    int warrantyPeriod;
    double weight;
    boolean isWaterproof;
    String openingMechanism;
    String placementType;

    public Dustbin(String brand, String material, String color, double capacity, double height, double diameter,
                   boolean hasLid, boolean isRecyclable, boolean hasFootPedal, String shape, String usageType,
                   boolean isSmartDustbin, String sensorType, boolean hasDeodorizer, String countryOfOrigin,
                   int warrantyPeriod, double weight, boolean isWaterproof, String openingMechanism, String placementType) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.height = height;
        this.diameter = diameter;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.hasFootPedal = hasFootPedal;
        this.shape = shape;
        this.usageType = usageType;
        this.isSmartDustbin = isSmartDustbin;
        this.sensorType = sensorType;
        this.hasDeodorizer = hasDeodorizer;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyPeriod = warrantyPeriod;
        this.weight = weight;
        this.isWaterproof = isWaterproof;
        this.openingMechanism = openingMechanism;
        this.placementType = placementType;
    }
}
