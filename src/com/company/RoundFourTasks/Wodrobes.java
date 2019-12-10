package com.company.RoundFourTasks;

public class Wodrobes extends FactoryProduct {
    public Wodrobes(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2, int humanHours) {
        super(materialType1, materialQuantity1, materialType2, materialQuantity2);
    }

    public Wodrobes(int manHours, int workersQuantity) {
        super(manHours, workersQuantity);
    }

    public Wodrobes(double weight, double length, double width, double height) {
        super(weight, length, width, height);
    }

    public static void result() {

        System.out.println("=============================================");
        System.out.println(" PRODUCT WODROBES :");

        System.out.println("=============================================");

        Wodrobes wodrobe = new Wodrobes("Wood", 20, "Metal", 25, 10);

        double priceOfMadeItem = costPrice(wodrobe);

        double priceForSale = priceForSale(priceOfMadeItem);

        double manufactureTime = manufactureTime(new Chairs(11, 6));


        double deliveryPrice = deliveryPrice(new Chairs(80, 300, 400, 400));
    }
}