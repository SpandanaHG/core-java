class Biometric {

    String[] userIds = new String[5];
    int count = 0;

    void addUser(String id) 
	{

        System.out.println("Inside addUser");

        if (id != null) 
		{

            if (this.count < this.userIds.length) 
			{

                this.userIds[this.count] = id;
                System.out.println("Added: " + id + " at index " + this.count);
                this.count++;

            } 
			else 
			{
                System.out.println("Storage full");
            }

        } 
		else 
		{
            System.out.println("User ID is null");
        }
    }

    void searchUser(String id) 
	{

        System.out.println("Inside searchUser");

        if (id != null) 
		{

            boolean found = false;

            for (int i = 0; i < this.userIds.length; i++) 
			{

                if (id == this.userIds[i]) 
				{
                    System.out.println("User " + id + " found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("User " + id + " not found");
            }

        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}