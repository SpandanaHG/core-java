class TempleRunner {
	
	public static void main(String... values)
	{
		Temple temple1 = new KrishnaTemple("ISKCON Temple","Bangalore","Hindu");
		System.out.println("Name : "+temple1.name);
		System.out.println("Location : "+temple1.location);
		System.out.println("Type : "+temple1.type);
		System.out.println("Established Year : "+temple1.establishedYear);
		System.out.println("Entry Fee : "+temple1.entryFee);
		
		Temple temple2 = new KrishnaTemple("Udupi Krishna Temple","Udupi","Hindu",1200,30.0);
		System.out.println("Name : "+temple2.name);
		System.out.println("Location : "+temple2.location);
		System.out.println("Type : "+temple2.type);
		System.out.println("Established Year : "+temple2.establishedYear);
		System.out.println("Entry Fee : "+temple2.entryFee);
	}
}