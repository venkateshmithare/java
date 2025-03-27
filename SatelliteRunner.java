public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite = new Satellite("Hubble", "USA", "Astronomical", 11110, 547, 7.5, true, 
                                            "April 24, 1990", "Low Earth Orbit", true, "NASA", 30, false, 
                                            "Space Observation", true, 2800, false, "Hydrazine", true, "Discovery");

        Satellite satellite1 = new Satellite("Hubble", "USA", "Astronomical", 11110, 547, 7.5, true, 
                                             "April 24, 1990", "Low Earth Orbit", true, "NASA", 30, false, 
                                             "Space Observation", true, 2800, false, "Hydrazine", true, "Discovery");

        Satellite satellite2 = new Satellite("Hubble", "USA", "Astronomical", 11110, 547, 7.5, true, 
                                             "April 24, 1990", "Low Earth Orbit", true, "NASA", 30, false, 
                                             "Space Observation", true, 2800, false, "Hydrazine", true, "Discovery");

        System.out.println("Name: " + satellite1.name);
        System.out.println("Country: " + satellite1.country);
        System.out.println("Type: " + satellite1.type);
        System.out.println("Weight: " + satellite1.weight + " kg");
        System.out.println("Altitude: " + satellite1.altitude + " km");
        System.out.println("Speed: " + satellite1.speed + " km/s");
        System.out.println("Operational: " + satellite1.isOperational);
        System.out.println("Launch Date: " + satellite1.launchDate);
        System.out.println("Orbit Type: " + satellite1.orbitType);
        System.out.println("Has Solar Panels: " + satellite1.hasSolarPanels);
        System.out.println("Manufacturer: " + satellite1.manufacturer);
        System.out.println("Mission Duration: " + satellite1.missionDuration + " years");
        System.out.println("Geostationary: " + satellite1.isGeostationary);
        System.out.println("Purpose: " + satellite1.purpose);
        System.out.println("Has Communication System: " + satellite1.hasCommunicationSystem);
        System.out.println("Power Capacity: " + satellite1.powerCapacity + " W");
        System.out.println("Reusable: " + satellite1.isReusable);
        System.out.println("Fuel Type: " + satellite1.fuelType);
        System.out.println("Has Scientific Instruments: " + satellite1.hasScientificInstruments);
        System.out.println("Launch Vehicle: " + satellite1.launchVehicle);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Name: " + satellite2.name);
        System.out.println("Country: " + satellite2.country);
        System.out.println("Type: " + satellite2.type);
        System.out.println("Weight: " + satellite2.weight + " kg");
        System.out.println("Altitude: " + satellite2.altitude + " km");
        System.out.println("Speed: " + satellite2.speed + " km/s");
        System.out.println("Operational: " + satellite2.isOperational);
        System.out.println("Launch Date: " + satellite2.launchDate);
        System.out.println("Orbit Type: " + satellite2.orbitType);
        System.out.println("Has Solar Panels: " + satellite2.hasSolarPanels);
        System.out.println("Manufacturer: " + satellite2.manufacturer);
        System.out.println("Mission Duration: " + satellite2.missionDuration + " years");
        System.out.println("Geostationary: " + satellite2.isGeostationary);
        System.out.println("Purpose: " + satellite2.purpose);
        System.out.println("Has Communication System: " + satellite2.hasCommunicationSystem);
        System.out.println("Power Capacity: " + satellite2.powerCapacity + " W");
        System.out.println("Reusable: " + satellite2.isReusable);
        System.out.println("Fuel Type: " + satellite2.fuelType);
        System.out.println("Has Scientific Instruments: " + satellite2.hasScientificInstruments);
        System.out.println("Launch Vehicle: " + satellite2.launchVehicle);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Name: " + satellite.name);
        System.out.println("Country: " + satellite.country);
        System.out.println("Type: " + satellite.type);
        System.out.println("Weight: " + satellite.weight + " kg");
        System.out.println("Altitude: " + satellite.altitude + " km");
        System.out.println("Speed: " + satellite.speed + " km/s");
        System.out.println("Operational: " + satellite.isOperational);
        System.out.println("Launch Date: " + satellite.launchDate);
        System.out.println("Orbit Type: " + satellite.orbitType);
        System.out.println("Has Solar Panels: "
