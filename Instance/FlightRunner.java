class FlightRunner {
    public static void main(String[] values) {

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        Flight flight3 = new Flight();
        Flight flight4 = new Flight();
        Flight flight5 = new Flight();
		
        System.out.println("Default value of flightName is : " + flight1.flightName);
        System.out.println("Default value of source is : " + flight1.source);
        System.out.println("Default value of destination is : " + flight1.destination);
        System.out.println("Default value of ticketPrice is : " + flight1.ticketPrice);
        System.out.println("Default value of duration is : " + flight1.duration);
        flight1.flightName = "IndiGo";
        flight1.source = "Bangalore";
        flight1.destination = "Delhi";
        flight1.ticketPrice = 5500;
        flight1.duration = 3;
        System.out.println("Updated value of flightName is : " + flight1.flightName);
        System.out.println("Updated value of source is : " + flight1.source);
        System.out.println("Updated value of destination is : " + flight1.destination);
        System.out.println("Updated value of ticketPrice is : " + flight1.ticketPrice);
        System.out.println("Updated value of duration is : " + flight1.duration);
		
		System.out.println("Default value of flightName is : " + flight2.flightName);
		System.out.println("Default value of source is : " + flight2.source);
		System.out.println("Default value of destination is : " + flight2.destination);
		System.out.println("Default value of ticketPrice is : " + flight2.ticketPrice);
		System.out.println("Default value of duration is : " + flight2.duration);
		flight2.flightName = "Air India";
		flight2.source = "Mumbai";
		flight2.destination = "Chennai";
		flight2.ticketPrice = 4500;
		flight2.duration = 2;
		System.out.println("Updated value of flightName is : " + flight2.flightName);
		System.out.println("Updated value of source is : " + flight2.source);
		System.out.println("Updated value of destination is : " + flight2.destination);
		System.out.println("Updated value of ticketPrice is : " + flight2.ticketPrice);
		System.out.println("Updated value of duration is : " + flight2.duration);
		
		System.out.println("Default value of flightName is : " + flight3.flightName);
		System.out.println("Default value of source is : " + flight3.source);
		System.out.println("Default value of destination is : " + flight3.destination);
		System.out.println("Default value of ticketPrice is : " + flight3.ticketPrice);
		System.out.println("Default value of duration is : " + flight3.duration);
		flight3.flightName = "SpiceJet";
		flight3.source = "Hyderabad";
		flight3.destination = "Kolkata";
		flight3.ticketPrice = 5000;
		flight3.duration = 2;
		System.out.println("Updated value of flightName is : " + flight3.flightName);
		System.out.println("Updated value of source is : " + flight3.source);
		System.out.println("Updated value of destination is : " + flight3.destination);
		System.out.println("Updated value of ticketPrice is : " + flight3.ticketPrice);
		System.out.println("Updated value of duration is : " + flight3.duration);
		
		System.out.println("Default value of flightName is : " + flight4.flightName);
		System.out.println("Default value of source is : " + flight4.source);
		System.out.println("Default value of destination is : " + flight4.destination);
		System.out.println("Default value of ticketPrice is : " + flight4.ticketPrice);
		System.out.println("Default value of duration is : " + flight4.duration);
		flight4.flightName = "Vistara";
		flight4.source = "Delhi";
		flight4.destination = "Bangalore";
		flight4.ticketPrice = 6000;
		flight4.duration = 3;
		System.out.println("Updated value of flightName is : " + flight4.flightName);
		System.out.println("Updated value of source is : " + flight4.source);
		System.out.println("Updated value of destination is : " + flight4.destination);
		System.out.println("Updated value of ticketPrice is : " + flight4.ticketPrice);
		System.out.println("Updated value of duration is : " + flight4.duration);
		
		System.out.println("Default value of flightName is : " + flight5.flightName);
		System.out.println("Default value of source is : " + flight5.source);
		System.out.println("Default value of destination is : " + flight5.destination);
		System.out.println("Default value of ticketPrice is : " + flight5.ticketPrice);
		System.out.println("Default value of duration is : " + flight5.duration);
		flight5.flightName = "Go First";
		flight5.source = "Pune";
		flight5.destination = "Ahmedabad";
		flight5.ticketPrice = 4000;
		flight5.duration = 1;
		System.out.println("Updated value of flightName is : " + flight5.flightName);
		System.out.println("Updated value of source is : " + flight5.source);
		System.out.println("Updated value of destination is : " + flight5.destination);
		System.out.println("Updated value of ticketPrice is : " + flight5.ticketPrice);
		System.out.println("Updated value of duration is : " + flight5.duration);
    }
}