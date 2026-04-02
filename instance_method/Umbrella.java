class Umbrella {

    String brand;
    String color;
    double price;
    double weight;
    String type;
    boolean automatic;
    String size;
    String material;
    int warranty;
    String origin;

    Umbrella(String brand, String color, double price, double weight, String type, boolean automatic, String size, String material, int warranty, String origin) 
	{

        this.brand = brand;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.automatic = automatic;
        this.size = size;
        this.material = material;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight);
        System.out.println("Type: "+type);
		System.out.println("Automatic: "+automatic);
		System.out.println("Size: "+size);
		System.out.println("Material: "+material);
        System.out.println("Warranty: "+warranty);
		System.out.println("Origin: "+origin);
    }
}