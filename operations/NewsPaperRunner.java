class NewsPaperRunner {

    public static void main(String[] args) {

        NewsPaperStore newsPaperStore = new NewsPaperStore();

        NewsPaper newsPaper1 = new NewsPaper(Lang.ENGLISH, "High", 10.0, 20, "Times",30.5, 200.0, "Top News", "End", 12, 5, "Ravi", "Bangalore", InkColor.BLACK, 15);

        NewsPaper newsPaper2 = new NewsPaper(Lang.KANNADA, "Medium", 8.0, 18, "Vijaya",28.0, 180.0, "Kannada News", "Footer", 11, 4,"Suresh", "Mysore", InkColor.BLUE, 12);

        NewsPaper newsPaper3 = new NewsPaper(Lang.HINDI, "Low", 6.0, 15, "Dainik",25.0, 150.0, "Hindi News", "EndLine", 10, 3,"Amit", "Delhi", InkColor.RED, 10);

        NewsPaper newsPaper4 = new NewsPaper(Lang.TAMIL, "High", 9.0, 22, "Dinakaran",29.0, 190.0, "Tamil News", "FooterLine", 13, 6, "Kumar", "Chennai", InkColor.GREEN, 14);

        NewsPaper newsPaper5 = new NewsPaper(Lang.TELUGU, "Medium", 7.0, 17, "Eenadu",27.0, 170.0, "Telugu News", "EndFooter", 11, 4,"Ramesh", "Hyderabad", InkColor.BLACK, 11);

        newsPaperStore.saveDetails(newsPaper1);
        newsPaperStore.saveDetails(newsPaper2);

        NewsPaper[] papers = { newsPaper3, newsPaper4, newsPaper5 };
        newsPaperStore.saveAll(papers);

        NewsPaper result = newsPaperStore.findByName("Times");
        if (result != null) {
            System.out.println("Displaying found NewsPaper:");
            result.display();
        }

        newsPaperStore.displayAll();

        System.out.println("Paper Quality of Times: " + newsPaperStore.findPaperQualityByName("Times"));
        System.out.println("Paper Quality of Vijaya: " + newsPaperStore.findPaperQualityByName("Vijaya"));
        System.out.println("Paper Quality of Dainik: " + newsPaperStore.findPaperQualityByName("Dainik"));
        System.out.println("Paper Quality of Unknown: " + newsPaperStore.findPaperQualityByName("Unknown"));

        System.out.println("Pages (Times, Ravi): " +newsPaperStore.findNoOfPagesByNameAndHeadEditor("Times", "Ravi"));

        System.out.println("Pages (Vijaya, Suresh): " +newsPaperStore.findNoOfPagesByNameAndHeadEditor("Vijaya", "Suresh"));

        System.out.println("Pages (Dainik, Amit): " +newsPaperStore.findNoOfPagesByNameAndHeadEditor("Dainik", "Amit"));

        System.out.println("Pages (Times, WrongEditor): " +newsPaperStore.findNoOfPagesByNameAndHeadEditor("Times", "WrongEditor"));

        System.out.println("Before updating Lang:");
        newsPaperStore.findByName("Times").display();

        newsPaperStore.updateLangByName("Times", Lang.HINDI);

        System.out.println("After updating Lang:");
        newsPaperStore.findByName("Times").display();

        System.out.println("Before updating InkColor, Images, FontSize:");
        newsPaperStore.findByName("Times").display();

        newsPaperStore.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(InkColor.GREEN, 10, 18, "Times", 30.5, 200.0);

        System.out.println("After updating InkColor, Images, FontSize:");
        newsPaperStore.findByName("Times").display();

        System.out.println("Before replacing NewsPaper:");
        newsPaperStore.displayAll();

        NewsPaper newPaper = new NewsPaper(Lang.MALAYALAM, "High", 12.0, 25, "MalayalaManorama",31.0, 210.0, "Breaking News", "FooterNew", 16, 7,"Joseph", "Bangalore", InkColor.BLUE, 18);

        newsPaperStore.replaceByPrintHouseAddress("Bangalore", newPaper);

        System.out.println("After replacing NewsPaper:");
        newsPaperStore.displayAll();
    }
}