package com.company;

public class Main {

    public static void main(String[] args) {

        //

        boolean weekday;
        boolean vacation;
        weekday = false;
        vacation = false;
        boolean isSleeping = !weekday || vacation;
        System.out.println(isSleeping);

        boolean petyaSmile;
        boolean vasiaSmile;
        petyaSmile = true;
        vasiaSmile = true;
        boolean kidsTrouble = (petyaSmile && vasiaSmile) || (!petyaSmile && !vasiaSmile);
        System.out.println(kidsTrouble);




    }
}
