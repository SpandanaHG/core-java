class Stamp {

    String brand;
    String type;
    double price;
    double weight;
    String shape;
    boolean selfInking;
    String usage;
    String material;
    int warranty;
    String origin;

    Stamp(String brand, String type, double price, double weight, String shape, boolean selfInking, String usage, String material, int warranty, String origin) {

        this.brand = brand;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.selfInking = selfInking;
        this.usage = usage;
        this.material = material;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight);
        System.out.println("Shape: "+shape);
		System.out.println("Self Inking: "+selfInking);
		System.out.println("Usage: "+usage);
		System.out.println("Material: "+material);
        System.out.println("Warranty: "+warranty);
		System.out.println("Origin: "+origin);
    }
}