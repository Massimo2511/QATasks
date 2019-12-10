package com.company.RoundFourTasks;

public class FactoryProduct extends Product {


    public FactoryProduct(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2) {
        super(materialType1, materialQuantity1, materialType2, materialQuantity2);
    }

    public FactoryProduct(int manHours, int workersQuantity) {
        super(manHours, workersQuantity);

    }

    public FactoryProduct(double weight, double length, double width, double height) {
        super(weight, length, width, height);

    }


    /*public double costPrice(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2, int humanHours)*/
    public static double costPrice(FactoryProduct product) {

        System.out.println("First material is : " + product.materialType1);
        System.out.println("Second material is : " + product.materialType2);

        double pricePerItemOfMaterial1 = 5;
        double pricePerItemOfMaterial2 = 10;

        double pricePerHourOfManHours = 100;

        double costPrice = (product.materialQuantity1 * pricePerItemOfMaterial1) + (product.materialQuantity2 * pricePerItemOfMaterial2) + (pricePerHourOfManHours * product.manHours);
        System.out.println("Cost price of current product is : " + costPrice);
        System.out.println("*********************************************");

        return costPrice;

    }


    public static double priceForSale(double salePrice) {

        salePrice = salePrice + (salePrice * 0.2);

        System.out.println("Sale price of the product is : " + salePrice);
        System.out.println("*********************************************");

        return salePrice;
    }


    public static double manufactureTime(FactoryProduct chairTimeToDo) {

        int timeForManufacture = 0;

        if (chairTimeToDo.manHours >= 1 && chairTimeToDo.manHours <= 8) {
            timeForManufacture++;
            System.out.println(" Days needed : " + chairTimeToDo.workersQuantity);
        } else {
            if (chairTimeToDo.manHours >= 9 && chairTimeToDo.manHours <= 16) {
                chairTimeToDo.workersQuantity = +2;
                System.out.println(" Days needed : " + chairTimeToDo.workersQuantity);
            } else {
                if (chairTimeToDo.manHours >= 17 && chairTimeToDo.manHours <= 24) {
                    chairTimeToDo.workersQuantity = +3;
                    System.out.println(" Days needed : " + chairTimeToDo.workersQuantity);
                }
                chairTimeToDo.workersQuantity = +4;
                System.out.println(" Days needed : " + chairTimeToDo.workersQuantity);
            }
        }
        System.out.println("*********************************************");
        return timeForManufacture;
    }


    /*public static void deliveryPrice(double weight, double length, double width, double height)*/
    public static double deliveryPrice(FactoryProduct chairSize) {

        double perKilogram = 1;
        double perCentimeterLength = 2;
        double perCentimeterWidth = 3;
        double perCentimeterHeight = 4;
        double priceOfDelivery = (chairSize.weight * perKilogram) + (chairSize.length * perCentimeterLength) + (chairSize.width * perCentimeterWidth) + (chairSize.height * perCentimeterHeight);
        System.out.println("Delivery price is : " + priceOfDelivery);
        /*System.out.println("*********************************************");*/
        System.out.println();
        System.out.println();
        return priceOfDelivery;
    }

}
