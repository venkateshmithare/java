public class DusterRunner {
    public static void main(String[] args) {
        Duster duster = new Duster("Camlin", "Plastic", "Blue", 15.0, 5.0, 2.5,
                          true, "Foam", true, "India", 2, 50, true, "Magnetic", "Whiteboard");

        Duster duster1 = new Duster("Camlin", "Plastic", "Blue", 15.0, 5.0, 2.5,
                          true, "Foam", true, "India", 2, 50, true, "Magnetic", "Whiteboard");

        Duster duster2 = new Duster("Camlin", "Plastic", "Blue", 15.0, 5.0, 2.5,
                          true, "Foam", true, "India", 2, 50, true, "Magnetic", "Whiteboard");

        System.out.println("Brand: " + duster1.brand);
        System.out.println("Material: " + duster1.material);
        System.out.println("Color: " + duster1.color);
        System.out.println("Length: " + duster1.length + " cm");
        System.out.println("Width: " + duster1.width + " cm");
        System.out.println("Height: " + duster1.height + " cm");
        System.out.println("Has Handle: " + duster1.hasHandle);
        System.out.println("Surface Type: " + duster1.surfaceType);
        System.out.println("Is Washable: " + duster1.isWashable);
        System.out.println("Country of Origin: " + duster1.countryOfOrigin);
        System.out.println("Warranty Period: " + duster1.warrantyPeriod + " years");
        System.out.println("Usage Count: " + duster1.usageCount);
        System.out.println("Is Eco-Friendly: " + duster1.isEcoFriendly);
        System.out.println("Feature: " + duster1.feature);
        System.out.println("Usage Type: " + duster1.usageType);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Brand: " + duster2.brand);
        System.out.println("Material: " + duster2.material);
        System.out.println("Color: " + duster2.color);
        System.out.println("Length: " + duster2.length + " cm");
        System.out.println("Width: " + duster2.width + " cm");
        System.out.println("Height: " + duster2.height + " cm");
        System.out.println("Has Handle: " + duster2.hasHandle);
        System.out.println("Surface Type: " + duster2.surfaceType);
        System.out.println("Is Washable: " + duster2.isWashable);
        System.out.println("Country of Origin: " + duster2.countryOfOrigin);
        System.out.println("Warranty Period: " + duster2.warrantyPeriod + " years");
        System.out.println("Usage Count: " + duster2.usageCount);
        System.out.println("Is Eco-Friendly: " + duster2.isEcoFriendly);
        System.out.println("Feature: " + duster2.feature);
        System.out.println("Usage Type: " + duster2.usageType);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Brand: " + duster.brand);
        System.out.println("Material: " + duster.material);
        System.out.println("Color: " + duster.color);
        System.out.println("Length: " + duster.length + " cm");
        System.out.println("Width: " + duster.width + " cm");
        System.out.println("Height: " + duster.height + " cm");
        System.out.println("Has Handle: " + duster.hasHandle);
        System.out.println("Surface Type: " + duster.surfaceType);
        System.out.println("Is Washable: " + duster.isWashable);
        System.out.println("Country of Origin: " + duster.countryOfOrigin);
        System.out.println("Warranty Period: " + duster.warrantyPeriod + " years");
        System.out.println("Usage Count: " + duster.usageCount);
        System.out.println("Is Eco-Friendly: " + duster.isEcoFriendly);
        System.out.println("Feature: " + duster.feature);
        System.out.println("Usage Type: " + duster.usageType);
    }
}
