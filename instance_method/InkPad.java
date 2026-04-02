class InkPad {

    String brand;
    String color;
    double price;
    double weight;
    String type;
    boolean refillable;
    String size;
    String material;
    int warranty;
    String origin;

    InkPad(String brand, String color, double price, double weight, String type, boolean refillable, String size, String material, int warranty, String origin) 
	{

        this.brand = brand;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.refillable = refillable;
        this.size = size;
        this.material = material;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: "+this.brand);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);
		System.out.println("Weight: "+this.weight);
        System.out.println("Type: "+this.type);
		System.out.println("Refillable: "+this.refillable);
		System.out.println("Size: "+this.size);
		System.out.println("Material: "+this.material);
        System.out.println("Warranty: "+this.warranty);
		System.out.println("Origin: "+this.origin);
    }
}