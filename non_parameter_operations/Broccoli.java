class Broccoli {

    String color;
    double weight;
    String type;
    String taste;
    String origin;
    double price;
    String size;
    String freshness;
    String usage;
    String shape;

    Broccoli(String color, double weight, String type, String taste,
             String origin, double price, String size,
             String freshness, String usage, String shape) {

        this.color = color;
        this.weight = weight;
        this.type = type;
        this.taste = taste;
        this.origin = origin;
        this.price = price;
        this.size = size;
        this.freshness = freshness;
        this.usage = usage;
        this.shape = shape;
    }

    void display() {
        System.out.println("Running display in Broccoli");
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight);
        System.out.println("Type: " + this.type);
        System.out.println("Taste: " + this.taste);
        System.out.println("Origin: " + this.origin);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Freshness: " + this.freshness);
        System.out.println("Usage: " + this.usage);
        System.out.println("Shape: " + this.shape);
    }
}