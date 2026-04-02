class Tyre {

    String brand;
    String type;
    double price;
    double weight;
    String vehicleType;
    String size;
    boolean tubeless;
    String material;
    int warranty;
    String origin;

    Tyre(String brand, String type, double price, double weight, String vehicleType, String size, boolean tubeless, String material, int warranty, String origin) 
	{

        this.brand = brand;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.vehicleType = vehicleType;
        this.size = size;
        this.tubeless = tubeless;
        this.material = material;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight);
        System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Size: "+size);
		System.out.println("Tubeless: "+tubeless);
		System.out.println("Material: "+material);
		System.out.println("Waeeanty: "+warranty);
		System.out.println("Origin: "+origin);
    }
}