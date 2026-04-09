class Starter {
	
    String brand;
    int power;
    StarterType type;
    String color;
    boolean working;

    Starter(String brand, int power, StarterType type) 
	{
        this.brand = brand;
        this.power = power;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in Starter");
        System.out.println("Brand: " + this.brand);
        System.out.println("Power: " + this.power);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Working: " + this.working);
    }
}