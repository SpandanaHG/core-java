class Specs {

    String frameType;
    String color;
    double price;
    double weight;
    String brand;
    String lensType;
    boolean antiGlare;
    String usage;
    int warranty;
    String origin;

    Specs(String frameType, String color, double price, double weight, String brand, String lensType, boolean antiGlare, String usage, int warranty, String origin) 
	{

        this.frameType = frameType;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.brand = brand;
        this.lensType = lensType;
        this.antiGlare = antiGlare;
        this.usage = usage;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Frame Type: "+this.frameType);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);
		System.out.println("Weight: "+this.weight);
		System.out.println("Brand: "+this.brand);
		System.out.println("Brand: "+this.brand);
		System.out.println("Lens Type: "+this.lensType);
		System.out.println("Anti Glare: "+this.antiGlare);
		System.out.println("Usage: "+this.usage);
		System.out.println("Warranty: "+this.warranty);
		System.out.println("Origin: "+this.origin);
    }
}