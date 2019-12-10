package com.company.RoundFourTasks;

public class Sofas extends FactoryProduct {
    public Sofas(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2, int humanHours) {
        super(materialType1, materialQuantity1, materialType2, materialQuantity2);
    }

    public Sofas(int manHours, int workersQuantity) {
        super(manHours, workersQuantity);
    }

    public Sofas(double weight, double length, double width, double height) {
        super(weight, length, width, height);
    }

    public static void result() {

        System.out.println("=============================================");
        System.out.println(" PRODUCT SOFAS :");

        System.out.println("=============================================");
        Sofas sofas = new Sofas("Wood", 30, "Metal", 35, 10);

        double priceOfMadeItem = costPrice(sofas);

        double priceForSale = priceForSale(priceOfMadeItem);

        double manufactureTime = manufactureTime(new Chairs(12, 7));

        double deliveryPrice = deliveryPrice(new Chairs(100, 400, 500, 350));

    }
}