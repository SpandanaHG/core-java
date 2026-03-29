class FlagRunner{
	public static void main(String[] values)
	{
		Flag flag1 = new Flag();
		Flag flag2 = new Flag();
		Flag flag3 = new Flag();
		Flag flag4 = new Flag();
		Flag flag5 = new Flag();
		
		System.out.println("Default value of countryName is : "+flag1.countryName);
		System.out.println("Default value of noOfColors is : "+flag1.noOfColors);
		System.out.println("Default value of hasSymbol is : "+flag1.hasSymbol);
		System.out.println("Default value of height is : "+flag1.height);
		System.out.println("Default value of length is : "+flag1.length);
		flag1.countryName = "India";
		flag1.noOfColors = 3;
		flag1.hasSymbol = true;
		flag1.height = 5;
		flag1.length = 7.5;
		System.out.println("Updated value of countryName is : "+flag1.countryName);
		System.out.println("Updated value of noOfColors is : "+flag1.noOfColors);
		System.out.println("Updated value of hasSymbol is : "+flag1.hasSymbol);
		System.out.println("Updated value of height is : "+flag1.height);
		System.out.println("Updated value of length is : "+flag1.length);
		
		System.out.println("Default value of countryName is : " + flag2.countryName);
		System.out.println("Default value of noOfColors is : " + flag2.noOfColors);
		System.out.println("Default value of hasSymbol is : " + flag2.hasSymbol);
		System.out.println("Default value of height is : " + flag2.height);
		System.out.println("Default value of length is : " + flag2.length);
		flag2.countryName = "USA";
		flag2.noOfColors = 3;
		flag2.hasSymbol = true;
		flag2.height = 6;
		flag2.length = 10.0;
		System.out.println("Updated value of countryName is : " + flag2.countryName);
		System.out.println("Updated value of noOfColors is : " + flag2.noOfColors);
		System.out.println("Updated value of hasSymbol is : " + flag2.hasSymbol);
		System.out.println("Updated value of height is : " + flag2.height);
		System.out.println("Updated value of length is : " + flag2.length);
		
		System.out.println("Default value of countryName is : " + flag3.countryName);
		System.out.println("Default value of noOfColors is : " + flag3.noOfColors);
		System.out.println("Default value of hasSymbol is : " + flag3.hasSymbol);
		System.out.println("Default value of height is : " + flag3.height);
		System.out.println("Default value of length is : " + flag3.length);
		flag3.countryName = "Japan";
		flag3.noOfColors = 2;
		flag3.hasSymbol = true;
		flag3.height = 4;
		flag3.length = 6.0;
		System.out.println("Updated value of countryName is : " + flag3.countryName);
		System.out.println("Updated value of noOfColors is : " + flag3.noOfColors);
		System.out.println("Updated value of hasSymbol is : " + flag3.hasSymbol);
		System.out.println("Updated value of height is : " + flag3.height);
		System.out.println("Updated value of length is : " + flag3.length);
		
		System.out.println("Default value of countryName is : " + flag4.countryName);
		System.out.println("Default value of noOfColors is : " + flag4.noOfColors);
		System.out.println("Default value of hasSymbol is : " + flag4.hasSymbol);
		System.out.println("Default value of height is : " + flag4.height);
		System.out.println("Default value of length is : " + flag4.length);
		flag4.countryName = "Germany";
		flag4.noOfColors = 3;
		flag4.hasSymbol = false;
		flag4.height = 5;
		flag4.length = 8.0;
		System.out.println("Updated value of countryName is : " + flag4.countryName);
		System.out.println("Updated value of noOfColors is : " + flag4.noOfColors);
		System.out.println("Updated value of hasSymbol is : " + flag4.hasSymbol);
		System.out.println("Updated value of height is : " + flag4.height);
		System.out.println("Updated value of length is : " + flag4.length);

		System.out.println("Default value of countryName is : " + flag5.countryName);
		System.out.println("Default value of noOfColors is : " + flag5.noOfColors);
		System.out.println("Default value of hasSymbol is : " + flag5.hasSymbol);
		System.out.println("Default value of height is : " + flag5.height);
		System.out.println("Default value of length is : " + flag5.length);
		flag5.countryName = "Brazil";
		flag5.noOfColors = 4;
		flag5.hasSymbol = true;
		flag5.height = 6;
		flag5.length = 9.0;
		System.out.println("Updated value of countryName is : " + flag5.countryName);
		System.out.println("Updated value of noOfColors is : " + flag5.noOfColors);
		System.out.println("Updated value of hasSymbol is : " + flag5.hasSymbol);
		System.out.println("Updated value of height is : " + flag5.height);
		System.out.println("Updated value of length is : " + flag5.length);
	}
}