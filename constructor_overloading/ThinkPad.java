class ThinkPad {

    String brand;
    String model;
    double price;
    int ram;
    boolean touchscreen;

    ThinkPad() {
        System.out.println("Default constructor");
    }

    ThinkPad(String brand) {
        this.brand = brand;
    }

    ThinkPad(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    ThinkPad(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    ThinkPad(String brand, String model, double price, int ram, boolean touchscreen) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.touchscreen = touchscreen;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("RAM: " + this.ram);
        System.out.println("Touchscreen: " + this.touchscreen);
		System.out.println("----------------------");
    }
}