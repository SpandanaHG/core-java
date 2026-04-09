class Avengers {
	
    String teamName;
    String baseLocation;
    IronMan[] suits;
    int members;
    boolean active;

    Avengers(String teamName, String baseLocation, IronMan[] suits) 
	{
        this.teamName = teamName;
        this.baseLocation = baseLocation;
        this.suits = suits;
    }

    void display() 
	{
        System.out.println("Running display in Avengers");
        System.out.println("Team Name: " + this.teamName);
        System.out.println("Base: " + this.baseLocation);
        System.out.println("Members: " + this.members);
        System.out.println("Active: " + this.active);

        if (this.suits != null) 
		{
            for (IronMan ref : suits) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Suits are null");
        }
    }
}