class Aeroplane {

    String[] names = new String[5];
    int index = 0;

    void addPlane(String name) 
	{
        System.out.println("Inside addPlane");

        if (name != null) 
		{
            if (this.index < this.names.length) 
			{
                this.names[this.index] = name;
                System.out.println("Added: " + name + " at index " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("No space available");
            }
        } 
		else 
		{
            System.out.println("Plane name is null");
        }
    }

    void searchPlane(String name) 
	{
        System.out.println("Inside searchPlane");

        if (name != null) 
		{
            boolean found = false;

            for (int i = 0; i < this.names.length; i++) 
			{
                if (name == this.names[i]) 
				{
                    System.out.println("Plane " + name + " found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("Plane " + name + " not found");
            }
        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}