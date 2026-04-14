class SparkPlug {

    String[] types = new String[5];
    int index = 0;

    void addPlug(String type) 
	{
        System.out.println("Inside addPlug");

        if (type != null) 
		{
            if (this.index < this.types.length) 
			{
                this.types[this.index] = type;
                System.out.println("Added: " + type + " at index " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("No space");
            }
        } 
		else 
		{
            System.out.println("Type is null");
        }
    }

    void searchPlug(String type) 
	{
        System.out.println("Inside searchPlug");

        if (type != null) 
		{
            boolean found = false;

            for (int i = 0; i < this.types.length; i++) 
			{
                if (type == this.types[i]) 
				{
                    System.out.println("SparkPlug " + type + " found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("SparkPlug " + type + " not found");
            }
        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}