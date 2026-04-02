class Rocket {

    String type;
    String fuelType;
    double price;
    double weight;
    String manufacturer;
    String mission;
    boolean reusable;
    double height;
    int stages;
    String origin;

    Rocket(String type, String fuelType, double price, double weight, String manufacturer, String mission, boolean reusable, double height, int stages, String origin) 
	{

        this.type = type;
        this.fuelType = fuelType;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.mission = mission;
        this.reusable = reusable;
        this.height = height;
        this.stages = stages;
        this.origin = origin;
    }
	
    void display() {
        System.out.println("Type: "+type);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight); 
		System.out.println("Manufacturer: "+manufacturer);
		System.out.println("Mission: "+mission);
		System.out.println("Reusable: "+reusable);
		System.out.println("Height: "+height); 
        System.out.println("Stages: "+stages);
		System.out.println("Origin: "+origin);
    }
}