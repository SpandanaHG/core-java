class PhoneNumber
{
	static long getMobileByName(String name)
	{
		System.out.println("Executing getMobileByName with args : "+name);

		if("Virat"==name)
		{
			System.out.println("Number of Virat is 9876543210");
			return 9876543210L;
		}
		if("Rohit"==name)
		{
			System.out.println("Number of Rohit is 6985523245");
			return 6985523245L;
		}
		if("Shubman Gill"==name)
		{
			System.out.println("Number of Shubman Gill is 5648793215");
			return 5648793215L;
		}
		if("Abhishek Sharma"==name)
		{
			System.out.println("Number of Abhishek Sharma is 8624593173");
			return 8624593173L;
		}
		if("Rahul"==name)
		{
			System.out.println("Number of Rahul is 7654832190");
			return 7654832190L;
		}
		if("Hardik"==name)
		{
			System.out.println("Number of Hardik is 9645821376");
			return 9645821376L;
		}
		if("Bumrah"==name)
		{
			System.out.println("Number of Bumrah is 8864597235");
			return 8864597235L;
		}
		if("Mithali"==name)
		{
			System.out.println("Number of Mithali is 9977586642");
			return 9977586642L;
		}
		if("Harmanpreet"==name)
		{
			System.out.println("Number of Harmanpreet is 7865299589");
			return 7865299589L;
		}
		if("Smriti"==name)
		{
			System.out.println("Number of Smriti is 9865839925");
			return 9865839925L;
		}
		if("Jemimah Rodrigues"==name)
		{
			System.out.println("Number of Jemimah Rodrigues is 9854236725");
			return 9854236725L;
		}
		if("Shafali"==name)
		{
			System.out.println("Number of Shafali is 9964852238");
			return 9964852238L;
		}
		if("Deepti"==name)
		{
			System.out.println("Number of Deepti is 8645922534");
			return 8645922534L;
		}
		if("Shreyanka Patil"==name)
		{
			System.out.println("Number of Shreyanka Patil is 9458625583");
			return 9458625583L;
		}
		if("Richa"==name)
		{
			System.out.println("Number of Richa is 9547862835");
			return 9547862835L;
		}

		else
		{
			System.out.println("Mobile not found");
		}
		return -1;
	}
}