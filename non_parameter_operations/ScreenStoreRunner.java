class ScreenStoreRunner {

    public static void main(String... values) {

        ScreenStore screenStore = new ScreenStore();

        Screen screen1  = new Screen("Samsung", 24.0, "Full HD", "LED", 60, "16:9", 12000, "Non-Touch", "Black", "Office");
        Screen screen2  = new Screen("LG", 27.0, "4K", "IPS", 144, "16:9", 25000, "Non-Touch", "Black", "Gaming");
        Screen screen3  = new Screen("Dell", 22.0, "HD", "LCD", 60, "16:10", 9000, "Non-Touch", "Grey", "Office");
        Screen screen4  = new Screen("HP", 24.0, "Full HD", "IPS", 75, "16:9", 14000, "Non-Touch", "Black", "Office");
        Screen screen5  = new Screen("Acer", 27.0, "Full HD", "LED", 165, "16:9", 18000, "Non-Touch", "Black", "Gaming");
        Screen screen6  = new Screen("Lenovo", 21.5, "HD", "LCD", 60, "16:9", 8000, "Non-Touch", "Black", "Office");
        Screen screen7  = new Screen("Asus", 24.0, "Full HD", "IPS", 144, "16:9", 17000, "Non-Touch", "Black", "Gaming");
        Screen screen8  = new Screen("BenQ", 27.0, "4K", "IPS", 60, "16:9", 30000, "Non-Touch", "Black", "Design");
        Screen screen9  = new Screen("Sony", 32.0, "4K", "LED", 60, "16:9", 40000, "Touch", "Black", "Entertainment");
        Screen screen10 = new Screen("MI", 24.0, "Full HD", "LED", 75, "16:9", 13000, "Non-Touch", "Black", "Office");
        Screen screen11 = new Screen("Samsung", 27.0, "4K", "IPS", 144, "16:9", 28000, "Non-Touch", "Black", "Gaming");
        Screen screen12 = new Screen("LG", 24.0, "Full HD", "LED", 75, "16:9", 15000, "Non-Touch", "White", "Office");
        Screen screen13 = new Screen("Dell", 27.0, "4K", "IPS", 60, "16:9", 32000, "Non-Touch", "Black", "Design");
        Screen screen14 = new Screen("HP", 22.0, "HD", "LCD", 60, "16:9", 8500, "Non-Touch", "Grey", "Office");
        Screen screen15 = new Screen("Acer", 24.0, "Full HD", "LED", 144, "16:9", 16000, "Non-Touch", "Black", "Gaming");
        Screen screen16 = new Screen("Lenovo", 27.0, "QHD", "IPS", 75, "16:9", 20000, "Non-Touch", "Black", "Office");
        Screen screen17 = new Screen("Asus", 32.0, "4K", "IPS", 144, "16:9", 45000, "Touch", "Black", "Gaming");
        Screen screen18 = new Screen("BenQ", 24.0, "Full HD", "IPS", 60, "16:9", 14000, "Non-Touch", "Black", "Design");
        Screen screen19 = new Screen("Sony", 27.0, "4K", "LED", 60, "16:9", 38000, "Touch", "Black", "Entertainment");
        Screen screen20 = new Screen("MI", 21.5, "HD", "LED", 60, "16:9", 7500, "Non-Touch", "Black", "Office");

        screenStore.saveScreen(null);
        screenStore.saveScreen(screen1);
        screenStore.saveScreen(screen2);
        screenStore.saveScreen(screen3);
        screenStore.saveScreen(screen4);
        screenStore.saveScreen(screen5);
        screenStore.saveScreen(screen6);
        screenStore.saveScreen(screen7);
        screenStore.saveScreen(screen8);
        screenStore.saveScreen(screen9);
        screenStore.saveScreen(screen10);
        screenStore.saveScreen(screen11);
        screenStore.saveScreen(screen12);
        screenStore.saveScreen(screen13);
        screenStore.saveScreen(screen14);
        screenStore.saveScreen(screen15);
        screenStore.saveScreen(screen16);
        screenStore.saveScreen(screen17);
        screenStore.saveScreen(screen18);
        screenStore.saveScreen(screen19);
        screenStore.saveScreen(screen20);

        screenStore.displayAll();
    }
}