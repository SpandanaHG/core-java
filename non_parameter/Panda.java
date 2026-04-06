class Panda {
	
	String color = "Black & White";
    String type = "Animal";
    int age = 5;
    String food = "Bamboo";
    boolean isCute = true;
	
	void display()
	{
		System.out.println("Running display in the Panda");
		System.out.println("Color: " + this.color);
		System.out.println("Type: " + this.type);
		System.out.println("Age: " + this.age);
		System.out.println("Food: " + this.food);
		System.out.println("Is Cute: " + this.isCute);
	}
}