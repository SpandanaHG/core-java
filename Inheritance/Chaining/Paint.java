class Paint {

    final String brand;
    final String color;
    final String type;
    final double price;
    final int quantity;

    Paint(String brand, String color, String type, double price, int quantity) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
}