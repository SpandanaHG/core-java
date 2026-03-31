class Arduino {

    String boardType;
    String brand;
    double price;
    String microcontroller;
    int digitalPins;
    int analogPins;
    String clockSpeed;
    String voltage;
    boolean usbSupport;
    double weight;
    String usage;
    String manufacturer;
    int warranty;
    String country;
    String model;
    String version;
    double rating;
    String connectivity;
    boolean wifi;
    boolean bluetooth;
    String design;
    String code;
    String category;
    String availability;
    boolean programmable;
    boolean durable;

    Arduino() {
		System.out.println("No-args constructor of the class Arduino");
        boardType = "UNO";
        brand = "Arduino";
        price = 1200;
        microcontroller = "ATmega328P";
        digitalPins = 14;
        analogPins = 6;
        clockSpeed = "16MHz";
        voltage = "5V";
        usbSupport = true;
        weight = 0.05;
        usage = "Embedded";
        manufacturer = "Arduino LLC";
        warranty = 1;
        country = "Italy";
        model = "UNO R3";
        version = "2025";
        rating = 4.6;
        connectivity = "USB";
        wifi = false;
        bluetooth = false;
        design = "Compact";
        code = "AD01";
        category = "Electronics";
        availability = "Available";
        programmable = true;
        durable = true;
    }
}