public class Satellite {
    String name;
    String country;
    String type;
    double weight;
    double altitude;
    double speed;
    boolean isOperational;
    String launchDate;
    String orbitType;
    boolean hasSolarPanels;
    String manufacturer;
    int missionDuration;
    boolean isGeostationary;
    String purpose;
    boolean hasCommunicationSystem;
    int powerCapacity;
    boolean isReusable;
    String fuelType;
    boolean hasScientificInstruments;
    String launchVehicle;

    public Satellite(String name, String country, String type, double weight, double altitude, double speed,
                     boolean isOperational, String launchDate, String orbitType, boolean hasSolarPanels,
                     String manufacturer, int missionDuration, boolean isGeostationary, String purpose,
                     boolean hasCommunicationSystem, int powerCapacity, boolean isReusable, String fuelType,
                     boolean hasScientificInstruments, String launchVehicle) {
        this.name = name;
        this.country = country;
        this.type = type;
        this.weight = weight;
        this.altitude = altitude;
        this.speed = speed;
        this.isOperational = isOperational;
        this.launchDate = launchDate;
        this.orbitType = orbitType;
        this.hasSolarPanels = hasSolarPanels;
        this.manufacturer = manufacturer;
        this.missionDuration = missionDuration;
        this.isGeostationary = isGeostationary;
        this.purpose = purpose;
        this.hasCommunicationSystem = hasCommunicationSystem;
        this.powerCapacity = powerCapacity;
        this.isReusable = isReusable;
        this.fuelType = fuelType;
        this.hasScientificInstruments = hasScientificInstruments;
        this.launchVehicle = launchVehicle;
    }
}
