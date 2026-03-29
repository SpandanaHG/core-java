class CapRunner {
    public static void main(String[] values)
	{
        Cap cap1 = new Cap();
        Cap cap2 = new Cap();
        Cap cap3 = new Cap();
        Cap cap4 = new Cap();
        Cap cap5 = new Cap();

        System.out.println("Default value of brand is : " + cap1.brand);
        System.out.println("Default value of color is : " + cap1.color);
        System.out.println("Default value of material is : " + cap1.material);
        System.out.println("Default value of price is : " + cap1.price);
        System.out.println("Default value of size is : " + cap1.size);
        cap1.brand = "Nike";
        cap1.color = "Blue";
        cap1.material = "Cotton";
        cap1.price = 699;
        cap1.size = 8.0;
        System.out.println("Updated value of brand is : " + cap1.brand);
        System.out.println("Updated value of color is : " + cap1.color);
        System.out.println("Updated value of material is : " + cap1.material);
        System.out.println("Updated value of price is : " + cap1.price);
        System.out.println("Updated value of size is : " + cap1.size);

        System.out.println("Default value of brand is : " + cap2.brand);
        System.out.println("Default value of color is : " + cap2.color);
        System.out.println("Default value of material is : " + cap2.material);
        System.out.println("Default value of price is : " + cap2.price);
        System.out.println("Default value of size is : " + cap2.size);
        cap2.brand = "Adidas";
        cap2.color = "Black";
        cap2.material = "Polyester";
        cap2.price = 799;
        cap2.size = 7.5;
        System.out.println("Updated value of brand is : " + cap2.brand);
        System.out.println("Updated value of color is : " + cap2.color);
        System.out.println("Updated value of material is : " + cap2.material);
        System.out.println("Updated value of price is : " + cap2.price);
        System.out.println("Updated value of size is : " + cap2.size);
		
		System.out.println("Default value of brand is : " + cap3.brand);
		System.out.println("Default value of color is : " + cap3.color);
		System.out.println("Default value of material is : " + cap3.material);
		System.out.println("Default value of price is : " + cap3.price);
		System.out.println("Default value of size is : " + cap3.size);
		cap3.brand = "Puma";
		cap3.color = "Red";
		cap3.material = "Wool";
		cap3.price = 599;
		cap3.size = 8.5;
		System.out.println("Updated value of brand is : " + cap3.brand);
		System.out.println("Updated value of color is : " + cap3.color);
		System.out.println("Updated value of material is : " + cap3.material);
		System.out.println("Updated value of price is : " + cap3.price);
		System.out.println("Updated value of size is : " + cap3.size);
		
		System.out.println("Default value of brand is : " + cap4.brand);
		System.out.println("Default value of color is : " + cap4.color);
		System.out.println("Default value of material is : " + cap4.material);
		System.out.println("Default value of price is : " + cap4.price);
		System.out.println("Default value of size is : " + cap4.size);
		cap4.brand = "Reebok";
		cap4.color = "White";
		cap4.material = "Denim";
		cap4.price = 650;
		cap4.size = 9.0;
		System.out.println("Updated value of brand is : " + cap4.brand);
		System.out.println("Updated value of color is : " + cap4.color);
		System.out.println("Updated value of material is : " + cap4.material);
		System.out.println("Updated value of price is : " + cap4.price);
		System.out.println("Updated value of size is : " + cap4.size);
		
		System.out.println("Default value of brand is : " + cap5.brand);
		System.out.println("Default value of color is : " + cap5.color);
		System.out.println("Default value of material is : " + cap5.material);
		System.out.println("Default value of price is : " + cap5.price);
		System.out.println("Default value of size is : " + cap5.size);
		cap5.brand = "Under Armour";
		cap5.color = "Green";
		cap5.material = "Leather";
		cap5.price = 899;
		cap5.size = 7.0;
		System.out.println("Updated value of brand is : " + cap5.brand);
		System.out.println("Updated value of color is : " + cap5.color);
		System.out.println("Updated value of material is : " + cap5.material);
		System.out.println("Updated value of price is : " + cap5.price);
		System.out.println("Updated value of size is : " + cap5.size);
    }
}