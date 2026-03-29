class PlayStationRunner {
    public static void main(String[] values) {

        PlayStation ps1 = new PlayStation();
        PlayStation ps2 = new PlayStation();
        PlayStation ps3 = new PlayStation();
        PlayStation ps4 = new PlayStation();
        PlayStation ps5 = new PlayStation();

        System.out.println("Default value of model is : " + ps1.model);
        System.out.println("Default value of color is : " + ps1.color);
        System.out.println("Default value of price is : " + ps1.price);
        System.out.println("Default value of storage is : " + ps1.storage);
        System.out.println("Default value of controllerType is : " + ps1.controllerType);
        ps1.model = "PS5";
        ps1.color = "White";
        ps1.price = 50000;
        ps1.storage = 825;
        ps1.controllerType = "Wireless";
        System.out.println("Updated value of model is : " + ps1.model);
        System.out.println("Updated value of color is : " + ps1.color);
        System.out.println("Updated value of price is : " + ps1.price);
        System.out.println("Updated value of storage is : " + ps1.storage);
        System.out.println("Updated value of controllerType is : " + ps1.controllerType);

        System.out.println("Default value of model is : " + ps2.model);
        System.out.println("Default value of color is : " + ps2.color);
        System.out.println("Default value of price is : " + ps2.price);
        System.out.println("Default value of storage is : " + ps2.storage);
        System.out.println("Default value of controllerType is : " + ps2.controllerType);
        ps2.model = "PS4";
        ps2.color = "Black";
        ps2.price = 30000;
        ps2.storage = 500;
        ps2.controllerType = "Wireless";
        System.out.println("Updated value of model is : " + ps2.model);
        System.out.println("Updated value of color is : " + ps2.color);
        System.out.println("Updated value of price is : " + ps2.price);
        System.out.println("Updated value of storage is : " + ps2.storage);
        System.out.println("Updated value of controllerType is : " + ps2.controllerType);

        System.out.println("Default value of model is : " + ps3.model);
        System.out.println("Default value of color is : " + ps3.color);
        System.out.println("Default value of price is : " + ps3.price);
        System.out.println("Default value of storage is : " + ps3.storage);
        System.out.println("Default value of controllerType is : " + ps3.controllerType);
        ps3.model = "PS4 Slim";
        ps3.color = "White";
        ps3.price = 28000;
        ps3.storage = 1000;
        ps3.controllerType = "Wireless";
        System.out.println("Updated value of model is : " + ps3.model);
        System.out.println("Updated value of color is : " + ps3.color);
        System.out.println("Updated value of price is : " + ps3.price);
        System.out.println("Updated value of storage is : " + ps3.storage);
        System.out.println("Updated value of controllerType is : " + ps3.controllerType);

        System.out.println("Default value of model is : " + ps4.model);
        System.out.println("Default value of color is : " + ps4.color);
        System.out.println("Default value of price is : " + ps4.price);
        System.out.println("Default value of storage is : " + ps4.storage);
        System.out.println("Default value of controllerType is : " + ps4.controllerType);
        ps4.model = "PS3";
        ps4.color = "Black";
        ps4.price = 20000;
        ps4.storage = 320;
        ps4.controllerType = "Wired";
        System.out.println("Updated value of model is : " + ps4.model);
        System.out.println("Updated value of color is : " + ps4.color);
        System.out.println("Updated value of price is : " + ps4.price);
        System.out.println("Updated value of storage is : " + ps4.storage);
        System.out.println("Updated value of controllerType is : " + ps4.controllerType);

        System.out.println("Default value of model is : " + ps5.model);
        System.out.println("Default value of color is : " + ps5.color);
        System.out.println("Default value of price is : " + ps5.price);
        System.out.println("Default value of storage is : " + ps5.storage);
        System.out.println("Default value of controllerType is : " + ps5.controllerType);
        ps5.model = "PS5 Digital";
        ps5.color = "Black";
        ps5.price = 45000;
        ps5.storage = 825;
        ps5.controllerType = "Wireless";
        System.out.println("Updated value of model is : " + ps5.model);
        System.out.println("Updated value of color is : " + ps5.color);
        System.out.println("Updated value of price is : " + ps5.price);
        System.out.println("Updated value of storage is : " + ps5.storage);
        System.out.println("Updated value of controllerType is : " + ps5.controllerType);
    }
}