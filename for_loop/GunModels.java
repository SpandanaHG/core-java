class GunModels{
	public static void main(String[] args)
	{
		String model1 =  "AK-47";
		String model2 = "AK-74";
		String model3 = "M16";
		String model4 = "M4 Carbine";
		String model5 = "AR-15";
		String model6 = "Glock 17";
		String model7 = "Glock 19";
		String model8 = "Desert Eagle";
		String model9 = "Beretta 92";
		String model10 = "SIG Sauer P320";
		String model11 = "Colt 1911";
		String model12 = "MP5";
		String model13 = "Uzi";
		String model14 = "FN SCAR";
		String model15 = "Steyr AUG";
		String model16 = "FAMAS";
		String model17 = "HK416";
		String model18 = "HK417";
		String model19 = "Remington 870";
		String model20 = "Mossberg 500";
		String model21 = "Winchester Model 70";
		String model22 = "Barrett M82";
		String model23 = "Dragunov SVD";
		String model24 = "Lee-Enfield";
		String model25 = "Ruger 10/22";
		String model26 = "CZ 75";
		String model27 = "Walther PPK";
		String model28 = "Springfield XD";
		String model29 = "FN Five-seven";
		String model30 = "Browning Hi-Power";
		String[] models = {model1 , model2 , model3 , model4 , model5 , model6 , model7 , model8 , model9 , model10 , model11 , model12 , model13 , model14 , model15 , model16 , model17 , model18 , model19 , model20 , model21 , model22 , model23 , model24 , model25 , model26 , model27 , model28 , model29 , model30};
		
		for(int start=29 ; start >=0 ; start--)
		{
			System.out.println("Gun Model at position "+start+ " is :"+models[start]);
		}	
		System.out.println(models[30]);
	}
}