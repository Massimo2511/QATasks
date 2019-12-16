package com.company.RoundFourTasks;

public class FactoryProduct extends Product {


    public FactoryProduct(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2, int manhours) {
        super(materialType1, materialQuantity1, materialType2, materialQuantity2);
    }

    public FactoryProduct(int manHours, int workersQuantity) {
        super(manHours, workersQuantity);

    }

    public FactoryProduct(double weight, double length, double width, double height) {
        super(weight, length, width, height);

    }

}
