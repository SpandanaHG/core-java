class Umbrella {

    String brand;
    String color;
    double price;
    int size;
    boolean automatic;

    Umbrella() {
        System.out.println("Default constructor");
    }

    Umbrella(String brand) {
        this.brand = brand;
    }

    Umbrella(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Umbrella(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    Umbrella(String brand, String color, double price, int size, boolean automatic) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.automatic = automatic;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Automatic: " + this.automatic);
		System.out.println("----------------------");
       
    }
}