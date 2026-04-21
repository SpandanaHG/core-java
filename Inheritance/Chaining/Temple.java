class Temple {

    String name;
    String location;
    String type;
    int establishedYear;
    double entryFee;

	Temple(String name, String location, String type)
	{
		this.name = name;
		this.location = location;
		this.type = type;
	}
	
	
    Temple(String name, String location, String type, int establishedYear, double entryFee) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.establishedYear = establishedYear;
        this.entryFee = entryFee;
    }
}