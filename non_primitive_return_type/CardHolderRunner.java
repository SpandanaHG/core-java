class CardHolderRunner{
	
	public static void main(String... values)
	{
		CardHolder cardHolder = new CardHolder("Ram" , 34 , "bangalore");
		cardHolder.display();
		Card card = cardHolder.info();
		card.display();
	}
}