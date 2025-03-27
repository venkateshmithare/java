public class Rocket {
    String name;
    String manufacturer;
    String fuelType;
    double height;
    double diameter;
    double weight;
    int stages;
    int engines;
    double thrust;
    double payloadCapacity;
    boolean isReusable;
    boolean hasEscapeSystem;
    String launchSite;
    int crewCapacity;
    double maxSpeed;
    boolean isManned;
    String orbitType;
    String launchDate;
    boolean hasAIControl;
    String missionType;

    public Rocket(String name, String manufacturer, String fuelType, double height, double diameter, double weight,
                  int stages, int engines, double thrust, double payloadCapacity, boolean isReusable,
                  boolean hasEscapeSystem, String launchSite, int crewCapacity, double maxSpeed, boolean isManned,
                  String orbitType, String launchDate, boolean hasAIControl, String missionType) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
        this.stages = stages;
        this.engines = engines;
        this.thrust = thrust;
        this.payloadCapacity = payloadCapacity;
        this.isReusable = isReusable;
        this.hasEscapeSystem = hasEscapeSystem;
        this.launchSite = launchSite;
        this.crewCapacity = crewCapacity;
        this.maxSpeed = maxSpeed;
        this.isManned = isManned;
        this.orbitType = orbitType;
        this.launchDate = launchDate;
        this.hasAIControl = hasAIControl;
        this.missionType = missionType;
    }
}
