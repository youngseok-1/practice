package com.ohgiraffers.level03;

import java.util.Scanner;

public class testb {
    public void sum2() {
//        * 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
//                *
//         * -- 입력 예시 --
//                * 정수를 입력하세요 : 5
//                *
//         * -- 출력 예시 --
//                * 1부터 5까지의 합 : 15
//                *
//         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int number1 = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= number1; i++) {
            sum += i;
        }
        System.out.println("1부터 " + (number1)+"까지의 합 :" +(sum));

    }

}
