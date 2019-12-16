package com.company.RoundFourTasks;

public class Calculations {

    private double pricePerItemOfMaterial1 = 5;
    private double pricePerItemOfMaterial2 = 10;
    private double pricePerHourOfManHours = 100;

    private double perKilogram = 1;
    private double perCentimeterLength = 2;
    private double perCentimeterWidth = 3;
    private double perCentimeterHeight = 4;

    private double costPrice;
    private double salePrice;
    private int timeForManufacture = 0;
    private double priceOfDelivery;


    public void costPrice(FactoryProduct product) {

        System.out.println("First material is : " + product.getMaterialType1());
        System.out.println("Second material is : " + product.getMaterialType2());

        costPrice = (product.getMaterialQuantity1() * pricePerItemOfMaterial1) + (product.getMaterialQuantity2() * pricePerItemOfMaterial2) + (pricePerHourOfManHours * product.getManHours());
        System.out.println("Cost price of current product is : " + costPrice);
        System.out.println("*********************************************");
    }

    public void priceForSale(FactoryProduct product) {

        salePrice = costPrice + (costPrice * 0.2);

        System.out.println("Sale price of the product is : " + salePrice);
        System.out.println("*********************************************");
    }


    public void manufactureTime(FactoryProduct product) {

        if (product.getManHours() >= 1 && product.getManHours() <= 8) {
            timeForManufacture++;
            System.out.println(" Days needed : " + product.getWorkersQuantity());
        } else {
            if (product.getManHours() >= 9 && product.getManHours() <= 16) {
                product.setWorkersQuantity(2);
                System.out.println(" Days needed : " + product.getWorkersQuantity());
            } else {
                if (product.getManHours() >= 17 && product.getManHours() <= 24) {
                    product.setWorkersQuantity(3);
                    System.out.println(" Days needed : " + product.getWorkersQuantity());
                }
                product.setWorkersQuantity(4);
                System.out.println(" Days needed : " + product.getWorkersQuantity());
            }
        }
        System.out.println("*********************************************");
    }

    public void deliveryPrice(FactoryProduct product) {

        priceOfDelivery = (product.getWeight() * perKilogram) + (product.getLength() * perCentimeterLength) + (product.getWidth() * perCentimeterWidth) + (product.getHeight() * perCentimeterHeight);
        System.out.println("Delivery price is : " + priceOfDelivery);
    }
}
