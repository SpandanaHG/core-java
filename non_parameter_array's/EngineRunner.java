class EngineRunner {
	
    public static void main(String... args) 
	{

        Starter starter1 = new Starter("Bosch", 100, StarterType.ELECTRIC);
        starter1.color = "Black";
        starter1.working = true;

        Starter starter2 = new Starter("Lucas", 80, StarterType.MANUAL);
        starter2.color = "Grey";
        starter2.working = true;

        Starter starter3 = new Starter("Denso", 120, StarterType.AUTO);
        starter3.color = "Silver";
        starter3.working = false;

        Starter[] starters = {starter1, starter2, starter3};

        Engine engine = new Engine("CarEngine", "V8", starters);
        engine.capacity = 2000;
        engine.running = true;

        engine.display();
    }
}