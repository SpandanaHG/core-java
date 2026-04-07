class Monitor{	
	
	int screenSize;
    Resolution resolution;
	
	void display(){
		System.out.println("Running display in Monitor");
		System.out.println("Screen Size: "+this.screenSize);
		System.out.println("Resolution: "+this.resolution);
	}
}
