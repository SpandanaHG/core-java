class PuzzleRunner {
	
	public static void main(String... values)
	{
		Puzzle puzzle1 = new Jigsaw(100 , "Hard");
		System.out.println("Pieces : "+puzzle1.pieces);
		System.out.println("Difficulty : "+puzzle1.difficulty);
		
		Puzzle puzzle2 = new Jigsaw(50 , "Moderate");
		System.out.println("Pieces : "+puzzle2.pieces);
		System.out.println("Difficulty : "+puzzle2.difficulty);
	}
}