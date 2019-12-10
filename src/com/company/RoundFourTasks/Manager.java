package com.company.RoundFourTasks;

public class Manager extends FactoryProduct {

    // Переоприділив конструктор додавши "int humanHours"
    public Manager(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2, int humanHours) {
        super(materialType1, materialQuantity1, materialType2, materialQuantity2);
    }

    public Manager(int manHours, int workersQuantity) {
        super(manHours, workersQuantity);
    }

    public Manager(double weight, double length, double width, double height) {
        super(weight, length, width, height);
    }

    public static void main(String[] args) {
       System.out.println();

       Chairs.result();
       Wodrobes.result();
       Sofas.result();
    }
}