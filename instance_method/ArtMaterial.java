class ArtMaterial {

    String name;
    String brand;
    double price;
    double weight;
    String type;
    String color;
    boolean nonToxic;
    String usage;
    int quantity;
    String origin;

    ArtMaterial(String name, String brand, double price, double weight, String type, String color, boolean nonToxic, String usage, int quantity, String origin) 
	{

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.color = color;
        this.nonToxic = nonToxic;
        this.usage = usage;
        this.quantity = quantity;
        this.origin = origin;
    }

    void display() {
        System.out.println("Name: "+name);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight);
        System.out.println("Type: "+type);
		System.out.println("Color: "+color);
		System.out.println("Non-Toxic: "+nonToxic);
		System.out.println("Usage: "+usage);
        System.out.println("Quantity: "+quantity);
		System.out.println("Origin: "+origin);
    }
}