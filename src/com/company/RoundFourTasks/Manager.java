package com.company.RoundFourTasks;

public class Manager extends Calculations {


    public static void main(String[] args) {

        Manager manager = new Manager();


        System.out.println("::::::::::::::::::: WODROBE ::::::::::::::::::::::::::");
        FactoryProduct productWodrobe = new FactoryProduct("Wood", 20, "Metal", 25, 10);
        manager.costPrice(productWodrobe);
        manager.priceForSale(productWodrobe);

        FactoryProduct wodrobeProductManufactureTime = new FactoryProduct(10, 5);
        manager.manufactureTime(wodrobeProductManufactureTime);

        FactoryProduct wodrobeProductdimensions = new FactoryProduct(80, 300, 400, 400);
        manager.deliveryPrice(wodrobeProductdimensions);
        System.out.println();
        System.out.println();


        System.out.println("::::::::::::::::::: CHAIR ::::::::::::::::::::::::::");
        FactoryProduct productCHAIR = new FactoryProduct("Wood", 12, "Metal", 15, 5);
        manager.costPrice(productCHAIR);
        manager.priceForSale(productCHAIR);

        FactoryProduct chairProductManufactureTime = new FactoryProduct(5, 3);
        manager.manufactureTime(chairProductManufactureTime);

        FactoryProduct chairProductdimensions = new FactoryProduct(15, 250, 50, 200);
        manager.deliveryPrice(chairProductdimensions);
        System.out.println();
        System.out.println();


        System.out.println("::::::::::::::::::: SOFA ::::::::::::::::::::::::::");
        FactoryProduct productSofa = new FactoryProduct("Wood", 30, "Metal", 40, 5);
        manager.costPrice(productSofa);
        manager.priceForSale(productSofa);

        FactoryProduct sofaProductManufactureTime = new FactoryProduct(25, 5);
        manager.manufactureTime(sofaProductManufactureTime);

        FactoryProduct sofaProductdimensions = new FactoryProduct(150, 400, 300, 200);
        manager.deliveryPrice(sofaProductdimensions);
        
    }
}