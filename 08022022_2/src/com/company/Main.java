package com.company;

public class Main {

    public static void main(String[] args) {
	int eurAmount=100;
    double rateEURToUSD =1.2;

    double usdAmount=eurAmount* rateEURToUSD;

    System.out.println("EUR: "+eurAmount);
    System.out.println("Курс евро к доллару: "+rateEURToUSD);
    System.out.println("USD: "+ usdAmount);

    }
}
