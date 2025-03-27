class Mirror {
    String shape;
    String frameMaterial;
    String glassType;
    String brand;
    String modelNumber;
    String coatingType;
    double height;
    double width;
    double thickness;
    double weight;
    String ownerName;  
    String ownerWifeName;  
    String ownerDaughterName;  
    boolean hasLEDLights;
    boolean wallMounted;  
    boolean smartMirror; 
    int warrantyPeriod;
    String countryOfOrigin;
    String installationType;  
    String usageType;

    public Mirror(String shape, String frameMaterial, String glassType, String brand, String modelNumber,
                  String coatingType, double height, double width, double thickness, double weight,
                  String ownerName, String ownerWifeName, String ownerDaughterName, boolean hasLEDLights,
                  boolean wallMounted, boolean smartMirror, int warrantyPeriod, String countryOfOrigin,
                  String installationType, String usageType) {
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.glassType = glassType;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.coatingType = coatingType;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
        this.ownerName = ownerName;
        this.ownerWifeName = ownerWifeName;
        this.ownerDaughterName = ownerDaughterName;
        this.hasLEDLights = hasLEDLights;
        this.wallMounted = wallMounted;
        this.smartMirror = smartMirror;
        this.warrantyPeriod = warrantyPeriod;
        this.countryOfOrigin = countryOfOrigin;
        this.installationType = installationType;
        this.usageType = usageType;
    }
}
