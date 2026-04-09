class Pearl {
	
    String color;
    int weight;
    PearlType type;
    String origin;
    boolean shiny;

    Pearl(String color, int weight, PearlType type) 
	{
        this.color = color;
        this.weight = weight;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in Pearl");
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight);
        System.out.println("Type: " + this.type);
        System.out.println("Origin: " + this.origin);
        System.out.println("Shiny: " + this.shiny);
    }
}