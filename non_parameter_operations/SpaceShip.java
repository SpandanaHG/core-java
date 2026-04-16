class SpaceShip {

    String name;
    String type;
    double speed;
    double fuelCapacity;
    String mission;
    String country;
    int crewSize;
    double weight;
    String material;
    String launchYear;

    SpaceShip(String name, String type, double speed, double fuelCapacity,
              String mission, String country, int crewSize,
              double weight, String material, String launchYear) {

        this.name = name;
        this.type = type;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.mission = mission;
        this.country = country;
        this.crewSize = crewSize;
        this.weight = weight;
        this.material = material;
        this.launchYear = launchYear;
    }

    void display() {
        System.out.println("Running display in SpaceShip");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Speed: " + this.speed);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Mission: " + this.mission);
        System.out.println("Country: " + this.country);
        System.out.println("Crew Size: " + this.crewSize);
        System.out.println("Weight: " + this.weight);
        System.out.println("Material: " + this.material);
        System.out.println("Launch Year: " + this.launchYear);
    }
}