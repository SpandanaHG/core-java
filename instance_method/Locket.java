class Locket {

    String material;
    String color;
    double price;
    double weight;
    String brand;
    String shape;
    boolean goldPlated;
    String design;
    int warranty;
    String origin;

    Locket(String material, String color, double price, double weight, String brand, String shape, boolean goldPlated, String design, int warranty, String origin)
	{

        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.brand = brand;
        this.shape = shape;
        this.goldPlated = goldPlated;
        this.design = design;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() 
	{
        System.out.println("Material: "+this.material);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);
		System.out.println("Weight: "+this.weight);
		System.out.println("Brand: "+this.brand);
		System.out.println("Shape: "+this.shape);
		System.out.println("Gold Plated: "+this.goldPlated); 
		System.out.println("Design: "+this.design);
        System.out.println("Warranty: "+this.warranty);
		System.out.println("Origin: "+this.origin);
    }
}