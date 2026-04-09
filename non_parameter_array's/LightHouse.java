class LightHouse {
	
    String name;
    int height;
    LightType type;
    String location;
    boolean active;

    LightHouse(String name, int height, LightType type) 
	{
        this.name = name;
        this.height = height;
        this.type = type;
    }

    void info() {
        System.out.println("Running info in LightHouse");
        System.out.println("Name: " + this.name);
        System.out.println("Height: " + this.height);
        System.out.println("Type: " + this.type);
        System.out.println("Location: " + this.location);
        System.out.println("Active: " + this.active);
    }
}