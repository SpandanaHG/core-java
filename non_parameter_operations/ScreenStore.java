class ScreenStore {

    Screen[] screens = new Screen[20];
    int index = 0;

    void saveScreen(Screen screen) {
        System.out.println("Running saveScreen in ScreenStore");

        if (screen != null) {
            if (this.index < this.screens.length) 
			{
                this.screens[this.index] = screen;
                System.out.println("Screen added to index: " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("Store is full");
            }
        } 
		else 
		{
            System.out.println("Screen cannot be null");
        }
    }

    void displayAll() {
        System.out.println("Displaying all Screens");

        for (Screen screen : screens) {
            if (screen != null) {
                screen.display();
            }
        }
    }
}