class SoftDrink {

    String name;
    String flavor;
    double price;
    double volume;
    String brand;
    String color;
    boolean carbonated;
    String packaging;
    int expiryMonths;
    String origin;

    SoftDrink(String name, String flavor, double price, double volume, String brand, String color, boolean carbonated, String packaging, int expiryMonths, String origin) 
	{

        this.name = name;
        this.flavor = flavor;
        this.price = price;
        this.volume = volume;
        this.brand = brand;
        this.color = color;
        this.carbonated = carbonated;
        this.packaging = packaging;
        this.expiryMonths = expiryMonths;
        this.origin = origin;
    }

    void display() {
        System.out.println("Name: "+name);
		System.out.println("Flavor: "+flavor);
		System.out.println("Price: "+price);
		System.out.println("Volume: "+volume);
        System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);	
		System.out.println("Carbonated: "+carbonated); 
		System.out.println("Packaging: "+packaging);
		System.out.println("Expiry Months: "+expiryMonths);
		System.out.println("Origin: "+origin);
    }
}