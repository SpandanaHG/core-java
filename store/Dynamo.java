class Dynamo {

    String[] types = new String[5];
    int count = 0;

    void saveDynamo(String type) 
	{
        System.out.println("Inside saveDynamo");

        if (type != null) 
		{
            if (this.count < this.types.length) 
			{
                this.types[this.count] = type;
                System.out.println("Saved: " + type + " at index " + this.count);
                this.count++;
            } 
			else 
			{
                System.out.println("Array full");
            }
        } 
		else 
		{
            System.out.println("Type is null");
        }
    }

    void searchDynamo(String type) 
	{
        System.out.println("Inside searchDynamo");

        if (type != null) 
		{
            boolean found = false;

            for (int i = 0; i < this.types.length; i++) 
			{
                if (type == this.types[i]) 
				{
                    System.out.println("Dynamo " + type + " found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("Dynamo " + type + " not found");
            }
        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}