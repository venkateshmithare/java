public class Chocolate {
    String brand;
    String name;
    String type;
    double weight;
    double price;
    boolean isSugarFree;
    boolean hasNuts;
    boolean hasCaramel;
    boolean hasFruit;
    boolean isOrganic;
    String countryOfOrigin;
    int cocoaPercentage;
    String shape;
    boolean isGlutenFree;
    String packagingType;
    int shelfLife;
    boolean isDarkChocolate;
    boolean isWhiteChocolate;
    boolean isMilkChocolate;
    String flavor;

    public Chocolate(String brand, String name, String type, double weight, double price, boolean isSugarFree,
                     boolean hasNuts, boolean hasCaramel, boolean hasFruit, boolean isOrganic, String countryOfOrigin,
                     int cocoaPercentage, String shape, boolean isGlutenFree, String packagingType, int shelfLife,
                     boolean isDarkChocolate, boolean isWhiteChocolate, boolean isMilkChocolate, String flavor) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.isSugarFree = isSugarFree;
        this.hasNuts = hasNuts;
        this.hasCaramel = hasCaramel;
        this.hasFruit = hasFruit;
        this.isOrganic = isOrganic;
        this.countryOfOrigin = countryOfOrigin;
        this.cocoaPercentage = cocoaPercentage;
        this.shape = shape;
        this.isGlutenFree = isGlutenFree;
        this.packagingType = packagingType;
        this.shelfLife = shelfLife;
        this.isDarkChocolate = isDarkChocolate;
        this.isWhiteChocolate = isWhiteChocolate;
        this.isMilkChocolate = isMilkChocolate;
        this.flavor = flavor;
    }
}
