class CupRunner {
    public static void main(String[] values) {

        Cup materialObj = new Cup();
        Cup colorObj = new Cup();
        Cup priceObj = new Cup();
        Cup capacityObj = new Cup();
        Cup brandObj = new Cup();
        System.out.println("Default value of material is : " + materialObj.material);
        System.out.println("Default value of color is : " + colorObj.color);
        System.out.println("Default value of price is : " + priceObj.price);
        System.out.println("Default value of capacity is : " + capacityObj.capacity);
        System.out.println("Default value of brand is : " + brandObj.brand);

        materialObj.material = "Ceramic";
        colorObj.color = "White";
        priceObj.price = 150;
        capacityObj.capacity = 250;
        brandObj.brand = "Milton";
        System.out.println("Updated value of material is : " + materialObj.material);
        System.out.println("Updated value of color is : " + colorObj.color);
        System.out.println("Updated value of price is : " + priceObj.price);
        System.out.println("Updated value of capacity is : " + capacityObj.capacity);
        System.out.println("Updated value of brand is : " + brandObj.brand);
    }
}