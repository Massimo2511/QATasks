package com.company.FirstTasks.Task_2_Price;

public class PriceDefiner {

    public void price_define(int price) {

        if (price < 1000) {

            System.out.println("Message : ");
            System.out.println("Price is GOOD ");
            System.out.println(price);
        }
        else{
            if (price == 1000) {
                System.out.println("Message : ");
                System.out.println("Price is not GOOD ");
                System.out.println("Bargin ? ");
                System.out.println(price-1);
            }
            else {
                System.out.println("Message : ");
                System.out.println("Price is not GOOD ");
                System.out.println(price);
            }
        }
    }
    }
