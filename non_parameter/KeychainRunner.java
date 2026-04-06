class KeychainRunner {
	
	public static void main(String[] values)
	{
		Keychain keychain = new Keychain();
		KeychainRun keychainRun = new KeychainRun();
		
		keychainRun.info(keychain);
		
		keychain.material = "Plastic";
		keychain.color = "Black";
		keychain.shape = "Square";
		keychain.price = 30;
		keychain.hasLight = true;
		
		keychainRun.info(keychain);
	}
}