package com.ohgiraffers.level03;

import java.util.Scanner;

public class testc {
    public void sum3() {
        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int number1 = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= number1; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1부터 " + number1 + "까지의 짝수의 합 : " + sum);
    }
}