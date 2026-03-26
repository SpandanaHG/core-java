class FlagRunner{
	public static void main(String[] values)
	{
		Flag name = new Flag();
		Flag number = new Flag();
		Flag symbol = new Flag();
		Flag higt = new Flag();
		Flag lngth = new Flag();
		System.out.println("Default value of countryName is : "+name.countryName);
		System.out.println("Default value of noOfColors is : "+number.noOfColors);
		System.out.println("Default value of hasSymbol is : "+symbol.hasSymbol);
		System.out.println("Default value of height is : "+higt.height);
		System.out.println("Default value of length is : "+lngth.length);
		
		name.countryName = "India";
		number.noOfColors = 3;
		symbol.hasSymbol = true;
		higt.height = 5;
		lngth.length = 7.5;
		System.out.println("Updated value of countryName is : "+name.countryName);
		System.out.println("Updated value of noOfColors is : "+number.noOfColors);
		System.out.println("Updated value of hasSymbol is : "+symbol.hasSymbol);
		System.out.println("Updated value of height is : "+higt.height);
		System.out.println("Updated value of length is : "+lngth.length);
	}
}