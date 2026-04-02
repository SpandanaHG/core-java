class Chain {

    String material;
    String color;
    double price;
    double length;
    String brand;
    String type;
    boolean goldPlated;
    String design;
    int warranty;
    String origin;

    Chain(String material, String color, double price, double length, String brand, String type, boolean goldPlated, String design, int warranty, String origin) 
	{

        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.brand = brand;
        this.type = type;
        this.goldPlated = goldPlated;
        this.design = design;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Material: "+material);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Length: "+length);
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type); 
		System.out.println("Gold Plated: "+goldPlated);
		System.out.println("Design: "+design);
		System.out.println("Warranty: "+warranty);
		System.out.println("Origin: "+origin);
    }
}