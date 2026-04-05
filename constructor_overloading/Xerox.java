class Xerox {

    String brand;
    String type;
    double price;
    int speed;
    boolean colorPrint;

    Xerox() {
        System.out.println("Default constructor");
    }

    Xerox(String brand) {
        this.brand = brand;
    }

    Xerox(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Xerox(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    Xerox(String brand, String type, double price, int speed, boolean colorPrint) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.colorPrint = colorPrint;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Speed: " + this.speed);
        System.out.println("ColorPrint: " + this.colorPrint);
		System.out.println("----------------------");
    }
}