class Laser {

    String type;
    String color;
    double power;
    double wavelength;
    String usage;
    String material;
    double price;
    String brand;
    String origin;
    String mode;

    Laser(String type, String color, double power, double wavelength,
          String usage, String material, double price,
          String brand, String origin, String mode) {

        this.type = type;
        this.color = color;
        this.power = power;
        this.wavelength = wavelength;
        this.usage = usage;
        this.material = material;
        this.price = price;
        this.brand = brand;
        this.origin = origin;
        this.mode = mode;
    }

    void display() {
        System.out.println("Running display in Laser");
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Power: " + this.power);
        System.out.println("Wavelength: " + this.wavelength);
        System.out.println("Usage: " + this.usage);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("Brand: " + this.brand);
        System.out.println("Origin: " + this.origin);
        System.out.println("Mode: " + this.mode);
    }
}