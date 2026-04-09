class Cricket {
	
    String matchName;
    String location;
    Player[] players;
    int totalOvers;
    boolean dayMatch;

    Cricket(String matchName, String location, Player[] players) 
	{
        this.matchName = matchName;
        this.location = location;
        this.players = players;
    }

    void display() 
	{
        System.out.println("Running display in Cricket");
        System.out.println("Match Name: " + this.matchName);
        System.out.println("Location: " + this.location);
        System.out.println("Overs: " + this.totalOvers);
        System.out.println("Day Match: " + this.dayMatch);

        if (this.players != null) 
		{
            for (Player ref : players) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Players are null");
        }
    }
}