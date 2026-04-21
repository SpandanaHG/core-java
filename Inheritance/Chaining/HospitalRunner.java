class HospitalRunner {
	
	public static void main(String... values)
	{
		Hospital hospital1 = new MultiSpecialityHospital("Apollo","Bangalore");
		System.out.println("Name : "+hospital1.name);
		System.out.println("Location : "+hospital1.location);
		System.out.println("Category : "+hospital1.category);
		System.out.println("Number of Beds : "+hospital1.noOfBeds);
		System.out.println("Consultation Fee : "+hospital1.consultationFee);
		
		Hospital hospital2 = new MultiSpecialityHospital("Fortis","Delhi","Private");
		System.out.println("Name : "+hospital2.name);
		System.out.println("Location : "+hospital2.location);
		System.out.println("Category : "+hospital2.category);
		System.out.println("Number of Beds : "+hospital2.noOfBeds);
		System.out.println("Consultation Fee : "+hospital2.consultationFee);
		
		Hospital hospital3 = new MultiSpecialityHospital("Manipal","Mysore","MultiSpeciality",400,750.0);
		System.out.println("Name : "+hospital3.name);
		System.out.println("Location : "+hospital3.location);
		System.out.println("Category : "+hospital3.category);
		System.out.println("Number of Beds : "+hospital3.noOfBeds);
		System.out.println("Consultation Fee : "+hospital3.consultationFee);
	}
}