class LaboratoryRunner{
	
	public static void main(String... values)
	{
		Laboratory lab = new Laboratory("City Lab" , "Bangalore" , 50);
		lab.display();
		
		Acid acid = lab.getAcid();
		acid.display();
	}
}