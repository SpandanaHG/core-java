class Glove {

    String brand;
    String type;
    String material;
    String size;
    String color;
    double price;
    String usage;
    String gender;
    String durability;
    String origin;

    Glove(String brand, String type, String material, String size,
          String color, double price, String usage,
          String gender, String durability, String origin) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.usage = usage;
        this.gender = gender;
        this.durability = durability;
        this.origin = origin;
    }

    void display() {
        System.out.println("Running display in Glove");
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Usage: " + this.usage);
        System.out.println("Gender: " + this.gender);
        System.out.println("Durability: " + this.durability);
        System.out.println("Origin: " + this.origin);
    }
}