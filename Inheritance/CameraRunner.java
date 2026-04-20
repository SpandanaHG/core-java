class CameraRunner {
	
	public static void main(String... values)
	{
		Camera camera1 = new DSLR(24 , "Canon");
		System.out.println("Pixel : "+camera1.pixel);
		System.out.println("Brand : "+camera1.brand);

		Camera camera2 = new DSLR(20 , "Nikon");
		System.out.println("Pixel : "+camera2.pixel);
		System.out.println("Brand : "+camera2.brand);		
	}
}