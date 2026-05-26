public class Camera {
    private String brand;
    private int megapixels;
    private double zoom;
    private String type;
    private double price;

    public Camera() {
    }

    public Camera(String brand, int megapixels, double zoom, String type, double price) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.zoom = zoom;
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            Camera camera1 = this;
            if(obj instanceof Camera)
            {
                Camera camera2 = (Camera) obj;
                if(camera1.brand.equals(camera2.brand) && camera1.megapixels == camera2.megapixels)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    public double getZoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
