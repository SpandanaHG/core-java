class PortRunner {
	
    public static void main(String... args) 
	{

        Boat boat1 = new Boat("BoatA", 10, BoatType.FISHING);
        boat1.color = "Blue";
        boat1.engine = true;

        Boat boat2 = new Boat("BoatB", 20, BoatType.SAILING);
        boat2.color = "White";
        boat2.engine = false;

        Boat boat3 = new Boat("BoatC", 50, BoatType.CRUISE);
        boat3.color = "Black";
        boat3.engine = true;

        Boat[] boats = {boat1, boat2, boat3};

        Port port = new Port("Mangalore Port", "Karnataka", boats);
        port.docks = 5;
        port.open = true;

        port.display();
    }
}