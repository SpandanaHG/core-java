class Tyre {

    String brand;
    String type;
    double price;
    int size;
    boolean tubeless;

    Tyre() {
        System.out.println("Default constructor");
    }

    Tyre(String brand) {
        this.brand = brand;
    }

    Tyre(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Tyre(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    Tyre(String brand, String type, double price, int size, boolean tubeless) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.size = size;
        this.tubeless = tubeless;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Tubeless: " + this.tubeless);
		System.out.println("----------------------");
       
    }
}