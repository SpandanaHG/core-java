class CricketRunner {
	
    public static void main(String... args) 
	{

        Player player1 = new Player("Virat", 35, PlayerType.BATSMAN);
        player1.team = "India";
        player1.runs = 12000;

        Player player2 = new Player("Bumrah", 30, PlayerType.BOWLER);
        player2.team = "India";
        player2.runs = 500;

        Player player3 = new Player("Rohit", 37, PlayerType.BATSMAN);
        player3.team = "India";
        player3.runs = 11000;

        Player[] players = {player1, player2, player3};

        Cricket cricket = new Cricket("India vs Australia", "Mumbai", players);
        cricket.totalOvers = 50;
        cricket.dayMatch = true;

        cricket.display();
    }
}