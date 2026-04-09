class IronMan {
	
    String owner;
    int powerLevel;
    IronManType type;
    String color;
    boolean canFly;

    IronMan(String owner, int powerLevel, IronManType type) 
	{
        this.owner = owner;
        this.powerLevel = powerLevel;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in IronMan");
        System.out.println("Owner: " + this.owner);
        System.out.println("Power Level: " + this.powerLevel);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Can Fly: " + this.canFly);
    }
}