package com.bridgelabz.sharemarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class Account {
    float totalValue = 0;
    ArrayList<Database> stock = new ArrayList<>();

    int counter = 0;

    Scanner sc = new Scanner(System.in);
    Random rn = new Random();

    void storeDetails() {
        char option = 'Y';

        while (option == 'Y') {
            Database d1 = new Database();
            System.out.println("Enter the details of the stock u wnt to add:");
            System.out.print("Enter the name of stock u want to purchase : ");
            String stname = sc.next();
            d1.stockNames = stname;
            System.out.print("Enter the number of shares u want to purchase : ");
            float snumber = sc.nextFloat();
            d1.setNumberOfShare(snumber);
            float sprice = rn.nextFloat();
            d1.setSharePrice(sprice);
            System.out.print("The current price of the " + stname + " share : " + sprice);
            System.out.println("\n");
            System.out.print("Press M if you wish to enter more stocks :");
            option = sc.next().charAt(0);
            stock.add(d1);

        }
        counter++;

    }

    void currentValueCalculator() {

        float cv;
        for (int i = 0; i < stock.size(); i++) {
            Database d1 = stock.get(i);
            d1.stockCurrentValue = d1.numberOfShare * d1.sharePrice;
        }
    }

    void totalValueCalculator() {

        for (int i = 0; i < stock.size(); i++) {

            Database d1 = stock.get(i);
            totalValue = (totalValue + d1.stockCurrentValue);

        }
        System.out.println("The Total value of all the stocks is : " + totalValue);

    }

    void debit() {
        // Database d1 = stock.get(5);

        int debitAmount;
        System.out.println("Enter the amount you want to debit :");
        debitAmount = sc.nextInt();
        if (debitAmount > totalValue) {

            System.out.println("Debit amount exceeded account balance.");

        } else {

            totalValue = totalValue - debitAmount;
            System.out.println("The remaining account balance is:" + totalValue);

        }

    }

    void displayDetails() {

        Iterator itr = stock.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());


        }


    }


}
