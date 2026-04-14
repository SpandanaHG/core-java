class BiometricRunner {

    public static void main(String[] args) {

        Biometric bio = new Biometric();

        bio.addUser("User1");
        bio.addUser("User2");
        bio.addUser("User3");
        bio.addUser("User4");
        bio.addUser("User5");

        bio.searchUser("User3");   
        bio.searchUser("User10");  
    }
}