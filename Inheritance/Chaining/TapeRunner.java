class TapeRunner {
	
    public static void main(String... args) 
	{

        Tape tape1 = new AdhesiveTape();
        tape1.type(); 
		tape1.adhesive(); 
		tape1.usage(); 
		tape1.size(); 
		tape1.strength();

        Tape tape2 = new AdhesiveTape();
        tape2.type(); 
		tape2.adhesive(); 
		tape2.usage(); 
		tape2.size(); 
		tape2.strength();
    }
}