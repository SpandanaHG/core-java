class StoreRunner {

    public static void main(String[] args) {

        Store store1 = new Store("Reliance", "Bangalore");
		System.out.println("Name : "+store1.name);
		System.out.println("Location : "+store1.location);
		System.out.println("Type : "+store1.type);
		System.out.println("Items : "+store1.items);
		System.out.println("Revenue : "+store1.revenue);

        Store store2 = new Store("DMart", "Mysore", "Retail");
		System.out.println("Name : "+store2.name);
		System.out.println("Location : "+store2.location);
		System.out.println("Type : "+store2.type);
		System.out.println("Items : "+store2.items);
		System.out.println("Revenue : "+store2.revenue);

        Store store3 = new Store("BigBazaar", "Delhi", "SuperMarket", 5000, 250000.0);
		System.out.println("Name : "+store3.name);
		System.out.println("Location : "+store3.location);
		System.out.println("Type : "+store3.type);
		System.out.println("Items : "+store3.items);
		System.out.println("Revenue : "+store3.revenue);
    }
}
