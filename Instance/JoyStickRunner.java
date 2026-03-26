class JoyStickRunner {
    public static void main(String[] values) {

        JoyStick brandObj = new JoyStick();
        JoyStick buttonsObj = new JoyStick();
        JoyStick priceObj = new JoyStick();
        JoyStick colorObj = new JoyStick();
        JoyStick connectivityObj = new JoyStick();
        System.out.println("Default value of brand is : " + brandObj.brand);
        System.out.println("Default value of buttons is : " + buttonsObj.buttons);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of connectivity is : " + connectivityObj.connectivity);

        brandObj.brand = "Sony";
        buttonsObj.buttons = 12;
        priceObj.price = 2500;
        colorObj.color = "Black";
        connectivityObj.connectivity = "Wireless";
        System.out.println("Updated value of brand is : " + brandObj.brand);
        System.out.println("Updated value of buttons is : " + buttonsObj.buttons);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of connectivity is : " + connectivityObj.connectivity);
    }
}