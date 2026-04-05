class Boomer {

    String brand;
    String flavor;
    double price;
    int quantity;
    boolean sugarFree;

    Boomer() {
        System.out.println("Default constructor");
    }

    Boomer(String brand) {
        this.brand = brand;
    }

    Boomer(String brand, String flavor) {
        this.brand = brand;
        this.flavor = flavor;
    }

    Boomer(String brand, String flavor, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    Boomer(String brand, String flavor, double price, int quantity, boolean sugarFree) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.sugarFree = sugarFree;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("SugarFree: " + this.sugarFree);
		System.out.println("----------------------");
    }
}