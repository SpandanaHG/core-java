class CapRunner {
    public static void main(String[] values)
	{
        Cap brandObj = new Cap();
        Cap colorObj = new Cap();
        Cap materialObj = new Cap();
        Cap priceObj = new Cap();
        Cap sizeObj = new Cap();
        System.out.println("Default value of brand is : " + brandObj.brand);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of material is : " + materialObj.material);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of size is : " + sizeObj.size);

        brandObj.brand = "Nike";
        colorObj.color = "Blue";
        materialObj.material = "Cotton";
        priceObj.price = 699;
        sizeObj.size = 8.0;
        System.out.println("Updated value of brand is : " + brandObj.brand);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of material is : " + materialObj.material);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of size is : " + sizeObj.size);
    }
}