class PowerBankRunner {
    public static void main(String[] values) 
	{
        PowerBank brandObj = new PowerBank();
        PowerBank capacityObj = new PowerBank();
        PowerBank priceObj = new PowerBank();
        PowerBank colorObj = new PowerBank();
        PowerBank weightObj = new PowerBank();
        System.out.println("Default value of brand is : " + brandObj.brand);
        System.out.println("Default value of capacity is : " + capacityObj.capacity);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of weight is : " + weightObj.weight);
		
        brandObj.brand = "MI";
        capacityObj.capacity = 20000;
        priceObj.price = 1499;
        colorObj.color = "Black";
        weightObj.weight = 450;
        System.out.println("Updated value of brand is : " + brandObj.brand);
        System.out.println("Updated value of capacity is : " + capacityObj.capacity);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of weight is : " + weightObj.weight);
    }
}