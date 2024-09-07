package com.ohgiraffers.level03;

import java.util.Scanner;

public class testd {
    public void sum4() {
        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요
         *
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) { //String 클래스의 메소드로 문자열의 길이를 int형으로 반환한다.
            char ch = str.charAt(i); // 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
            System.out.println(i +" : " +ch);
        }
    }
}
