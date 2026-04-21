class PodiumRunner {
	
    public static void main(String... args) 
	{
        Podium podium1 = new SmartPodium();
        podium1.height(); 
		podium1.material(); 
		podium1.usage(); 
		podium1.design(); 
		podium1.stability();

        Podium podium2 = new SmartPodium();
        podium2.height(); 
		podium2.material(); 
		podium2.usage(); 
		podium2.design(); 
		podium2.stability();
    }
}