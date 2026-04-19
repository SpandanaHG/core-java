class CountryRunner {

    public static void main(String[] args) {

        CountryStore store = new CountryStore();

        Collector collector1 = new Collector("Ravi Kumar", 2010);
        Collector collector2 = new Collector("Suma Reddy", 2012);

        District district1 = new District("Bangalore Urban", collector1);
        District district2 = new District("Bangalore Rural", collector2);
        District[] districts1 = {district1, district2};

        City city1 = new City("Bengaluru", 2, districts1);
        State state1 = new State("Karnataka", 68000000, city1);

        Address address1 = new Address(101, 560001, state1);
        President president1 = new President("Droupadi Murmu", 65, address1);

        Country country1 = new Country("India", president1, new State[]{state1});

        Collector collector3 = new Collector("John Smith", 2008);
        Collector collector4 = new Collector("Emily Davis", 2011);

        District district3 = new District("Los Angeles County", collector3);
        District district4 = new District("San Diego County", collector4);
        District[] districts2 = {district3, district4};

        City city2 = new City("Los Angeles", 2, districts2);
        State state2 = new State("California", 39500000, city2);

        Address address2 = new Address(202, 90001, state2);
        President president2 = new President("Joe Biden", 81, address2);

        Country country2 = new Country("United States", president2, new State[]{state2});

        Collector collector5 = new Collector("Oliver Brown", 2009);
        Collector collector6 = new Collector("Sophia Wilson", 2013);

        District district5 = new District("Greater London", collector5);
        District district6 = new District("Camden", collector6);
        District[] districts3 = {district5, district6};

        City city3 = new City("London", 2, districts3);
        State state3 = new State("England", 56000000, city3);

        Address address3 = new Address(303, 10001, state3);
        President president3 = new President("Rishi Sunak", 44, address3);

        Country country3 = new Country("United Kingdom", president3, new State[]{state3});

        Collector collector7 = new Collector("Liam Johnson", 2014);
        Collector collector8 = new Collector("Ava Taylor", 2016);

        District district7 = new District("Sydney Region", collector7);
        District district8 = new District("Western Sydney", collector8);
        District[] districts4 = {district7, district8};

        City city4 = new City("Sydney", 2, districts4);
        State state4 = new State("New South Wales", 8000000, city4);

        Address address4 = new Address(404, 2000, state4);
        President president4 = new President("Anthony Albanese", 61, address4);

        Country country4 = new Country("Australia", president4, new State[]{state4});

        Collector collector9 = new Collector("Noah Martin", 2015);
        Collector collector10 = new Collector("Emma Clark", 2017);

        District district9 = new District("Toronto Division", collector9);
        District district10 = new District("York Region", collector10);
        District[] districts5 = {district9, district10};

        City city5 = new City("Toronto", 2, districts5);
        State state5 = new State("Ontario", 15000000, city5);

        Address address5 = new Address(505, 1000, state5);
        President president5 = new President("Justin Trudeau", 52, address5);

        Country country5 = new Country("Canada", president5, new State[]{state5});

        store.save(country1);
        store.save(country2);
        store.save(country3);
        store.save(country4);
        store.save(country5);


        System.out.println("----- FIND COUNTRY -----");
        Country country = store.findByName("Canada");
        if (country != null) {
            country.displayCountry();
        }

        System.out.println("----- FIND STATE -----");
        State state = store.findStateByStateName("California");
        if (state != null) {
            state.displayState();
        }

        System.out.println("----- FIND CITY -----");
        City[] cities = store.findAllCityByStateName("Karnataka");
        if (cities != null) {
            for (City city : cities) {
                if (city != null) {
                    city.displayCity();
                }
            }
        }

        System.out.println("----- DISTRICT COUNT -----");
        int count = store.findNoOfDistrictsByCityName("Sydney");
        System.out.println("No of Districts: " + count);

        System.out.println("----- FIND BY COLLECTOR -----");
        Country countryC = store.findByCollectorName("Emma Clark");
        if (countryC != null) {
            countryC.displayCountry();
        }
    }
}