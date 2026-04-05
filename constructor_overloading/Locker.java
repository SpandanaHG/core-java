class Locker {

    String brand;
    String color;
    double price;
    int capacity;
    boolean digital;

    Locker() {
        System.out.println("Default constructor");
    }

    Locker(String brand) {
        this.brand = brand;
    }

    Locker(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Locker(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    Locker(String brand, String color, double price, int capacity, boolean digital) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
        this.digital = digital;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Digital: " + this.digital);
		System.out.println("----------------------");
       
    }
}