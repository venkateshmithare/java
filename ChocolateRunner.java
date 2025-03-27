public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Cadbury", "Dairy Milk", "Milk Chocolate", 150.0, 200.0, false, 
                                            true, false, false, true, "India", 30, "Bar", true, 
                                            "Wrapper", 12, false, false, true, "Creamy");

        Chocolate chocolate1 = new Chocolate("Cadbury", "Dairy Milk", "Milk Chocolate", 150.0, 200.0, false, 
                                             true, false, false, true, "India", 30, "Bar", true, 
                                             "Wrapper", 12, false, false, true, "Creamy");

        Chocolate chocolate2 = new Chocolate("Cadbury", "Dairy Milk", "Milk Chocolate", 150.0, 200.0, false, 
                                             true, false, false, true, "India", 30, "Bar", true, 
                                             "Wrapper", 12, false, false, true, "Creamy");

        System.out.println("Brand: " + chocolate1.brand);
        System.out.println("Name: " + chocolate1.name);
        System.out.println("Type: " + chocolate1.type);
        System.out.println("Weight: " + chocolate1.weight + " g");
        System.out.println("Price: " + chocolate1.price + " INR");
        System.out.println("Sugar-Free: " + chocolate1.isSugarFree);
        System.out.println("Contains Nuts: " + chocolate1.hasNuts);
        System.out.println("Has Caramel: " + chocolate1.hasCaramel);
        System.out.println("Has Fruit: " + chocolate1.hasFruit);
        System.out.println("Organic: " + chocolate1.isOrganic);
        System.out.println("Country of Origin: " + chocolate1.countryOfOrigin);
        System.out.println("Cocoa Percentage: " + chocolate1.cocoaPercentage + "%");
        System.out.println("Shape: " + chocolate1.shape);
        System.out.println("Gluten-Free: " + chocolate1.isGlutenFree);
        System.out.println("Packaging Type: " + chocolate1.packagingType);
        System.out.println("Shelf Life: " + chocolate1.shelfLife + " months");
        System.out.println("Dark Chocolate: " + chocolate1.isDarkChocolate);
        System.out.println("White Chocolate: " + chocolate1.isWhiteChocolate);
        System.out.println("Milk Chocolate: " + chocolate1.isMilkChocolate);
        System.out.println("Flavor: " + chocolate1.flavor);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Brand: " + chocolate2.brand);
        System.out.println("Name: " + chocolate2.name);
        System.out.println("Type: " + chocolate2.type);
        System.out.println("Weight: " + chocolate2.weight + " g");
        System.out.println("Price: " + chocolate2.price + " INR");
        System.out.println("Sugar-Free: " + chocolate2.isSugarFree);
        System.out.println("Contains Nuts: " + chocolate2.hasNuts);
        System.out.println("Has Caramel: " + chocolate2.hasCaramel);
        System.out.println("Has Fruit: " + chocolate2.hasFruit);
        System.out.println("
