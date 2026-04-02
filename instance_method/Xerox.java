class Xerox {

    String brand;
    String model;
    double price;
    double weight;
    String type;
    boolean colorPrint;
    int speed;
    String connectivity;
    int warranty;
    String origin;

    Xerox(String brand, String model, double price, double weight, String type, boolean colorPrint, int speed, String connectivity, int warranty, String origin) 
	{

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.colorPrint = colorPrint;
        this.speed = speed;
        this.connectivity = connectivity;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: "+this.brand);
		System.out.println("Model: "+this.model); 
		System.out.println("Price: "+this.price);
		System.out.println("Weight: "+this.weight); 
        System.out.println("Type: "+this.type); 
		System.out.println("Color Print: "+this.colorPrint);
		System.out.println("Speed: "+this.speed);
		System.out.println("Connectivity: "+this.connectivity);
        System.out.println("Warranty: "+this.warranty);
		System.out.println("Origin: "+this.origin);
    }
}