class Specs {

    String brand;
    String color;
    double price;
    int power;
    boolean antiGlare;

    Specs() {
        System.out.println("Default constructor");
    }

    Specs(String brand) {
        this.brand = brand;
    }

    Specs(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Specs(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    Specs(String brand, String color, double price, int power, boolean antiGlare) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.power = power;
        this.antiGlare = antiGlare;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Power: " + this.power);
        System.out.println("AntiGlare: " + this.antiGlare);
		System.out.println("----------------------");
    }
}