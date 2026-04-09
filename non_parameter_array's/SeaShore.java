class SeaShore {
	
    String name;
    String countryName;
    LightHouse[] lights;
    String climate;
    boolean touristPlace;

    SeaShore(String name, String countryName, LightHouse[] lights)
	{
        this.name = name;
        this.countryName = countryName;
        this.lights = lights;
    }

    void display() 
	{
        System.out.println("Running display in SeaShore");
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.countryName);
        System.out.println("Climate: " + this.climate);
        System.out.println("Tourist Place: " + this.touristPlace);

        if (this.lights != null) 
		{
            for (LightHouse ref : lights) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("LightHouses are null");
        }
    }
}