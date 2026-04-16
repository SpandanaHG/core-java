class LaserCollectionRunner {

    public static void main(String... values) {

        LaserCollection laserCollection = new LaserCollection();

        Laser laser1  = new Laser("Diode", "Red", 5.0, 650, "Medical", "Metal", 5000, "Philips", "India", "Auto");
        Laser laser2  = new Laser("Fiber", "Green", 6.5, 532, "Industrial", "Alloy", 7000, "Bosch", "Germany", "Manual");
        Laser laser3  = new Laser("Gas", "Blue", 4.2, 450, "Cutting", "Steel", 6000, "Hitachi", "Japan", "Auto");
        Laser laser4  = new Laser("Solid", "Infrared", 7.0, 800, "Surgery", "Alloy", 9000, "Siemens", "Germany", "Auto");
        Laser laser5  = new Laser("Diode", "Red", 5.5, 650, "Medical", "Metal", 5200, "Philips", "India", "Manual");
        Laser laser6  = new Laser("Fiber", "Green", 6.0, 532, "Industrial", "Alloy", 7100, "Bosch", "Germany", "Auto");
        Laser laser7  = new Laser("Gas", "Blue", 4.5, 450, "Cutting", "Steel", 6200, "Hitachi", "Japan", "Manual");
        Laser laser8  = new Laser("Solid", "Infrared", 7.2, 800, "Surgery", "Alloy", 9200, "Siemens", "Germany", "Auto");
        Laser laser9  = new Laser("Diode", "Red", 5.3, 650, "Medical", "Metal", 5100, "Philips", "India", "Auto");
        Laser laser10 = new Laser("Fiber", "Green", 6.8, 532, "Industrial", "Alloy", 7300, "Bosch", "Germany", "Manual");
        Laser laser11 = new Laser("Gas", "Blue", 4.8, 450, "Cutting", "Steel", 6400, "Hitachi", "Japan", "Auto");
        Laser laser12 = new Laser("Solid", "Infrared", 7.5, 800, "Surgery", "Alloy", 9500, "Siemens", "Germany", "Auto");
        Laser laser13 = new Laser("Diode", "Red", 5.6, 650, "Medical", "Metal", 5300, "Philips", "India", "Manual");
        Laser laser14 = new Laser("Fiber", "Green", 6.2, 532, "Industrial", "Alloy", 7200, "Bosch", "Germany", "Auto");
        Laser laser15 = new Laser("Gas", "Blue", 4.6, 450, "Cutting", "Steel", 6300, "Hitachi", "Japan", "Manual");
        Laser laser16 = new Laser("Solid", "Infrared", 7.3, 800, "Surgery", "Alloy", 9100, "Siemens", "Germany", "Auto");
        Laser laser17 = new Laser("Diode", "Red", 5.4, 650, "Medical", "Metal", 5150, "Philips", "India", "Auto");
        Laser laser18 = new Laser("Fiber", "Green", 6.9, 532, "Industrial", "Alloy", 7400, "Bosch", "Germany", "Manual");
        Laser laser19 = new Laser("Gas", "Blue", 4.7, 450, "Cutting", "Steel", 6350, "Hitachi", "Japan", "Auto");
        Laser laser20 = new Laser("Solid", "Infrared", 7.6, 800, "Surgery", "Alloy", 9600, "Siemens", "Germany", "Auto");

        laserCollection.addLaser(null);
        laserCollection.addLaser(laser1);
        laserCollection.addLaser(laser2);
        laserCollection.addLaser(laser3);
        laserCollection.addLaser(laser4);
        laserCollection.addLaser(laser5);
        laserCollection.addLaser(laser6);
        laserCollection.addLaser(laser7);
        laserCollection.addLaser(laser8);
        laserCollection.addLaser(laser9);
        laserCollection.addLaser(laser10);
        laserCollection.addLaser(laser11);
        laserCollection.addLaser(laser12);
        laserCollection.addLaser(laser13);
        laserCollection.addLaser(laser14);
        laserCollection.addLaser(laser15);
        laserCollection.addLaser(laser16);
        laserCollection.addLaser(laser17);
        laserCollection.addLaser(laser18);
        laserCollection.addLaser(laser19);
        laserCollection.addLaser(laser20);
		
        laserCollection.displayAll();
    }
}