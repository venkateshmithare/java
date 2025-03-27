public class Duster {
    String brand;
    String material;
    String color;
    double length;
    double width;
    double height;
    boolean hasHandle;
    String surfaceType;
    boolean isWashable;
    String countryOfOrigin;
    int warrantyPeriod;
    int usageCount;
    boolean isEcoFriendly;
    String feature;
    String usageType;

    public Duster(String brand, String material, String color, double length, double width, double height,
                  boolean hasHandle, String surfaceType, boolean isWashable, String countryOfOrigin,
                  int warrantyPeriod, int usageCount, boolean isEcoFriendly, String feature, String usageType) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.hasHandle = hasHandle;
        this.surfaceType = surfaceType;
        this.isWashable = isWashable;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyPeriod = warrantyPeriod;
        this.usageCount = usageCount;
        this.isEcoFriendly = isEcoFriendly;
        this.feature = feature;
        this.usageType = usageType;
    }
}
