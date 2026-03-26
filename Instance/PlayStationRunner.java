class PlayStationRunner {
    public static void main(String[] values) {

        PlayStation modelObj = new PlayStation();
        PlayStation colorObj = new PlayStation();
        PlayStation priceObj = new PlayStation();
        PlayStation storageObj = new PlayStation();
        PlayStation controllerObj = new PlayStation();
        System.out.println("Default value of model is : " + modelObj.model);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of storage is : " + storageObj.storage);
        System.out.println("Default value of controllerType is : " + controllerObj.controllerType);

        modelObj.model = "PS5";
        colorObj.color = "White";
        priceObj.price = 50000;
        storageObj.storage = 825;
        controllerObj.controllerType = "Wireless";
        System.out.println("Updated value of model is : " + modelObj.model);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of storage is : " + storageObj.storage);
        System.out.println("Updated value of controllerType is : " + controllerObj.controllerType);
    }
}