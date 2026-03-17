class PenDrive
{
	static int getSizeByBrand(String brand)
	{
		System.out.println("Executing getSizeByBrand in PenDrive with args : "+brand);
		if("SanDisk"==brand)
		{
			System.out.println("Size 16GB ");
			return 16;
		}
		if("HP"==brand)
		{
			System.out.println("Size 32GB"); 
			return 32;
		}
		if("Sony"==brand)
		{
			System.out.println("Size 64GB"); 
			return 64;
		}
		if("Kingston"==brand)
		{
			System.out.println("Size 128GB");
			return 128;
		}
		if("Transcend"==brand)
		{
			System.out.println("Size 256GB"); 
			return 256;
		}
		else
		{
		System.out.println("Brand not found");
		}
		return -1;
	}
}