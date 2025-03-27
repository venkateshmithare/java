public class Planet {
    String name;
    double diameter;
    double mass;
    double distanceFromSun;
    boolean hasRings;
    boolean hasLife;
    int numberOfMoons;
    String atmosphereComposition;
    String galaxyName;
    boolean isDwarfPlanet;
    double orbitalPeriod;
    double rotationalPeriod;
    boolean hasMagneticField;
    double gravity;
    String planetType;

    public Planet(String name, double diameter, double mass, double distanceFromSun, boolean hasRings,
                  boolean hasLife, int numberOfMoons, String atmosphereComposition, String galaxyName,
                  boolean isDwarfPlanet, double orbitalPeriod, double rotationalPeriod,
                  boolean hasMagneticField, double gravity, String planetType) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.distanceFromSun = distanceFromSun;
        this.hasRings = hasRings;
        this.hasLife = hasLife;
        this.numberOfMoons = numberOfMoons;
        this.atmosphereComposition = atmosphereComposition;
        this.galaxyName = galaxyName;
        this.isDwarfPlanet = isDwarfPlanet;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationalPeriod = rotationalPeriod;
        this.hasMagneticField = hasMagneticField;
        this.gravity = gravity;
        this.planetType = planetType;
    }
}
