package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();

        String myString = "hello \n";
        for (int i = 0; i < n; i++) {
            System.out.print(myString);
        }

    }

}
