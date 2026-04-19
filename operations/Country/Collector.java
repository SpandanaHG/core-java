class Collector {
	
	String name;
	int batchNo;
	
	Collector(String name , int batchNo)
	{
		this.name = name;
		this.batchNo = batchNo;
	}
	
	void displayCollector()
	{
		System.out.println("Running displayCollector in Collector");
		System.out.println("Name : "+this.name);
		System.out.println("Batch Number : "+this.batchNo);
		
	}
}