class ArtMaterial {

    String type;
    String brand;
    double price;
    int quantity;
    boolean reusable;

    ArtMaterial() {
        System.out.println("Default constructor");
    }

    ArtMaterial(String type) {
        this.type = type;
    }

    ArtMaterial(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    ArtMaterial(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    ArtMaterial(String type, String brand, double price, int quantity, boolean reusable) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.reusable = reusable;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Reusable: " + this.reusable);
		System.out.println("----------------------");
       
    }
}