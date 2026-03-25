class PersonDetails{
	static void getDetails(String name,String[] emails,long[]phoneNumber,String[] addresses)
	{
		System.out.println("Executing the person details");
		
		if(name != null)
		{
			System.out.println("The name is:"+name);	
		}
		if(emails != null)
		{
			for(int mail = 0 ; mail<emails.length ; mail++)
			{
				System.out.println("the email is:"+emails[mail]);
			}		
		}
		if(phoneNumber != null)
		{
			for(int number = 0 ; number<phoneNumber.length ; number++)
			{
				System.out.println("the phone number is:"+phoneNumber[number]);
			}
		}
		if(addresses != null)
		{
			for(int address = 0 ; address<addresses.length ; address++)
			{
				System.out.println("the addres is:"+addresses[address]);
			}
		}	
		else
		{
			System.out.println("The detail is not found");
		}	
	}
}
