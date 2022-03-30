package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(9+3);
        System.out.println(9/3);

      //1. Написать метод, выводящий сумму двух переменных целого типа на экран
        int a=54;
        int b=16;
        int sum=a+b;
        System.out.println(a+b);
        System.out.println(sum);

      //2. Написать метод, выводящий результат деления двух переменных целого типа на экран
        double c=7;
        int d=3;
        double divided=c/d;
        System.out.println(c/d);
        System.out.println(divided);

      //3. Написать метод, выводящий  на экран результат возведения переменной типа инт в квадрат
        int n=3;
        System.out.println(n*n);

      //4. Пусть цена товара А составляет 1000 евро, товара В 500 евро. Если клиент покупает товары вместе, на них
        // действует скидка 100 евро. вывести на экран переменную, которая соответствует стоимости товаров А +В  со скидкой

        int priceA=1000;
        int priceB=500;
        int discount=100;
        int result=priceA+priceB-discount;
        System.out.println(result);

        //5.Вывести на экран площадь и периметр круга используя переменную радиус
        // perimetr=2piR
        // area=piR^2

        double radius=7.5;
        double perimetr=2*3.14*radius;
        double area=3.14*radius;
        System.out.println(perimetr);
        System.out.println(area);

        //6.написать программу  для перевода температуры из градусов фаренгейта в градусы цельсия
        //С=(5*(F-32))/9

        double farenheit= 400;
        double celsius= (5*(farenheit-32.0)/9.0);
        System.out.println(celsius);

        //7. написать программу, переводящую дюймы в метры. Один дюйм 0,0254 метра

        double inch= 1000.0;
        double meters= inch*0.0254;
        System.out.println(meters);

        //8. вывести на экран среднее арифметическое трех переменных x,y,z
        int x=1;
        int y=2;
        int z=3;
        int result1=(x+y+z)/3;
        System.out.println(result1);
    }
}
