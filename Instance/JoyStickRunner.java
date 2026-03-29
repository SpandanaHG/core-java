class JoyStickRunner {
    public static void main(String[] values) {

        JoyStick joyStick1 = new JoyStick();
        JoyStick joyStick2 = new JoyStick();
        JoyStick joyStick3 = new JoyStick();
        JoyStick joyStick4 = new JoyStick();
        JoyStick joyStick5 = new JoyStick();
		
        System.out.println("Default value of brand is : " + joyStick1.brand);
        System.out.println("Default value of buttons is : " + joyStick1.buttons);
        System.out.println("Default value of price is : " + joyStick1.price);
        System.out.println("Default value of color is : " + joyStick1.color);
        System.out.println("Default value of connectivity is : " + joyStick1.connectivity);
        joyStick1.brand = "Sony";
        joyStick1.buttons = 12;
        joyStick1.price = 2500;
        joyStick1.color = "Black";
        joyStick1.connectivity = "Wireless";
        System.out.println("Updated value of brand is : " + joyStick1.brand);
        System.out.println("Updated value of buttons is : " + joyStick1.buttons);
        System.out.println("Updated value of price is : " + joyStick1.price);
        System.out.println("Updated value of color is : " + joyStick1.color);
        System.out.println("Updated value of connectivity is : " + joyStick1.connectivity);
		
		System.out.println("Default value of brand is : " + joyStick2.brand);
		System.out.println("Default value of buttons is : " + joyStick2.buttons);
		System.out.println("Default value of price is : " + joyStick2.price);
		System.out.println("Default value of color is : " + joyStick2.color);
		System.out.println("Default value of connectivity is : " + joyStick2.connectivity);
		joyStick2.brand = "Microsoft";
		joyStick2.buttons = 10;
		joyStick2.price = 3000;
		joyStick2.color = "White";
		joyStick2.connectivity = "Wireless";
		System.out.println("Updated value of brand is : " + joyStick2.brand);
		System.out.println("Updated value of buttons is : " + joyStick2.buttons);
		System.out.println("Updated value of price is : " + joyStick2.price);
		System.out.println("Updated value of color is : " + joyStick2.color);
		System.out.println("Updated value of connectivity is : " + joyStick2.connectivity);

		System.out.println("Default value of brand is : " + joyStick3.brand);
		System.out.println("Default value of buttons is : " + joyStick3.buttons);
		System.out.println("Default value of price is : " + joyStick3.price);
		System.out.println("Default value of color is : " + joyStick3.color);
		System.out.println("Default value of connectivity is : " + joyStick3.connectivity);
		joyStick3.brand = "Logitech";
		joyStick3.buttons = 8;
		joyStick3.price = 1500;
		joyStick3.color = "Blue";
		joyStick3.connectivity = "Wired";
		System.out.println("Updated value of brand is : " + joyStick3.brand);
		System.out.println("Updated value of buttons is : " + joyStick3.buttons);
		System.out.println("Updated value of price is : " + joyStick3.price);
		System.out.println("Updated value of color is : " + joyStick3.color);
		System.out.println("Updated value of connectivity is : " + joyStick3.connectivity);
	
		System.out.println("Default value of brand is : " + joyStick4.brand);
		System.out.println("Default value of buttons is : " + joyStick4.buttons);
		System.out.println("Default value of price is : " + joyStick4.price);
		System.out.println("Default value of color is : " + joyStick4.color);
		System.out.println("Default value of connectivity is : " + joyStick4.connectivity);
		joyStick4.brand = "Razer";
		joyStick4.buttons = 14;
		joyStick4.price = 5000;
		joyStick4.color = "Green";
		joyStick4.connectivity = "Wireless";
		System.out.println("Updated value of brand is : " + joyStick4.brand);
		System.out.println("Updated value of buttons is : " + joyStick4.buttons);
		System.out.println("Updated value of price is : " + joyStick4.price);
		System.out.println("Updated value of color is : " + joyStick4.color);
		System.out.println("Updated value of connectivity is : " + joyStick4.connectivity);  

		System.out.println("Default value of brand is : " + joyStick5.brand);
		System.out.println("Default value of buttons is : " + joyStick5.buttons);
		System.out.println("Default value of price is : " + joyStick5.price);
		System.out.println("Default value of color is : " + joyStick5.color);
		System.out.println("Default value of connectivity is : " + joyStick5.connectivity);
		joyStick5.brand = "Redgear";
		joyStick5.buttons = 12;
		joyStick5.price = 1200;
		joyStick5.color = "Red";
		joyStick5.connectivity = "Wired";
		System.out.println("Updated value of brand is : " + joyStick5.brand);
		System.out.println("Updated value of buttons is : " + joyStick5.buttons);
		System.out.println("Updated value of price is : " + joyStick5.price);
		System.out.println("Updated value of color is : " + joyStick5.color);
		System.out.println("Updated value of connectivity is : " + joyStick5.connectivity);	
    }
}