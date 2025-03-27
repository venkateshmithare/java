public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth", 12742, 5.972E24, 9.81, 365.25, 24, 1, false, 
                                    "Nitrogen, Oxygen", 15.0, "Unknown", "Ancient", 
                                    true, 149.6E6, true, "Iron", 23.5, false, true, "Milky Way");

        Planet planet2 = new Planet("Mars", 6779, 6.39E23, 3.71, 687, 24.6, 2, false, 
                                    "Carbon Dioxide", -60, "Galileo Galilei", "1610", 
                                    false, 227.9E6, true, "Silicon", 25.2, false, true, "Milky Way");

        Planet planet3 = new Planet("Jupiter", 139820, 1.898E27, 24.79, 4333, 9.9, 79, true, 
                                    "Hydrogen, Helium", -145, "Galileo Galilei", "1610", 
                                    false, 778.5E6, true, "Hydrogen", 3.1, false, false, "Milky Way");

        // Printing details of planet1
        System.out.println("Planet Name: " + planet1.name);
        System.out.println("Diameter: " + planet1.diameter + " km");
        System.out.println("Mass: " + planet1.mass + " kg");
        System.out.println("Gravity: " + planet1.gravity + " m/s²");
        System.out.println("Orbital Period: " + planet1.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + planet1.rotationPeriod + " hours");
        System.out.println("Number of Moons: " + planet1.numberOfMoons);
        System.out.println("Has Rings: " + planet1.hasRings);
        System.out.println("Atmosphere Composition: " + planet1.atmosphereComposition);
        System.out.println("Average Temperature: " + planet1.averageTemperature + " °C");
        System.out.println("Discovered By: " + planet1.discoveredBy);
        System.out.println("Discovery Year: " + planet1.discoveryYear);
        System.out.println("Supports Life: " + planet1.supportsLife);
        System.out.println("Distance from Sun: " + planet1.distanceFromSun + " km");
        System.out.println("Has Magnetic Field: " + planet1.hasMagneticField);
        System.out.println("Dominant Element: " + planet1.dominantElement);
        System.out.println("Axial Tilt: " + planet1.axialTilt + " degrees");
        System.out.println("Is Dwarf Planet: " + planet1.isDwarfPlanet);
        System.out.println("Has Water: " + planet1.hasWater);
        System.out.println("Galaxy Name: " + planet1.galaxyName);

        System.out.println("-----------------------------------------------------------------");

        // Printing details of planet2
        System.out.println("Planet Name: " + planet2.name);
        System.out.println("Diameter: " + planet2.diameter + " km");
        System.out.println("Mass: " + planet2.mass + " kg");
        System.out.println("Gravity: " + planet2.gravity + " m/s²");
        System.out.println("Orbital Period: " + planet2.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + planet2.rotationPeriod + " hours");
        System.out.println("Number of Moons: " + planet2.numberOfMoons);
        System.out.println("Has Rings: " + planet2.hasRings);
        System.out.println("Atmosphere Composition: " + planet2.atmosphereComposition);
        System.out.println("Average Temperature: " + planet2.averageTemperature + " °C");
        System.out.println("Discovered By: " + planet2.discoveredBy);
        System.out.println("Discovery Year: " + planet2.discoveryYear);
        System.out.println("Supports Life: " + planet2.supportsLife);
        System.out.println("Distance from Sun: " + planet2.distanceFromSun + " km");
        System.out.println("Has Magnetic Field: " + planet2.hasMagneticField);
        System.out.println("Dominant Element: " + planet2.dominantElement);
        System.out.println("Axial Tilt: " + planet2.axialTilt + " degrees");
        System.out.println("Is Dwarf Planet: " + planet2.isDwarfPlanet);
        System.out.println("Has Water: " + planet2.hasWater);
        System.out.println("Galaxy Name: " + planet2.galaxyName);

        System.out.println("-----------------------------------------------------------------");

        // Printing details of planet3
        System.out.println("Planet Name: " + planet3.name);
        System.out.println("Diameter: " + planet3.diameter + " km");
        System.out.println("Mass: " + planet3.mass + " kg");
        System.out.println("Gravity: " + planet3.gravity + " m/s²");
        System.out.println("Orbital Period: " + planet3.orbitalPeriod + " days");
        System.out.println("Rotation Period: " + planet3.rotationPeriod + " hours");
        System.out.println("Number of Moons: " + planet3.numberOfMoons);
        System.out.println("Has Rings: " + planet3.hasRings);
        System.out.println("Atmosphere Composition: " + planet3.atmosphereComposition);
        System.out.println("Average Temperature: " + planet3.averageTemperature + " °C");
        System.out.println("Discovered By: " + planet3.discoveredBy);
        System.out.println("Discovery Year: " + planet3.discoveryYear);
        System.out.println("Supports Life: " + planet3.supportsLife);
        System.out.println("Distance from Sun: " + planet3.distanceFromSun + " km");
        System.out.println("Has Magnetic Field: " + planet3.hasMagneticField);
        System.out.println("Dominant Element: " + planet3.dominantElement);
        System.out.println("Axial Tilt: " + planet3.axialTilt + " degrees");
        System.out.println("Is Dwarf Planet: " + planet3.isDwarfPlanet);
        System.out.println("Has Water: " + planet3.hasWater);
        System.out.println("Galaxy Name: " + planet3.galaxyName);
    }
}
