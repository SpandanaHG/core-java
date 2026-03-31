class Engine {

    String type;
    String brand;
    double power;
    int cylinders;
    double capacity;
    String fuelType;
    boolean turbo;
    double weight;
    String coolingSystem;
    String ignitionType;
    String usage;
    String manufacturer;
    int warranty;
    String country;
    String model;
    String version;
    double efficiency;
    String emissionType;
    boolean electric;
    String color;
    String design;
    String code;
    String category;
    String availability;
    double price;
    boolean durable;

    Engine() {
		System.out.println("No-args constructor of the class Engine");
        type = "IC Engine";
        brand = "Honda";
        power = 150.5;
        cylinders = 4;
        capacity = 2000;
        fuelType = "Petrol";
        turbo = true;
        weight = 180.5;
        coolingSystem = "Liquid";
        ignitionType = "Spark";
        usage = "Automobile";
        manufacturer = "Honda Motors";
        warranty = 3;
        country = "Japan";
        model = "VTEC";
        version = "2025";
        efficiency = 18.5;
        emissionType = "BS6";
        electric = false;
        color = "Silver";
        design = "Compact";
        code = "EN01";
        category = "Mechanical";
        availability = "Available";
        price = 150000;
        durable = true;
    }
}