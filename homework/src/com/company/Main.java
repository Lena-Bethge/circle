package com.company;

public class Main {

    public static void main(String[] args) {

     //1 задание
        int num1=20;
        int num2=3;
        int num3=18;
        int num4=3;
        boolean sum1=(num1%num2)==0;
        boolean sum2=(num3%num4)==0;
        System.out.println("sum1 - " +sum1);
        System.out.println("sum2 - " +sum2);

        //2 задание
        double temperature1 = 130.5;
        double temperature2 = 50.5;
        boolean isCorrect = temperature1>100 && temperature2<100;
        System.out.println("The device work correct - " +  isCorrect);

        //3 задание
        int temp1 = 155;
        double temp2 = -1;
        boolean correct = (temp1>150 && temp2<0) || (temp1<0 && temp2>150);
        System.out.println("The device work correct - " +  correct);

        //4 задание
        int tp1 = 50;
        double tp2 = 60.5;
        double tp3 = -20;
        boolean cor = ((tp1>0 && tp2>0 && tp3<0)) || ((tp1<0 && tp2<0 && tp3>0)) && ((tp1!=tp2) && (tp2!=tp3) && (tp1!=tp3));
        System.out.println("The device work correct - " +  cor);



    }
}
