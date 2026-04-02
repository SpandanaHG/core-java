class WindShield {

    String brand;
    String type;
    double price;
    double weight;
    String vehicleType;
    String material;
    boolean scratchResistant;
    String size;
    int warranty;
    String origin;

    WindShield(String brand, String type, double price, double weight, String vehicleType, String material, boolean scratchResistant, String size, int warranty, String origin)
	{

        this.brand = brand;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.vehicleType = vehicleType;
        this.material = material;
        this.scratchResistant = scratchResistant;
        this.size = size;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight);
        System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Material: "+material);
		System.out.println("Scratch Resistant: "+scratchResistant);
		System.out.println("Size: "+size);
		System.out.println("Warranty: "+warranty);
		System.out.println("Origin: "+origin);
    }
}