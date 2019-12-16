package com.company.RoundFourTasks;

public class Product {

    public String getMaterialType1() {
        return materialType1;
    }

    public void setMaterialType1(String materialType1) {
        this.materialType1 = materialType1;
    }

    public int getMaterialQuantity1() {
        return materialQuantity1;
    }

    public void setMaterialQuantity1(int materialQuantity1) {
        this.materialQuantity1 = materialQuantity1;
    }

    public String getMaterialType2() {
        return materialType2;
    }

    public void setMaterialType2(String materialType2) {
        this.materialType2 = materialType2;
    }

    public int getMaterialQuantity2() {
        return materialQuantity2;
    }

    public void setMaterialQuantity2(int materialQuantity2) {
        this.materialQuantity2 = materialQuantity2;
    }

    public int getManHours() {
        return manHours;
    }

    public void setManHours(int manHours) {
        this.manHours = manHours;
    }

    public int getWorkersQuantity() {
        return workersQuantity;
    }

    public void setWorkersQuantity(int workersQuantity) {
        this.workersQuantity = workersQuantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private String materialType1;
    private int materialQuantity1;
    private String materialType2;
    private int materialQuantity2;

    private int manHours;
    private int workersQuantity;


    private double weight;
    private double length;
    private double width;
    private double height;



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
