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


        Manager chairMaterial1 = new Manager("Wood", 10, "Metal", 20, 10);
        Manager chairTimeToDo = new Manager(10, 5);
        Manager chairSize = new Manager(25, 200, 300, 300);

       double priceOfMadeItem= costPrice(chairMaterial1);

        priceForSale(priceOfMadeItem);

        manufactureTime(chairTimeToDo);

        deliveryPrice(chairSize);


    }
}