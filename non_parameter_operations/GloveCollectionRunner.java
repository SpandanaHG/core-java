class GloveCollectionRunner {

    public static void main(String... values) {

        GloveCollection gloveCollection = new GloveCollection();

        Glove glove1  = new Glove("Nike", "Sports", "Leather", "M", "Black", 1500, "Cricket", "Unisex", "High", "USA");
        Glove glove2  = new Glove("Adidas", "Sports", "Cotton", "L", "White", 1200, "Gym", "Unisex", "Medium", "Germany");
        Glove glove3  = new Glove("Puma", "Winter", "Wool", "M", "Grey", 1000, "Winter", "Unisex", "High", "Germany");
        Glove glove4  = new Glove("Reebok", "Sports", "Leather", "S", "Black", 1400, "Cricket", "Male", "High", "USA");
        Glove glove5  = new Glove("Fila", "Casual", "Cotton", "M", "Blue", 800, "Daily", "Female", "Medium", "Italy");
        Glove glove6  = new Glove("Nike", "Sports", "Leather", "L", "Black", 1600, "Football", "Male", "High", "USA");
        Glove glove7  = new Glove("Adidas", "Winter", "Wool", "M", "White", 1100, "Winter", "Unisex", "High", "Germany");
        Glove glove8  = new Glove("Puma", "Sports", "Cotton", "S", "Grey", 900, "Gym", "Female", "Medium", "Germany");
        Glove glove9  = new Glove("Reebok", "Casual", "Leather", "M", "Black", 1300, "Daily", "Male", "High", "USA");
        Glove glove10 = new Glove("Fila", "Sports", "Cotton", "L", "Blue", 850, "Cricket", "Unisex", "Medium", "Italy");
        Glove glove11 = new Glove("Nike", "Winter", "Wool", "M", "Black", 1550, "Winter", "Unisex", "High", "USA");
        Glove glove12 = new Glove("Adidas", "Sports", "Leather", "S", "White", 1250, "Football", "Male", "High", "Germany");
        Glove glove13 = new Glove("Puma", "Casual", "Cotton", "M", "Grey", 950, "Daily", "Female", "Medium", "Germany");
        Glove glove14 = new Glove("Reebok", "Sports", "Leather", "L", "Black", 1450, "Cricket", "Male", "High", "USA");
        Glove glove15 = new Glove("Fila", "Winter", "Wool", "M", "Blue", 900, "Winter", "Unisex", "Medium", "Italy");
        Glove glove16 = new Glove("Nike", "Sports", "Leather", "S", "Black", 1500, "Gym", "Male", "High", "USA");
        Glove glove17 = new Glove("Adidas", "Casual", "Cotton", "M", "White", 1000, "Daily", "Female", "Medium", "Germany");
        Glove glove18 = new Glove("Puma", "Winter", "Wool", "L", "Grey", 1100, "Winter", "Unisex", "High", "Germany");
        Glove glove19 = new Glove("Reebok", "Sports", "Leather", "M", "Black", 1350, "Football", "Male", "High", "USA");
        Glove glove20 = new Glove("Fila", "Casual", "Cotton", "S", "Blue", 850, "Daily", "Female", "Medium", "Italy");

        gloveCollection.addGlove(null);
        gloveCollection.addGlove(glove1);
        gloveCollection.addGlove(glove2);
        gloveCollection.addGlove(glove3);
        gloveCollection.addGlove(glove4);
        gloveCollection.addGlove(glove5);
        gloveCollection.addGlove(glove6);
        gloveCollection.addGlove(glove7);
        gloveCollection.addGlove(glove8);
        gloveCollection.addGlove(glove9);
        gloveCollection.addGlove(glove10);
        gloveCollection.addGlove(glove11);
        gloveCollection.addGlove(glove12);
        gloveCollection.addGlove(glove13);
        gloveCollection.addGlove(glove14);
        gloveCollection.addGlove(glove15);
        gloveCollection.addGlove(glove16);
        gloveCollection.addGlove(glove17);
        gloveCollection.addGlove(glove18);
        gloveCollection.addGlove(glove19);
        gloveCollection.addGlove(glove20);
    
        gloveCollection.displayAll();
    }
}