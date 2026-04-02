class Boomer {

    String type;
    String color;
    double price;
    double weight;
    String brand;
    String flavor;
    boolean sugarFree;
    String shape;
    int pieces;
    String origin;

    Boomer(String type, String color, double price, double weight, String brand, String flavor, boolean sugarFree, String shape, int pieces, String origin) 
	{

        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.brand = brand;
        this.flavor = flavor;
        this.sugarFree = sugarFree;
        this.shape = shape;
        this.pieces = pieces;
        this.origin = origin;
    }

    void display() {
        System.out.println("Type: "+this.type);
		System.out.println("Color: "+this.color); 
		System.out.println("Price: "+this.price);
		System.out.println("Weight: "+this.weight);
        System.out.println("Brand: "+this.brand);
		System.out.println("Flavor: "+this.flavor);
		System.out.println("Sugar Free: "+this.sugarFree);
		System.out.println("Shape: "+this.shape);
        System.out.println("Pieces: "+this.pieces);
		System.out.println("Origin: "+this.origin);
    }
}