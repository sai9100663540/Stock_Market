package com.bridgelabz.sharemarket;

import java.util.Scanner;

class Stock {
    float numberOfStocks;
    String[] shareName = new String[10];
    float numberOfShares;
    float sharePrice;
    int index;
    float stockValue;
    float totalValue;


    Stock() {

        System.out.println("The list of stocks available : 1 :RELIANCE , 2: Tata Motors , 3: Motherson Sumi , 4 :Adani Group, 5: Asian Paint, ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the stock : ");
        this.shareName = new String[]{sc.next()};
        System.out.println("Enter the number of shares you want to buy : ");
        this.numberOfShares = sc.nextFloat();
        System.out.println("ENter the index of the stock : ");
        this.index = sc.nextInt();
        System.out.println("Enter number of stocks you want to buy : ");
        this.numberOfStocks = sc.nextFloat();
        System.out.println("Enter the price of per share");
        this.sharePrice = sc.nextFloat();


    }

    void stockReport(){

        switch (index){

            case 1:
                stockValue = sharePrice;
                totalValue = sharePrice * numberOfShares;
                System.out.println("The total value of your RELIANCE shares are : " + totalValue);
                break;
            case 2:
                stockValue = sharePrice;
                totalValue = sharePrice * numberOfShares;
                System.out.println("The total value of your TATA shares are : " + totalValue);
                break;
            case 3:
                stockValue = sharePrice;
                totalValue = sharePrice * numberOfShares;
                System.out.println("The total value of your MOTHERSON SUMI shares are : " + totalValue);
                break;
            case 4:
                stockValue = sharePrice;
                totalValue = sharePrice * numberOfShares;
                System.out.println("The total value of your ADANI shares are : " + totalValue);
                break;
            case 5:
                stockValue = sharePrice;
                totalValue = sharePrice * numberOfShares;
                System.out.println("The total value of your ASIAN PAINTS shares are : " + totalValue);
                break;
        }
    }
}





class StockPortfolio extends Stock {
}




public class StockAccountManagement {
    public static void main(String[] args) {
        Stock s1 = new Stock();
        s1.stockReport();
    }

}
