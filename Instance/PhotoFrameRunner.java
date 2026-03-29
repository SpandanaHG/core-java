class PhotoFrameRunner {
    public static void main(String[] values) {

        PhotoFrame photoFrame1 = new PhotoFrame();
        PhotoFrame photoFrame2 = new PhotoFrame();
        PhotoFrame photoFrame3 = new PhotoFrame();
        PhotoFrame photoFrame4 = new PhotoFrame();
        PhotoFrame photoFrame5 = new PhotoFrame();

        System.out.println("Default value of material is : " + photoFrame1.material);
        System.out.println("Default value of color is : " + photoFrame1.color);
        System.out.println("Default value of price is : " + photoFrame1.price);
        System.out.println("Default value of shape is : " + photoFrame1.shape);
        System.out.println("Default value of size is : " + photoFrame1.size);
        photoFrame1.material = "Wood";
        photoFrame1.color = "Brown";
        photoFrame1.price = 500;
        photoFrame1.shape = "Rectangle";
        photoFrame1.size = 12.5;
        System.out.println("Updated value of material is : " + photoFrame1.material);
        System.out.println("Updated value of color is : " + photoFrame1.color);
        System.out.println("Updated value of price is : " + photoFrame1.price);
        System.out.println("Updated value of shape is : " + photoFrame1.shape);
        System.out.println("Updated value of size is : " + photoFrame1.size);

        System.out.println("Default value of material is : " + photoFrame2.material);
        System.out.println("Default value of color is : " + photoFrame2.color);
        System.out.println("Default value of price is : " + photoFrame2.price);
        System.out.println("Default value of shape is : " + photoFrame2.shape);
        System.out.println("Default value of size is : " + photoFrame2.size);
        photoFrame2.material = "Plastic";
        photoFrame2.color = "Black";
        photoFrame2.price = 300;
        photoFrame2.shape = "Square";
        photoFrame2.size = 10.0;
        System.out.println("Updated value of material is : " + photoFrame2.material);
        System.out.println("Updated value of color is : " + photoFrame2.color);
        System.out.println("Updated value of price is : " + photoFrame2.price);
        System.out.println("Updated value of shape is : " + photoFrame2.shape);
        System.out.println("Updated value of size is : " + photoFrame2.size);

        System.out.println("Default value of material is : " + photoFrame3.material);
        System.out.println("Default value of color is : " + photoFrame3.color);
        System.out.println("Default value of price is : " + photoFrame3.price);
        System.out.println("Default value of shape is : " + photoFrame3.shape);
        System.out.println("Default value of size is : " + photoFrame3.size);
        photoFrame3.material = "Metal";
        photoFrame3.color = "Silver";
        photoFrame3.price = 700;
        photoFrame3.shape = "Rectangle";
        photoFrame3.size = 14.0;
        System.out.println("Updated value of material is : " + photoFrame3.material);
        System.out.println("Updated value of color is : " + photoFrame3.color);
        System.out.println("Updated value of price is : " + photoFrame3.price);
        System.out.println("Updated value of shape is : " + photoFrame3.shape);
        System.out.println("Updated value of size is : " + photoFrame3.size);

        System.out.println("Default value of material is : " + photoFrame4.material);
        System.out.println("Default value of color is : " + photoFrame4.color);
        System.out.println("Default value of price is : " + photoFrame4.price);
        System.out.println("Default value of shape is : " + photoFrame4.shape);
        System.out.println("Default value of size is : " + photoFrame4.size);
        photoFrame4.material = "Glass";
        photoFrame4.color = "Transparent";
        photoFrame4.price = 600;
        photoFrame4.shape = "Oval";
        photoFrame4.size = 11.5;
        System.out.println("Updated value of material is : " + photoFrame4.material);
        System.out.println("Updated value of color is : " + photoFrame4.color);
        System.out.println("Updated value of price is : " + photoFrame4.price);
        System.out.println("Updated value of shape is : " + photoFrame4.shape);
        System.out.println("Updated value of size is : " + photoFrame4.size);

        System.out.println("Default value of material is : " + photoFrame5.material);
        System.out.println("Default value of color is : " + photoFrame5.color);
        System.out.println("Default value of price is : " + photoFrame5.price);
        System.out.println("Default value of shape is : " + photoFrame5.shape);
        System.out.println("Default value of size is : " + photoFrame5.size);
        photoFrame5.material = "Fiber";
        photoFrame5.color = "Gold";
        photoFrame5.price = 800;
        photoFrame5.shape = "Rectangle";
        photoFrame5.size = 15.0;
        System.out.println("Updated value of material is : " + photoFrame5.material);
        System.out.println("Updated value of color is : " + photoFrame5.color);
        System.out.println("Updated value of price is : " + photoFrame5.price);
        System.out.println("Updated value of shape is : " + photoFrame5.shape);
        System.out.println("Updated value of size is : " + photoFrame5.size);
    }
}