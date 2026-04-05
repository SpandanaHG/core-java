class SoftDrink {

    String brand;
    String flavor;
    double price;
    int quantity;
    boolean cold;

    SoftDrink() {
        System.out.println("Default constructor");
    }

    SoftDrink(String brand) {
        this.brand = brand;
    }

    SoftDrink(String brand, String flavor) {
        this.brand = brand;
        this.flavor = flavor;
    }

    SoftDrink(String brand, String flavor, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    SoftDrink(String brand, String flavor, double price, int quantity, boolean cold) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.cold = cold;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Cold: " + this.cold);
		System.out.println("----------------------");
     
    }
}