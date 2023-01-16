package com.bridgelabz.sharemarket;

import java.util.ArrayList;

class Database{

    String stockNames;
    float numberOfShare;
    float sharePrice;
    float stockCurrentValue = 0;


    public float getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(float numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public float getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(float sharePrice) {
        this.sharePrice = sharePrice;
    }

    public float getStockCurrentValue() {
        return stockCurrentValue;
    }

    public void setStockCurrentValue(float stockCurrentValue) {
        this.stockCurrentValue = stockCurrentValue;
    }



    @Override
    public String toString() {
        return "Database{" +
                "stockNames='" + stockNames + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", stockCurrentValue=" + stockCurrentValue +
                '}';


    }






}


public class Main {
    public static void main(String[] args) {


        System.out.println(" ======= WELCOME TO THE STOCK ACCOUNT MANAGEMENT =====");
        Account acc1 = new Account();
        acc1.storeDetails();
        acc1.displayDetails();
        acc1.currentValueCalculator();
        acc1.displayDetails();
        acc1.totalValueCalculator();
        acc1.debit();

    }
}
