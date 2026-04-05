class Locket {

    String material;
    String color;
    double price;
    int weight;
    boolean gold;

    Locket() {
        System.out.println("Default constructor");
    }

    Locket(String material) {
        this.material = material;
    }

    Locket(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Locket(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    Locket(String material, String color, double price, int weight, boolean gold) {
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.gold = gold;
    }

    void display() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Gold: " + gold);
        System.out.println("----------------------");
    }
}