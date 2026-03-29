class CupRunner {
    public static void main(String[] values) {

        Cup cup1 = new Cup();
        Cup cup2 = new Cup();
        Cup cup3 = new Cup();
        Cup cup4 = new Cup();
        Cup cup5 = new Cup();
		
        System.out.println("Default value of material is : " + cup1.material);
        System.out.println("Default value of color is : " + cup1.color);
        System.out.println("Default value of price is : " + cup1.price);
        System.out.println("Default value of capacity is : " + cup1.capacity);
        System.out.println("Default value of brand is : " +cup1.brand);
        cup1.material = "Ceramic";
        cup1.color = "White";
        cup1.price = 150;
        cup1.capacity = 250;
        cup1.brand = "Milton";
        System.out.println("Updated value of material is : " + cup1.material);
        System.out.println("Updated value of color is : " + cup1.color);
        System.out.println("Updated value of price is : " + cup1.price);
        System.out.println("Updated value of capacity is : " + cup1.capacity);
        System.out.println("Updated value of brand is : " + cup1.brand);
		
		System.out.println("Default value of material is : " + cup2.material);
		System.out.println("Default value of color is : " + cup2.color);
		System.out.println("Default value of price is : " + cup2.price);
		System.out.println("Default value of capacity is : " + cup2.capacity);
		System.out.println("Default value of brand is : " + cup2.brand);
		cup2.material = "Steel";
		cup2.color = "Silver";
		cup2.price = 200;
		cup2.capacity = 300;
		cup2.brand = "Prestige";
		System.out.println("Updated value of material is : " + cup2.material);
		System.out.println("Updated value of color is : " + cup2.color);
		System.out.println("Updated value of price is : " + cup2.price);
		System.out.println("Updated value of capacity is : " + cup2.capacity);
		System.out.println("Updated value of brand is : " + cup2.brand);
		
		System.out.println("Default value of material is : " + cup3.material);
		System.out.println("Default value of color is : " + cup3.color);
		System.out.println("Default value of price is : " + cup3.price);
		System.out.println("Default value of capacity is : " + cup3.capacity);
		System.out.println("Default value of brand is : " + cup3.brand);
		cup3.material = "Glass";
		cup3.color = "Transparent";
		cup3.price = 120;
		cup3.capacity = 200;
		cup3.brand = "Borosil";
		System.out.println("Updated value of material is : " + cup3.material);
		System.out.println("Updated value of color is : " + cup3.color);
		System.out.println("Updated value of price is : " + cup3.price);
		System.out.println("Updated value of capacity is : " + cup3.capacity);
		System.out.println("Updated value of brand is : " + cup3.brand);
		
		System.out.println("Default value of material is : " + cup4.material);
		System.out.println("Default value of color is : " + cup4.color);
		System.out.println("Default value of price is : " + cup4.price);
		System.out.println("Default value of capacity is : " + cup4.capacity);
		System.out.println("Default value of brand is : " + cup4.brand);
		cup4.material = "Plastic";
		cup4.color = "Blue";
		cup4.price = 80;
		cup4.capacity = 350;
		cup4.brand = "Cello";
		System.out.println("Updated value of material is : " + cup4.material);
		System.out.println("Updated value of color is : " + cup4.color);
		System.out.println("Updated value of price is : " + cup4.price);
		System.out.println("Updated value of capacity is : " + cup4.capacity);
		System.out.println("Updated value of brand is : " + cup4.brand);
		
		System.out.println("Default value of material is : " + cup5.material);
		System.out.println("Default value of color is : " + cup5.color);
		System.out.println("Default value of price is : " + cup5.price);
		System.out.println("Default value of capacity is : " + cup5.capacity);
		System.out.println("Default value of brand is : " + cup5.brand);
		cup5.material = "Copper";
		cup5.color = "Brown";
		cup5.price = 250;
		cup5.capacity = 400;
		cup5.brand = "Signoraware";
		System.out.println("Updated value of material is : " + cup5.material);
		System.out.println("Updated value of color is : " + cup5.color);
		System.out.println("Updated value of price is : " + cup5.price);
		System.out.println("Updated value of capacity is : " + cup5.capacity);
		System.out.println("Updated value of brand is : " + cup5.brand);
    }
}