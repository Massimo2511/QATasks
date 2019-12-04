package com.company.RoundFourTasks;

public class Product {

    public String materialType1;
    public int materialQuantity1;
    public String materialType2;
    public int materialQuantity2;

    public int manHours;
    public int workersQuantity;


    public double weight;
    public double length;
    public double width;
    public double height;


    public Product(String materialType1, int materialQuantity1, String materialType2, int materialQuantity2) {
        this.materialType1 = materialType1;
        this.materialQuantity1 = materialQuantity1;
        this.materialType2 = materialType2;
        this.materialQuantity2 = materialQuantity2;
    }

    public Product(int manHours, int workersQuantity) {
        this.manHours = manHours;
        this.workersQuantity = workersQuantity;
    }


    public Product(double weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }


}
