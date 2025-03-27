public class Drone {
    String brand;
    String model;
    String type;
    double weight;
    double maxSpeed;
    double flightTime;
    double range;
    int batteryCapacity;
    boolean hasCamera;
    double cameraResolution;
    boolean gpsEnabled;
    boolean obstacleAvoidance;
    int maxAltitude;
    String controllerType;
    boolean liveStreaming;
    String connectivity;
    String material;
    boolean foldable;
    int numberOfRotors;
    String purpose;

    public Drone(String brand, String model, String type, double weight, double maxSpeed, double flightTime, double range,
                 int batteryCapacity, boolean hasCamera, double cameraResolution, boolean gpsEnabled,
                 boolean obstacleAvoidance, int maxAltitude, String controllerType, boolean liveStreaming,
                 String connectivity, String material, boolean foldable, int numberOfRotors, String purpose) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.flightTime = flightTime;
        this.range = range;
        this.batteryCapacity = batteryCapacity;
        this.hasCamera = hasCamera;
        this.cameraResolution = cameraResolution;
        this.gpsEnabled = gpsEnabled;
        this.obstacleAvoidance = obstacleAvoidance;
        this.maxAltitude = maxAltitude;
        this.controllerType = controllerType;
        this.liveStreaming = liveStreaming;
        this.connectivity = connectivity;
        this.material = material;
        this.foldable = foldable;
        this.numberOfRotors = numberOfRotors;
        this.purpose = purpose;
    }
}
