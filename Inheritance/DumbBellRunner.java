class DumbBellRunner {
	
	public static void main(String... values)
	{
		DumbBell dumbBell1 = new AdjustableDumbBell(10, "Iron");
		System.out.println("Weight : "+dumbBell1.weight);
		System.out.println("Material : "+dumbBell1.material);
		
		DumbBell dumbBell2 = new AdjustableDumbBell(15, "Steel");
		System.out.println("Weight : "+dumbBell2.weight);
		System.out.println("Material : "+dumbBell2.material);
	}
}