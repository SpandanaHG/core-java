1. Class: Class is a keyword , it converts the java program to byte code . This byte code helps the JVM to run the program. ANd alos the java program sarts from the class 

2. Create the class car and display its properties:
class Car {
	String color;
	String model;
	double speed;
	
	Car(String color , String model , double speed)
	{
		this.color = color;
		this.model = model;
		this.speed = speed;
	}
	
	void displayCar()
	{
		System.out.println("Running displayCar in Car");
		System.out.println("Color : "+this.color);
		System.out.println("Model : "+this.model);
		System.out.println("Speed : "+this.speed);
	}
	
class CarRunner {
	public static void main(String... values)
	{
		Car car1 = new Car("Black" , "SUV 500" , "220");
		car1.displayCar();
		
		Car car2 = new Car("Blue" , "Alto" , "200");
		car2.displayCar();
	}
}

3. Method in Java :
	Methods are the members of the class . Every class must contain the method's . JVM also search for the main method to run the program.
	
4. Method overloading in Java : 
	in class , if there is more then one method with the same method name but different parameters then it is called as the method overloading
	example:
	class Book {
		public static void display(int noOfPages)
		{
			System.out.println("Running display in the Book");
			System.out.println("Number of pages : "+noOfPages);
		}
		public static void display(String brand)
		{
			System.out.println("Running display in the Book");
			System.out.println("Brand : "+brand);
		}
		public static void display(int noOfPages , String brand)
		{
			System.out.println("Running display in the Book");
			System.out.println("Number of pages : "+noOfPages);
			System.out.println("Brand : "+brand);
		}
	}

5. Constructor : Constructors are the special methods because there is no return type in the constructors . Constructors are used with the new keyword . It is used to create the instances.

6. Types of constructors: There are 3
	1.Default constructors
	2.No argument constructors 
	3.Parameterized constructors 
	
7. This keyword : this keyword is used for the chaining . The chaining needs to be done in the same class then the this keyword is used . this keyword is also used to access the instance variables in the class.

