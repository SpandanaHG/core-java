class AvengersRunner {
	
    public static void main(String... args) 
	{

        IronMan ironMan1 = new IronMan("Tony Stark", 100, IronManType.MARK1);
        ironMan1.color = "Red";
        ironMan1.canFly = true;

        IronMan ironMan2 = new IronMan("Tony Stark", 200, IronManType.MARK2);
        ironMan2.color = "Gold";
        ironMan2.canFly = true;

        IronMan ironMan3 = new IronMan("Tony Stark", 500, IronManType.MARK50);
        ironMan3.color = "Nano";
        ironMan3.canFly = true;

        IronMan[] suits = {ironMan1, ironMan2, ironMan3};

        Avengers team = new Avengers("Avengers", "New York", suits);
        team.members = 6;
        team.active = true;

        team.display();
    }
}