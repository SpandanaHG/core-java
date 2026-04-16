class Screen {

    String brand;
    double size;
    String resolution;
    String panelType;
    int refreshRate;
    String aspectRatio;
    double price;
    String touchType;  
    String color;
    String usageType;

    Screen(String brand, double size, String resolution, String panelType,
           int refreshRate, String aspectRatio, double price,
           String touchType, String color, String usageType) {

        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
        this.aspectRatio = aspectRatio;
        this.price = price;
        this.touchType = touchType;
        this.color = color;
        this.usageType = usageType;
    }

    void display() {
        System.out.println("Running display in the Screen");
        System.out.println("Brand: " + this.brand);
        System.out.println("Size: " + this.size);
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Panel Type: " + this.panelType);
        System.out.println("Refresh Rate: " + this.refreshRate);
        System.out.println("Aspect Ratio: " + this.aspectRatio);
        System.out.println("Price: " + this.price);
        System.out.println("Touch Type: " + this.touchType);
        System.out.println("Color: " + this.color);
        System.out.println("Usage Type: " + this.usageType);
    }
}