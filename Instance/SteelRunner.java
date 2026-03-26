class SteelRunner {
    public static void main(String[] values) 
	{
        Steel name = new Steel();
        Steel sizeObj = new Steel();
        Steel material = new Steel();
        Steel priceObj = new Steel();
        Steel weightObj = new Steel();
        System.out.println("Default value of itemName is : " + name.itemName);
        System.out.println("Default value of size is : " + sizeObj.size);
        System.out.println("Default value of materialType is : " + material.materialType);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of weight is : " + weightObj.weight);

        name.itemName = "Steel Spoon";
        sizeObj.size = "Small";
        material.materialType = "Stainless";
        priceObj.price = 50;
        weightObj.weight = 5.5;
        System.out.println("Updated value of itemName is : " + name.itemName);
        System.out.println("Updated value of size is : " + sizeObj.size);
        System.out.println("Updated value of materialType is : " + material.materialType);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of weight is : " + weightObj.weight);
    }
}