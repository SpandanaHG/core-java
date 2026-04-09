class Player {
	
    String name;
    int age;
    PlayerType type;
    String team;
    int runs;

    Player(String name, int age, PlayerType type) 
	{
        this.name = name;
        this.age = age;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in Player");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Type: " + this.type);
        System.out.println("Team: " + this.team);
        System.out.println("Runs: " + this.runs);
    }
}