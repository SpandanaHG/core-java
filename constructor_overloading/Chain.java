class Chain {

    String material;
    String color;
    double price;
    int length;
    boolean gold;

    Chain() {
        System.out.println("Default constructor");
    }

    Chain(String material) {
        this.material = material;
    }

    Chain(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Chain(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    Chain(String material, String color, double price, int length, boolean gold) {
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.gold = gold;
    }

    void display() {
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Length: " + this.length);
        System.out.println("Gold: " + this.gold);
		System.out.println("----------------------");
    }
}