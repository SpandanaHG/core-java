class PhotoFrameRunner {
    public static void main(String[] values) {

        PhotoFrame materialObj = new PhotoFrame();
        PhotoFrame colorObj = new PhotoFrame();
        PhotoFrame priceObj = new PhotoFrame();
        PhotoFrame shapeObj = new PhotoFrame();
        PhotoFrame sizeObj = new PhotoFrame();
        System.out.println("Default value of material is : " + materialObj.material);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of shape is : " + shapeObj.shape);
        System.out.println("Default value of size is : " + sizeObj.size);

        materialObj.material = "Wood";
        colorObj.color = "Brown";
        priceObj.price = 500;
        shapeObj.shape = "Rectangle";
        sizeObj.size = 12.5;
        System.out.println("Updated value of material is : " + materialObj.material);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of shape is : " + shapeObj.shape);
        System.out.println("Updated value of size is : " + sizeObj.size);
    }
}