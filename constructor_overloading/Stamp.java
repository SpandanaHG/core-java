class Stamp {

    String type;
    String shape;
    double price;
    int size;
    boolean wooden;

    Stamp() {
        System.out.println("Default constructor");
    }

    Stamp(String type) {
        this.type = type;
    }

    Stamp(String type, String shape) {
        this.type = type;
        this.shape = shape;
    }

    Stamp(String type, String shape, double price) {
        this.type = type;
        this.shape = shape;
        this.price = price;
    }

    Stamp(String type, String shape, double price, int size, boolean wooden) {
        this.type = type;
        this.shape = shape;
        this.price = price;
        this.size = size;
        this.wooden = wooden;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Shape: " + this.shape);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Wooden: " + this.wooden);
        System.out.println("----------------------");
    }
}