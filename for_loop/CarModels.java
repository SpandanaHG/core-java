class CarModels{
	public static void main(String[] values)
	{
		String model1 =  "Maruti Swift";
		String model2 = "Hyundai i20";
		String model3 = "Tata Nexon";
		String model4 = "Mahindra Thar";
		String model5 = "Kia Seltos";
		String model6 = "Honda City";
		String model7 = "Toyota Innova";
		String model8 = "Skoda Slavia";
		String model9 = "Volkswagen Polo";
		String model10 = "Ford EcoSport";
		String model11 = "Renault Kwid";
		String model12 = "Nissan Magnite";
		String model13 = "MG Hector";
		String model14 = "Tata Punch";
		String model15 = "Hyundai Creta";
		String model16 = "Maruti Baleno";
		String model17 = "Toyota Fortuner";
		String model18 = "Jeep Compass";
		String model19 = "BMW 3 Series";
		String model20 = "Audi A4";
		String model21 = "Mercedes-Benz C-Class";
		String model22 = "Tesla Model 3";
		String model23 = "Volvo XC90";
		String model24 = "Jaguar XF";
		String model25 = "Porsche Cayenne";
		
		String[] models = {model1 , model2 , model3 , model4 , model5 , model6 , model7 , model8 , model9 , model10 , model11 , model12 , model13 , model14 , model15 , model16 , model17 , model18 , model19 , model20 , model21 , model22 , model23 , model24 , model25 };
		
		for(int start=24 ; start >=0 ; start--)
		{
			System.out.println("Car Model at position "+start+ " is :"+models[start]);
		}	
		System.out.println(models[25]);
	}
}