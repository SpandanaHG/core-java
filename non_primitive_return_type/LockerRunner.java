class LockerRunner{
	
	public static void main(String... values)
	{
		Locker locker = new Locker("Office" , 10 , "Grey");
		locker.display();
		
		Lock lock = locker.getLock();
		lock.display();
	}
}