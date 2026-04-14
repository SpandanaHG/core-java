class Alloy {

    String[] alloyNames = new String[5];
    int index = 0;

    void saveAlloy(String name) 
	{
        System.out.println("Running saveAlloy in Alloy");

        if (name != null) 
		{
            if (this.index < this.alloyNames.length) 
			{
                this.alloyNames[this.index] = name;
                System.out.println("Saved: " + name + " at index " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("Array full, cannot add ");
            }
        } 
		else 
		{
            System.out.println("Alloy name is null");
        }
    }

    void searchAlloy(String name) 
	{
        System.out.println("Running searchAlloy in Alloy");

        if (name != null) 
		{
            boolean found = false;

            for (int i = 0; i < this.alloyNames.length; i++) 
			{
                if (name == this.alloyNames[i]) 
				{
                    System.out.println("Alloy " + name + " found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("Alloy " + name + " not found");
            }
        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}