class CricketDataRunner {

    public static void main(String... values) {

        CricketData cricketData = new CricketData();

        Cricket cricket1  = new Cricket("Outdoor", "Leather", 11, "T20", "Stadium", "India", 3, "Bat", "Pro", "England");
        Cricket cricket2  = new Cricket("Outdoor", "Leather", 11, "ODI", "Ground", "Australia", 8, "Bat", "Pro", "England");
        Cricket cricket3  = new Cricket("Outdoor", "Tennis", 8, "Street", "Road", "India", 2, "Bat", "Local", "India");
        Cricket cricket4  = new Cricket("Indoor", "Soft", 6, "Box", "Indoor", "USA", 1.5, "Bat", "Amateur", "USA");
        Cricket cricket5  = new Cricket("Outdoor", "Leather", 11, "Test", "Stadium", "England", 40, "Bat", "Pro", "England");
        Cricket cricket6  = new Cricket("Outdoor", "Leather", 11, "T20", "Stadium", "India", 3, "Bat", "Pro", "India");
        Cricket cricket7  = new Cricket("Outdoor", "Leather", 11, "ODI", "Ground", "South Africa", 8, "Bat", "Pro", "England");
        Cricket cricket8  = new Cricket("Indoor", "Soft", 6, "Box", "Indoor", "UAE", 1.5, "Bat", "Amateur", "UAE");
        Cricket cricket9  = new Cricket("Outdoor", "Tennis", 8, "Street", "Road", "India", 2, "Bat", "Local", "India");
        Cricket cricket10 = new Cricket("Outdoor", "Leather", 11, "Test", "Stadium", "Australia", 40, "Bat", "Pro", "England");
        Cricket cricket11 = new Cricket("Outdoor", "Leather", 11, "T20", "Stadium", "India", 3, "Bat", "Pro", "India");
        Cricket cricket12 = new Cricket("Outdoor", "Leather", 11, "ODI", "Ground", "New Zealand", 8, "Bat", "Pro", "England");
        Cricket cricket13 = new Cricket("Outdoor", "Tennis", 8, "Street", "Road", "India", 2, "Bat", "Local", "India");
        Cricket cricket14 = new Cricket("Indoor", "Soft", 6, "Box", "Indoor", "USA", 1.5, "Bat", "Amateur", "USA");
        Cricket cricket15 = new Cricket("Outdoor", "Leather", 11, "Test", "Stadium", "England", 40, "Bat", "Pro", "England");
        Cricket cricket16 = new Cricket("Outdoor", "Leather", 11, "T20", "Stadium", "India", 3, "Bat", "Pro", "India");
        Cricket cricket17 = new Cricket("Outdoor", "Leather", 11, "ODI", "Ground", "Pakistan", 8, "Bat", "Pro", "England");
        Cricket cricket18 = new Cricket("Indoor", "Soft", 6, "Box", "Indoor", "UAE", 1.5, "Bat", "Amateur", "UAE");
        Cricket cricket19 = new Cricket("Outdoor", "Tennis", 8, "Street", "Road", "India", 2, "Bat", "Local", "India");
        Cricket cricket20 = new Cricket("Outdoor", "Leather", 11, "Test", "Stadium", "Australia", 40, "Bat", "Pro", "England");

        cricketData.addCricket(null);
        cricketData.addCricket(cricket1);
        cricketData.addCricket(cricket2);
        cricketData.addCricket(cricket3);
        cricketData.addCricket(cricket4);
        cricketData.addCricket(cricket5);
        cricketData.addCricket(cricket6);
        cricketData.addCricket(cricket7);
        cricketData.addCricket(cricket8);
        cricketData.addCricket(cricket9);
        cricketData.addCricket(cricket10);
        cricketData.addCricket(cricket11);
        cricketData.addCricket(cricket12);
        cricketData.addCricket(cricket13);
        cricketData.addCricket(cricket14);
        cricketData.addCricket(cricket15);
        cricketData.addCricket(cricket16);
        cricketData.addCricket(cricket17);
        cricketData.addCricket(cricket18);
        cricketData.addCricket(cricket19);
        cricketData.addCricket(cricket20);
        cricketData.displayAll();
    }
}