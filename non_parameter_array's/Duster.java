class Duster {
	
    String material;
    int size;
    DustType type;
    String color;
    boolean washable;

    Duster(String material, int size, DustType type) 
	{
        this.material = material;
        this.size = size;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in Duster");
        System.out.println("Material: " + this.material);
        System.out.println("Size: " + this.size);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Washable: " + this.washable);
    }
}