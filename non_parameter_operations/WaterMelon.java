class WaterMelon {

    String color;
    double weight;
    int sweetnessLevel;
    int seedsCount;
    String shape;
    String origin;
    double price;
    boolean hasSeeds;
    String variety;
    String size;

    WaterMelon(String color, double weight, int sweetnessLevel, int seedsCount,
               String shape, String origin, double price, boolean hasSeeds,
               String variety, String size) {

        this.color = color;
        this.weight = weight;
        this.sweetnessLevel = sweetnessLevel;
        this.seedsCount = seedsCount;
        this.shape = shape;
        this.origin = origin;
        this.price = price;
        this.hasSeeds = hasSeeds;
        this.variety = variety;
        this.size = size;
    }

    void display() {
        System.out.println("Running display in the WaterMelon");
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight);
        System.out.println("Sweetness Level: " + this.sweetnessLevel);
        System.out.println("Seeds Count: " + this.seedsCount);
        System.out.println("Shape: " + this.shape);
        System.out.println("Origin: " + this.origin);
        System.out.println("Price: " + this.price);
        System.out.println("Is Fresh: " + this.hasSeeds);
        System.out.println("Variety: " + this.variety);
        System.out.println("Size: " + this.size);
    }
}