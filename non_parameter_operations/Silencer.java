class Silencer {

    String brand;
    String material;
    double weight;
    double length;
    String shape;
    String vehicleType;
    double price;
    String color;
    String noiseLevel;
    String origin;

    Silencer(String brand, String material, double weight, double length,
             String shape, String vehicleType, double price,
             String color, String noiseLevel, String origin) {

        this.brand = brand;
        this.material = material;
        this.weight = weight;
        this.length = length;
        this.shape = shape;
        this.vehicleType = vehicleType;
        this.price = price;
        this.color = color;
        this.noiseLevel = noiseLevel;
        this.origin = origin;
    }

    void display() {
        System.out.println("Running display in the Silencer");
        System.out.println("Brand: " + this.brand);
        System.out.println("Material: " + this.material);
        System.out.println("Weight: " + this.weight);
        System.out.println("Length: " + this.length);
        System.out.println("Shape: " + this.shape);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Noise Level: " + this.noiseLevel);
        System.out.println("Origin: " + this.origin);
    }
}