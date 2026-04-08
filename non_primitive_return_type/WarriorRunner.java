class WarriorRunner{
	
	public static void main(String... values)
	{
		Warrior warrior = new Warrior("Arjun" , 30 , "Mahabharata");
		warrior.display();
		
		Sword sword = warrior.getSword();
		sword.display();
	}
}