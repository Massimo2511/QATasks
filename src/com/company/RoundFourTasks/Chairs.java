package com.company.RoundFourTasks;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Chairs extends FactoryProduct {
    public Chairs(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2, int humanHours) {
        super(materialType1, materialQuantity1, materialType2, materialQuantity2);
    }

    public Chairs(int manHours, int workersQuantity) {
        super(manHours, workersQuantity);
    }

    public Chairs(double weight, double length, double width, double height) {
        super(weight, length, width, height);
    }

    public static void result() {

        System.out.println("=============================================");
        System.out.println(" PRODUCT CHAIRS :");

        System.out.println("=============================================");

        Chairs chair = new Chairs("Wood", 10, "Metal", 20, 10);

        double priceOfMadeItem = costPrice(chair);


        double priceForSale = priceForSale(priceOfMadeItem);

        double manufactureTime = manufactureTime(new Chairs(10, 5));


        double deliveryPrice = deliveryPrice(new Chairs(25, 200, 300, 300));

    }
}


