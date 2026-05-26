public class Report {
    private String title;
    private String font;
    private int noOfPages;
    private double cost;

    public Report(){

    }

    public Report(String title, String font, int noOfPages, double cost) {
        this.title = title;
        this.font = font;
        this.noOfPages = noOfPages;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            Report report1 = this;
            if(obj instanceof Report)
            {
                Report report2 = (Report) obj;
                if(report1.title.equals(report2.title) && report1.noOfPages == report2.noOfPages)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
