class MickeyMouse {
	
	String color = "Black";
    String type = "Cartoon";
    int age = 90;
    String dress = "Red";
    boolean isFamous = true;
	
	void display()
	{
		System.out.println("Running display in the MickeyMouse");
		System.out.println("Color: " + this.color);
		System.out.println("Type: " + this.type);
		System.out.println("Age: " + this.age);
		System.out.println("Dress: " + this.dress);
		System.out.println("Is Famous: " + this.isFamous);
	}
}