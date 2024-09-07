package com.ohgiraffers.level03;

import java.util.Scanner;

public class testa {
    public void sum1() {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + (sum));
    }
}
