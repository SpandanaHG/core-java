class WindShield {

    String type;
    String material;
    double price;
    int size;
    boolean scratchResistant;

    WindShield() {
        System.out.println("Default constructor");
    }

    WindShield(String type) {
        this.type = type;
    }

    WindShield(String type, String material) {
        this.type = type;
        this.material = material;
    }

    WindShield(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    WindShield(String type, String material, double price, int size, boolean scratchResistant) {
        this.type = type;
        this.material = material;
        this.price = price;
        this.size = size;
        this.scratchResistant = scratchResistant;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("ScratchResistant: " + this.scratchResistant);
		System.out.println("----------------------");
      
    }
}