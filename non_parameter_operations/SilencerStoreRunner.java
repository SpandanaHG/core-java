class SilencerStoreRunner {

    public static void main(String... values) {

        SilencerStore silencerStore = new SilencerStore();

        Silencer silencer1  = new Silencer("Bosch", "Steel", 3.5, 45.0, "Cylindrical", "Bike", 2000, "Black", "Low", "India");
        Silencer silencer2 = new Silencer("Yamaha", "Alloy", 4.0, 50.0, "Oval", "Bike", 3500, "Silver", "Medium", "Japan");
        Silencer silencer3 = new Silencer("Honda", "Steel", 3.8, 48.0, "Round", "Bike", 3000, "Black", "Low", "India");
        Silencer silencer4 = new Silencer("Suzuki", "Aluminum", 4.2, 52.0, "Oval", "Bike", 4000, "Grey", "Medium", "Japan");
        Silencer silencer5 = new Silencer("TVS", "Steel", 3.6, 46.0, "Cylindrical", "Bike", 2500, "Black", "Low", "India");
        Silencer silencer6 = new Silencer("Bajaj", "Steel", 3.7, 47.0, "Round", "Bike", 2600, "Black", "Low", "India");
        Silencer silencer7 = new Silencer("KTM", "Alloy", 4.5, 55.0, "Sharp", "Bike", 5000, "Orange", "High", "Austria");
        Silencer silencer8 = new Silencer("Royal Enfield", "Steel", 5.0, 60.0, "Long", "Bike", 6000, "Black", "Heavy", "India");
        Silencer silencer9 = new Silencer("Hero", "Steel", 3.4, 44.0, "Round", "Bike", 2200, "Black", "Low", "India");
        Silencer silencer10 = new Silencer("Mahindra", "Steel", 4.8, 58.0, "Oval", "Car", 7000, "Silver", "Medium", "India");
        Silencer silencer11 = new Silencer("Ford", "Alloy", 5.5, 65.0, "Long", "Car", 8000, "Grey", "Medium", "USA");
        Silencer silencer12 = new Silencer("Hyundai", "Steel", 4.9, 59.0, "Oval", "Car", 7200, "Silver", "Low", "Korea");
        Silencer silencer13 = new Silencer("Toyota", "Steel", 5.2, 62.0, "Round", "Car", 7500, "Black", "Low", "Japan");
        Silencer silencer14 = new Silencer("Nissan", "Alloy", 5.3, 63.0, "Oval", "Car", 7700, "Grey", "Medium", "Japan");
        Silencer silencer15 = new Silencer("Chevrolet", "Steel", 5.4, 64.0, "Long", "Car", 7800, "Black", "Medium", "USA");
        Silencer silencer16 = new Silencer("Audi", "Alloy", 6.0, 70.0, "Dual", "Car", 12000, "Silver", "Low", "Germany");
        Silencer silencer17 = new Silencer("BMW", "Alloy", 6.2, 72.0, "Dual", "Car", 13000, "Black", "Low", "Germany");
        Silencer silencer18 = new Silencer("Mercedes", "Alloy", 6.5, 75.0, "Dual", "Car", 15000, "Silver", "Low", "Germany");
        Silencer silencer19 = new Silencer("Skoda", "Steel", 5.1, 61.0, "Round", "Car", 7400, "Grey", "Medium", "Czech");
        Silencer silencer20 = new Silencer("Volkswagen", "Steel", 5.3, 63.0, "Oval", "Car", 7600, "Black", "Medium", "Germany");

        silencerStore.saveSilencer(null);
        silencerStore.saveSilencer(silencer1);
        silencerStore.saveSilencer(silencer2);
        silencerStore.saveSilencer(silencer3);
        silencerStore.saveSilencer(silencer4);
        silencerStore.saveSilencer(silencer5);
        silencerStore.saveSilencer(silencer6);
        silencerStore.saveSilencer(silencer7);
        silencerStore.saveSilencer(silencer8);
        silencerStore.saveSilencer(silencer9);
        silencerStore.saveSilencer(silencer10);
        silencerStore.saveSilencer(silencer11);
        silencerStore.saveSilencer(silencer12);
        silencerStore.saveSilencer(silencer13);
        silencerStore.saveSilencer(silencer14);
        silencerStore.saveSilencer(silencer15);
        silencerStore.saveSilencer(silencer16);
        silencerStore.saveSilencer(silencer17);
        silencerStore.saveSilencer(silencer18);
        silencerStore.saveSilencer(silencer19);
        silencerStore.saveSilencer(silencer20);

        silencerStore.displayAll();
    }
}