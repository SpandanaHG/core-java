class Cup {

    String[] cupTypes = new String[5];
    int count = 0;

    void addCup(String type) 
	{

        System.out.println("Executing addCup method");

        if (type != null) 
		{

            if (this.count < this.cupTypes.length) 
			{

                this.cupTypes[this.count] = type;
                System.out.println("Added cup type: " + type + " at position " + this.count);
                this.count++;

            } 
			else 
			{
                System.out.println("Storage full, cannot add: " + type);
            }

        } 
		else 
		{
            System.out.println("Cup type is empty");
        }
    }

    void findCup(String type) 
	{

        System.out.println("Executing findCup method");

        if (type != null) 
		{

            boolean exists = false;

            for (String item : this.cupTypes) 
			{

                if (type == item) 
				{
                    System.out.println("Cup type " + type + " exists");
                    exists = true;
                    break;
                }
            }

            if (!exists) 
			{
                System.out.println("Cup type " + type + " not found");
            }

        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}