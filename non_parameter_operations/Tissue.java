class Tissue {

    String brand;
    String type;
    int layers;
    String color;
    String fragrance;
    int packSize;
    double price;
    String material;
    String usage;
    String origin;

    Tissue(String brand, String type, int layers, String color,
           String fragrance, int packSize, double price,
           String material, String usage, String origin) {

        this.brand = brand;
        this.type = type;
        this.layers = layers;
        this.color = color;
        this.fragrance = fragrance;
        this.packSize = packSize;
        this.price = price;
        this.material = material;
        this.usage = usage;
        this.origin = origin;
    }

    void display() {
        System.out.println("Running display in Tissue");
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Layers: " + this.layers);
        System.out.println("Color: " + this.color);
        System.out.println("Fragrance: " + this.fragrance);
        System.out.println("Pack Size: " + this.packSize);
        System.out.println("Price: " + this.price);
        System.out.println("Material: " + this.material);
        System.out.println("Usage: " + this.usage);
        System.out.println("Origin: " + this.origin);
    }
}