class NailCutter {
	
    String brand;
    int price;
    NailType type;
    String color; 
    boolean sharp;

    NailCutter(String brand, int price, NailType type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    void info() {
        System.out.println("Running info in NailCutter");
		System.out.println("Brand: "+this.brand);
		System.out.println("Price: "+this.price);
		System.out.println("Type: "+this.type);
		System.out.println("Color: "+this.color);
		System.out.println("Sharp: "+this.sharp);
    }
}