class DocumentRunner {
	
	public static void main(String... values)
	{
		Document document1 = new PDFDocument("Java", 200);
		System.out.println("Title : "+document1.title);
		System.out.println("Number of pages : "+document1.noOfPage);
		
		Document document2 = new PDFDocument("Python", 175);
		System.out.println("Title : "+document2.title);
		System.out.println("Number of pages : "+document2.noOfPage);
	}
}