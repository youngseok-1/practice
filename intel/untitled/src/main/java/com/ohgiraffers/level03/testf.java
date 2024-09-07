package com.ohgiraffers.level03;

import java.util.Scanner;

public class testf {
    public void sum6() {
        /*
         * 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int number1 = sc.nextInt();

        String result = ""; // 문자열을 담아야하니 String으로


        for (int i = 1; i <= number1; i++) {
            if (i % 2 == 0) {
                result += "박"; // 짝수이면 "박" 을 누적
            } else {
                result += "수"; // 홀수이면 "수" 을 누적
            }
        }


        System.out.println(result);
    }
}