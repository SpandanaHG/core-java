class Boat {
	
    String name;
    int capacity;
    BoatType type;
    String color;
    boolean engine;

    Boat(String name, int capacity, BoatType type) 
	{
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in Boat");
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Engine: " + this.engine);
    }
}