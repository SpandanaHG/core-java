class SolarSystem {

    String[] planetNames = new String[5];
    int index = 0;

    void savePlanet(String name) 
	{
        System.out.println("Running savePlanet in SolarSystem");

        if (name != null) 
		{
            if (this.index < this.planetNames.length) 
			{
                System.out.println("Saving planet: " + name);
                this.planetNames[this.index] = name;
                System.out.println("Saved " + name + " at index " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("Array is full, cannot save: " + name);
            }
        } 
		else 
		{
            System.out.println("Planet name is null");
        }
    }

    void searchPlanet(String name) 
	{
        System.out.println("Running searchPlanet in SolarSystem");

        if (name != null) 
		{
            System.out.println("Searching planet: " + name);
            boolean found = false;

            for (String temp : this.planetNames) 
			{
                if (name == temp)
				{
                    System.out.println("Planet " + name + " is found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("Planet " + name + " is not found");
            }
        } 
		else 
		{
            System.out.println("Name is null");
        }
    }
}