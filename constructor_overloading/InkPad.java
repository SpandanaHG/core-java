class InkPad {

    String brand;
    String color;
    double price;
    int size;
    boolean refillable;

    InkPad() {
        System.out.println("Default constructor");
    }

    InkPad(String brand) {
        this.brand = brand;
    }

    InkPad(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    InkPad(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    InkPad(String brand, String color, double price, int size, boolean refillable) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.refillable = refillable;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Refillable: " + this.refillable);
		System.out.println("----------------------");
    }
}