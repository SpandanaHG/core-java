class Sand {
	
	String type;
	String location;
	String texture;
	
	Sand(String type , String location , String texture)
	{
		this.type = type;
		this.location = location;
		this.texture = texture;
	}
	
	void display()
	{
		System.out.println("Running display in Sand");
		System.out.println("Type: "+this.type);
		System.out.println("Location: "+this.location);
		System.out.println("Texture: "+this.texture);
	}
}