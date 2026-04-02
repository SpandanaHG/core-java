class Locker {

    String material;
    String color;
    double price;
    double height;
    String brand;
    String type;
    boolean digitalLock;
    String usage;
    int compartments;
    String origin;

    Locker(String material, String color, double price, double height, String brand, String type, boolean digitalLock, String usage, int compartments, String origin) 
	{

        this.material = material;
        this.color = color;
        this.price = price;
        this.height = height;
        this.brand = brand;
        this.type = type;
        this.digitalLock = digitalLock;
        this.usage = usage;
        this.compartments = compartments;
        this.origin = origin;
    }

    void display() {
        System.out.println("Material: "+material);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Height: "+height); 
        System.out.println("Brand: "+brand); 
		System.out.println("Type: "+type);
		System.out.println("Digital Lock: "+digitalLock);
		System.out.println("Usage: "+usage); 
        System.out.println("Compartments: "+compartments);
		System.out.println("Origin: "+origin);
    }
}