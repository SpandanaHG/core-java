class ThinkPad {

    String model;
    String processor;
    double price;
    double weight;
    String ram;
    String storage;
    boolean touchScreen;
    String os;
    int warranty;
    String origin;

    ThinkPad(String model, String processor, double price, double weight, String ram, String storage, boolean touchScreen, String os, int warranty, String origin) 
	{

        this.model = model;
        this.processor = processor;
        this.price = price;
        this.weight = weight;
        this.ram = ram;
        this.storage = storage;
        this.touchScreen = touchScreen;
        this.os = os;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Model: "+model);
		System.out.println("Processor: "+processor);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight);
        System.out.println("RAM: "+ram);
		System.out.println("Storage: "+storage);
		System.out.println("Touch Screen: "+touchScreen);
		System.out.println("OS: "+os);
        System.out.println("Warranty: "+warranty);
		System.out.println("Origin: "+origin);
    }
}