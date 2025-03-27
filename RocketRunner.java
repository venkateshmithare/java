public class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Falcon 9", "SpaceX", "RP-1/LOX", 70.0, 3.7, 549054, 2, 9, 7607, 22800, true, true,
                                   "Cape Canaveral", 0, 27000, false, "LEO", "2024-04-15", true, "Satellite Deployment");

        Rocket rocket1 = new Rocket("Falcon 9", "SpaceX", "RP-1/LOX", 70.0, 3.7, 549054, 2, 9, 7607, 22800, true, true,
                                    "Cape Canaveral", 0, 27000, false, "LEO", "2024-04-15", true, "Satellite Deployment");

        Rocket rocket2 = new Rocket("Falcon 9", "SpaceX", "RP-1/LOX", 70.0, 3.7, 549054, 2, 9, 7607, 22800, true, true,
                                    "Cape Canaveral", 0, 27000, false, "LEO", "2024-04-15", true, "Satellite Deployment");

        System.out.println("Name: " + rocket1.name);
        System.out.println("Manufacturer: " + rocket1.manufacturer);
        System.out.println("Fuel Type: " + rocket1.fuelType);
        System.out.println("Height: " + rocket1.height + " m");
        System.out.println("Diameter: " + rocket1.diameter + " m");
        System.out.println("Weight: " + rocket1.weight + " kg");
        System.out.println("Stages: " + rocket1.stages);
        System.out.println("Engines: " + rocket1.engines);
        System.out.println("Thrust: " + rocket1.thrust + " kN");
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity + " kg");
        System.out.println("Is Reusable: " + rocket1.isReusable);
        System.out.println("Has Escape System: " + rocket1.hasEscapeSystem);
        System.out.println("Launch Site: " + rocket1.launchSite);
        System.out.println("Crew Capacity: " + rocket1.crewCapacity);
        System.out.println("Max Speed: " + rocket1.maxSpeed + " km/h");
        System.out.println("Is Manned: " + rocket1.isManned);
        System.out.println("Orbit Type: " + rocket1.orbitType);
        System.out.println("Launch Date: " + rocket1.launchDate);
        System.out.println("Has AI Control: " + rocket1.hasAIControl);
        System.out.println("Mission Type: " + rocket1.missionType);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Name: " + rocket2.name);
        System.out.println("Manufacturer: " + rocket2.manufacturer);
        System.out.println("Fuel Type: " + rocket2.fuelType);
        System.out.println("Height: " + rocket2.height + " m");
        System.out.println("Diameter: " + rocket2.diameter + " m");
        System.out.println("Weight: " + rocket2.weight + " kg");
        System.out.println("Stages: " + rocket2.stages);
        System.out.println("Engines: " + rocket2.engines);
        System.out.println("Thrust: " + rocket2.thrust + " kN");
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity + " kg");
        System.out.println("Is Reusable: " + rocket2.isReusable);
        System.out.println("Has Escape System: " + rocket2.hasEscapeSystem);
        System.out.println("Launch Site: " + rocket2.launchSite);
        System.out.println("Crew Capacity: " + rocket2.crewCapacity);
        System.out.println("Max Speed: " + rocket2.maxSpeed + " km/h");
        System.out.println("Is Manned: " + rocket2.isManned);
        System.out.println("Orbit Type: " + rocket2.orbitType);
        System.out.println("Launch Date: " + rocket2.launchDate);
        System.out.println("Has AI Control: " + rocket2.hasAIControl);
        System.out.println("Mission Type: " + rocket2.missionType);

        System.out.println("  ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("  ");

        System.out.println("Name: " + rocket.name);
        System.out.println("Manufacturer: " + rocket.manufacturer);
        System.out.println("Fuel Type: " + rocket.fuelType);
        System.out.println("Height: " + rocket.height + " m");
        System.out.println("Diameter: " + rocket.diameter + " m");
        System.out.println("Weight: " + rocket.weight + " kg");
        System.out.println("Stages: " + rocket.stages);
        System.out.println("Engines: " + rocket.engines);
        System.out.println("Thrust: " + rocket.thrust + " kN");
        System.out.println("Payload Capacity: " + rocket.payloadCapacity + " kg");
        System.out.println("Is Reusable: " + rocket.isReusable);
        System.out.println("Has Escape System: " + rocket.hasEscapeSystem);
        System.out.println("Launch Site: " + rocket.launchSite);
        System.out.println("Crew Capacity: " + rocket.crewCapacity);
        System.out.println("Max Speed: " + rocket.maxSpeed + " km/h");
        System.out.println("Is Manned: " + rocket.isManned);
        System.out.println("Orbit Type: " + rocket.orbitType);
        System.out.println("Launch Date: " + rocket.launchDate);
        System.out.println("Has AI Control: " + rocket.hasAIControl);
        System.out.println("Mission Type: " + rocket.missionType);
    }
}
