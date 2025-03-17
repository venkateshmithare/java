public class Venkatesh19 {
    public static void acInfo(String brand) {
        System.out.println("AC Brand: " + brand);
    }
    
    public static void acInfo(String brand, int capacity) {
        System.out.println("AC Brand: " + brand + " | Capacity: " + capacity + " Ton");
    }
    
    public static void acInfo(String brand, String type) {
        System.out.println("AC Brand: " + brand + " | Type: " + type);
    }
    
    public static void acInfo(String brand, double powerConsumption) {
        System.out.println("AC Brand: " + brand + " | Power Consumption: " + powerConsumption + " kW");
    }
    
    public static void acInfo(String brand, boolean isInverter) {
        System.out.println("AC Brand: " + brand + " | Inverter: " + isInverter);
    }
    
    public static void acInfo(String brand, int capacity, double noiseLevel) {
        System.out.println("AC Brand: " + brand + " | Capacity: " + capacity + " Ton | Noise Level: " + noiseLevel + " dB");
    }
    
    public static void acInfo(String brand, String type, boolean hasWiFi) {
        System.out.println("AC Brand: " + brand + " | Type: " + type + " | WiFi Enabled: " + hasWiFi);
    }
    
    public static void acInfo(String brand, double powerConsumption, double coolingCapacity) {
        System.out.println("AC Brand: " + brand + " | Power Consumption: " + powerConsumption + " kW | Cooling Capacity: " + coolingCapacity + " BTU");
    }
    
    public static void acInfo(String brand, int warranty, double price) {
        System.out.println("AC Brand: " + brand + " | Warranty: " + warranty + " years | Price: " + price);
    }
    
    public static void acInfo(String brand, String color, boolean hasRemoteControl) {
        System.out.println("AC Brand: " + brand + " | Color: " + color + " | Remote Control: " + hasRemoteControl);
    }
    
    public static void acInfo(String brand, int voltage, double energyRating) {
        System.out.println("AC Brand: " + brand + " | Voltage: " + voltage + "V | Energy Rating: " + energyRating + " Stars");
    }
    
    public static void acInfo(String brand, boolean isSmart, String refrigerantType) {
        System.out.println("AC Brand: " + brand + " | Smart: " + isSmart + " | Refrigerant Type: " + refrigerantType);
    }
    
    public static void acInfo(String brand, int capacity, boolean hasAutoClean) {
        System.out.println("AC Brand: " + brand + " | Capacity: " + capacity + " Ton | Auto Clean: " + hasAutoClean);
    }
    
    public static void acInfo(String brand, String mode, int fanSpeed) {
        System.out.println("AC Brand: " + brand + " | Mode: " + mode + " | Fan Speed: " + fanSpeed);
    }
    
    public static void acInfo(String brand, int year, String installationType) {
        System.out.println("AC Brand: " + brand + " | Year: " + year + " | Installation Type: " + installationType);
    }
    
    public static void acInfo(String brand, boolean hasDehumidifier, double filterQuality) {
        System.out.println("AC Brand: " + brand + " | Dehumidifier: " + hasDehumidifier + " | Filter Quality: " + filterQuality);
    }
    
    public static void acInfo(String brand, int weight, boolean hasTurboMode) {
        System.out.println("AC Brand: " + brand + " | Weight: " + weight + " kg | Turbo Mode: " + hasTurboMode);
    }
    
    public static void acInfo(String brand, String model, double coolingSpeed) {
        System.out.println("AC Brand: " + brand + " | Model: " + model + " | Cooling Speed: " + coolingSpeed + " m/s");
    }
    
    public static void acInfo(String brand, boolean hasSleepMode, double ecoModeEfficiency) {
        System.out.println("AC Brand: " + brand + " | Sleep Mode: " + hasSleepMode + " | Eco Mode Efficiency: " + ecoModeEfficiency);
    }
    
    public static void acInfo(String brand, int noiseLevel, boolean isEnergyEfficient) {
        System.out.println("AC Brand: " + brand + " | Noise Level: " + noiseLevel + " dB | Energy Efficient: " + isEnergyEfficient);
    }
    
    public static void main(String[] args) {
        acInfo("Samsung");
        acInfo("LG", 1);
        acInfo("Daikin", "Split");
        acInfo("Hitachi", 1.5);
        acInfo("Blue Star", true);
        acInfo("Voltas", 2, 45.5);
        acInfo("Carrier", "Window", false);
        acInfo("Whirlpool", 2.3, 5000);
        acInfo("OGeneral", 5, 60000);
        acInfo("Toshiba", "White", true);
        acInfo("Panasonic", 220, 4.5);
        acInfo("Mitsubishi", false, "R32");
        acInfo("Haier", 1, true);
        acInfo("Godrej", "Cooling", 3);
        acInfo("IFB", 2023, "Wall Mounted");
        acInfo("Lloyd", true, 99.9);
        acInfo("Havells", 35, true);
        acInfo("Kelvinator", "K1234", 2.8);
        acInfo("Sansui", true, 85.3);
        acInfo("Videocon", 40, false);
    }
}