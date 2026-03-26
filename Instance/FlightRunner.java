class FlightRunner {
    public static void main(String[] values) {

        Flight nameObj = new Flight();
        Flight sourceObj = new Flight();
        Flight destinationObj = new Flight();
        Flight priceObj = new Flight();
        Flight durationObj = new Flight();
        System.out.println("Default value of flightName is : " + nameObj.flightName);
        System.out.println("Default value of source is : " + sourceObj.source);
        System.out.println("Default value of destination is : " + destinationObj.destination);
        System.out.println("Default value of ticketPrice is : " + priceObj.ticketPrice);
        System.out.println("Default value of duration is : " + durationObj.duration);

        nameObj.flightName = "IndiGo";
        sourceObj.source = "Bangalore";
        destinationObj.destination = "Delhi";
        priceObj.ticketPrice = 5500;
        durationObj.duration = 3;
        System.out.println("Updated value of flightName is : " + nameObj.flightName);
        System.out.println("Updated value of source is : " + sourceObj.source);
        System.out.println("Updated value of destination is : " + destinationObj.destination);
        System.out.println("Updated value of ticketPrice is : " + priceObj.ticketPrice);
        System.out.println("Updated value of duration is : " + durationObj.duration);
    }
}