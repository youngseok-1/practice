package com.ohgiraffers.level01.basic;



public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10() {
        int sum1 = (1+2+3+4+5+6+7+8+9+10);
        return sum1;
    }
    public int checkMaxNumber(int first, int second) {
        return (first > second)? first : second;
    }

    public int sumTwoNumber(int first, int second) {
        int sum2 = (first + second);
        return sum2;
   }

   public int minusTwoNumber(int first, int second) {
        int minus = (first - second);
        return minus;
   }



}