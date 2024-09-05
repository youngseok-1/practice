package com.ohgiraffers.level01.basic;


public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
       cal.checkMethod();

       int sum1 = cal.sum1to10();
        System.out.println("1부터 10까지의 합 : " +(sum1));

       int check1 = cal.checkMaxNumber(10, 20);
        System.out.println("두 수 중 큰 수 는 " + (check1));

        int sum2 = cal.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 : " + (sum2));

        int minus2 = cal.minusTwoNumber(10,5);
        System.out.println("10과 5의 차는 : " + (minus2));




    }

    }



