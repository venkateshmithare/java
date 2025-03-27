public class PaintBrushRunner {
    public static void main(String[] args) {
        PaintBrush paintBrush = new PaintBrush("Camlin", "Nylon", "Blue", 15.0, 2.0, true, "Flat", true, 
                                               "Acrylic", true, "India", 2, true, "Wood", true, 100, 
                                               true, "Oil-based", true, "Canvas");

        PaintBrush paintBrush1 = new PaintBrush("Camlin", "Nylon", "Blue", 15.0, 2.0, true, "Flat", true, 
                                                "Acrylic", true, "India", 2, true, "Wood", true, 100, 
                                                true, "Oil-based", true, "Canvas");

        PaintBrush paintBrush2 = new PaintBrush("Camlin", "Nylon", "Blue", 15.0, 2.0, true, "Flat", true, 
                                                "Acrylic", true, "India", 2, true, "Wood", true, 100, 
                                                true, "Oil-based", true, "Canvas");

        System.out.println("Brand: " + paintBrush1.brand);
        System.out.println("Material: " + paintBrush1.material);
        System.out.println("Color: " + paintBrush1.color);
        System.out.println("Length: " + paintBrush1.length + " cm");
        System.out.println("Width: " + paintBrush1.width + " cm");
        System.out.println("Is Synthetic: " + paintBrush1.isSynthetic);
        System.out.println("Brush Type: " + paintBrush1.brushType);
        System.out.println("Has Grip: " + paintBrush1.hasGrip);
        System.out.println("Usage Type: " + paintBrush1.usageType);
        System.out.println("Is Washable: " + paintBrush1.isWashable);
        System.out.println("Country of Origin: " + paintBrush1.countryOfOrigin);
        System.out.println("Warranty Period: " + paintBrush1.warrantyPeriod + " years");
        System.out.println("Is Eco-Friendly: " + paintBrush1.isEcoFriendly);
        System.out.println("Handle Material: " + paintBrush1.handleMaterial);
        System.out.println("Is Reusable: " + paintBrush1.isReusable);
        System.out.println("Bristle Count: " + paintBrush1.bristleCount);
        System.out.println("Is Water Resistant: " + paintBrush1.isWaterResistant);
        System.out.println("Paint Type: " + paintBrush1.paintType);
        System.out.println("Has Protective Cover: " + paintBrush1.hasProtectiveCover);
        System.out.println("Application Surface: " + paintBrush1.applicationSurface);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Brand: " + paintBrush2.brand);
        System.out.println("Material: " + paintBrush2.material);
        System.out.println("Color: " + paintBrush2.color);
        System.out.println("Length: " + paintBrush2.length + " cm");
        System.out.println("Width: " + paintBrush2.width + " cm");
        System.out.println("Is Synthetic: " + paintBrush2.isSynthetic);
        System.out.println("Brush Type: " + paintBrush2.brushType);
        System.out.println("Has Grip: " + paintBrush2.hasGrip);
        System.out.println("Usage Type: " + paintBrush2.usageType);
        System.out.println("Is Washable: " + paintBrush2.isWashable);
        System.out.println("Country of Origin: " + paintBrush2.countryOfOrigin);
        System.out.println("Warranty Period: " + paintBrush2.warrantyPeriod
