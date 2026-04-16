class TissueStore {

    Tissue[] tissues = new Tissue[20];
    int index = 0;

    void saveTissue(Tissue tissue) 
	{

        System.out.println("Running saveTissue in TissueStore");

        if (tissue != null) 
		{
            if (this.index < this.tissues.length) 
			{
                this.tissues[this.index] = tissue;
                System.out.println("Tissue added to index: " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("Store is full");
            }
        } 
		else 
		{
            System.out.println("Tissue cannot be null");
        }
    }

    void displayAll() 
	{

        System.out.println("Displaying all Tissues");

        for (Tissue tissue : tissues) 
		{
            if (tissue != null) {
                tissue.display();
            }
			else
			{
				System.out.println("Tissue is null");
			}
        }
    }
}