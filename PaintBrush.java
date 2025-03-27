public class PaintBrush {
    String brand;
    String material;
    String color;
    double length;
    double width;
    boolean isSynthetic;
    String brushType;
    boolean hasGrip;
    String usageType;
    boolean isWashable;
    String countryOfOrigin;
    int warrantyPeriod;
    boolean isEcoFriendly;
    String handleMaterial;
    boolean isReusable;
    int bristleCount;
    boolean isWaterResistant;
    String paintType;
    boolean hasProtectiveCover;
    String applicationSurface;

    public PaintBrush(String brand, String material, String color, double length, double width, boolean isSynthetic,
                      String brushType, boolean hasGrip, String usageType, boolean isWashable, String countryOfOrigin,
                      int warrantyPeriod, boolean isEcoFriendly, String handleMaterial, boolean isReusable,
                      int bristleCount, boolean isWaterResistant, String paintType, boolean hasProtectiveCover,
                      String applicationSurface) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.isSynthetic = isSynthetic;
        this.brushType = brushType;
        this.hasGrip = hasGrip;
        this.usageType = usageType;
        this.isWashable = isWashable;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyPeriod = warrantyPeriod;
        this.isEcoFriendly = isEcoFriendly;
        this.handleMaterial = handleMaterial;
        this.isReusable = isReusable;
        this.bristleCount = bristleCount;
        this.isWaterResistant = isWaterResistant;
        this.paintType = paintType;
        this.hasProtectiveCover = hasProtectiveCover;
        this.applicationSurface = applicationSurface;
    }
}
