class NewsPaper {

    Lang lang;
    String paperQuality;
    double price;
    int noOfPages;
    String name;
    double height;
    double weight;
    String headerText;
    String footerText;
    int fontSize;
    int noOfImages;
    String headEditor;
    String printHouseAddress;
    InkColor inkColor;
    int noOfContents;

    NewsPaper(Lang lang, String paperQuality, double price, int noOfPages, String name,double height, double weight, String headerText, String footerText,
              int fontSize, int noOfImages, String headEditor,String printHouseAddress, InkColor inkColor, int noOfContents) {

        this.lang = lang;
        this.paperQuality = paperQuality;
        this.price = price;
        this.noOfPages = noOfPages;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.headerText = headerText;
        this.footerText = footerText;
        this.fontSize = fontSize;
        this.noOfImages = noOfImages;
        this.headEditor = headEditor;
        this.printHouseAddress = printHouseAddress;
        this.inkColor = inkColor;
        this.noOfContents = noOfContents;
    }

    void display() {
		System.out.println("Running display in NewsPaper");
        System.out.println("Lang: " + this.lang);
        System.out.println("Paper Quality: " + this.paperQuality);
        System.out.println("Price: " + this.price);
        System.out.println("No Of Pages: " + this.noOfPages);
        System.out.println("Name: " + this.name);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("Header Text: " + this.headerText);
        System.out.println("Footer Text: " + this.footerText);
        System.out.println("Font Size: " + this.fontSize);
        System.out.println("No Of Images: " + this.noOfImages);
        System.out.println("Head Editor: " + this.headEditor);
        System.out.println("Print House Address: " + this.printHouseAddress);
        System.out.println("Ink Color: " + this.inkColor);
        System.out.println("No Of Contents: " + this.noOfContents);
    }
}