class IpadRunner {
    public static void main(String[] values) 
	{
        Ipad modl = new Ipad();
        Ipad colorObj = new Ipad();
        Ipad priceObj = new Ipad();
        Ipad screenObj = new Ipad();
        Ipad storageObj = new Ipad();
        System.out.println("Default value of model is : " + modl.model);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of screenSize is : " + screenObj.screenSize);
        System.out.println("Default value of storage is : " + storageObj.storage);

        modl.model = "iPad Air";
        colorObj.color = "Silver";
        priceObj.price = 60000;
        screenObj.screenSize = 10.9;
        storageObj.storage = "128GB";
        System.out.println("Updated value of model is : " + modl.model);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of screenSize is : " + screenObj.screenSize);
        System.out.println("Updated value of storage is : " + storageObj.storage);
    }
}