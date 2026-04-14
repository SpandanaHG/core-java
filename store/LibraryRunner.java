class LibraryRunner{
	
	public static void main(String... values)
	{
		Library library = new Library();
		library.saveBookName("Harry Potter");
		library.saveBookName("Pride and Prejudice");
		library.saveBookName("Hamlet");
		library.saveBookName("The Stranger");
		library.saveBookName("The Old Man and the Sea");
		
		library.searchBookName("Hamlet");
		library.searchBookName("Beloved");
	}
}