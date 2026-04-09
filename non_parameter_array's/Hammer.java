class Hammer {
	
    String brand;
    int weight;
    HammerType type;
    String handleMaterial;
    boolean strong;

    Hammer(String brand, int weight, HammerType type) 
	{
        this.brand = brand;
        this.weight = weight;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in Hammer");
        System.out.println("Brand: " + this.brand);
        System.out.println("Weight: " + this.weight);
        System.out.println("Type: " + this.type);
        System.out.println("Handle Material: " + this.handleMaterial);
        System.out.println("Strong: " + this.strong);
    }
}