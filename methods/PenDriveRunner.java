class PenDriveRunner
{
	public static void main(String[] args)
	{
		double price = PenDrive.getSizeByBrand("SanDisk");
		System.out.println("Price : "+price);
		
		double price2 = PenDrive.getSizeByBrand("HP");
		System.out.println("Price : "+price2);
		
		double price3 = PenDrive.getSizeByBrand("Sony");
		System.out.println("Price : "+price3);
		
		double price4 = PenDrive.getSizeByBrand("Kingston");
		System.out.println("Price : "+price4);
		
		double price5 = PenDrive.getSizeByBrand("Transcend");
		System.out.println("Price : "+price5);
		
		double price6 = PenDrive.getSizeByBrand("hp");
		System.out.println("Price : "+price6);
	}
}