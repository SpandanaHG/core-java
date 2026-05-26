public class Application {
    private String appName;
    private String developer;
    private double version;
    private int downloads;
    private String category;

    public Application() {
    }

    public Application(String appName, String developer, double version, int downloads, String category) {
        this.appName = appName;
        this.developer = developer;
        this.version = version;
        this.downloads = downloads;
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            Application application1 = this;
            if(obj instanceof Application)
            {
                Application application2 = (Application) obj;

                if(application1.appName.equals(application2.appName) && application1.developer.equals(application2.developer))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
