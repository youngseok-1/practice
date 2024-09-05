package com.ohgiraffers.level02;

import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Application6 app6 = new Application6();
        app6.machine();


    } /* 과일 이름("apple", "banana", "melon", "grape") 중 한 가지를 문자열로 입력하면
     * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
     * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
     *
     * -- 상품 가격 --
     * apple :  1000원
     * banana : 3000원
     * melon : 2000원
     * grape : 5000원
     *
     * -- 입력 예시 --
     * 과일 이름을 입력하세요 : banana
     *
     * -- 출력 예시 --
     * banana의 가격은 3000원 입니다.
     * */

    public void machine() {
        System.out.println("===============  과일자판기 =========");
        System.out.println(" apple  banana  melon   grape   ");
        System.out.println("=============================================");
        System.out.print("과일 이름을 입력하세요 : ");

        // 원하는 과일을 문자열로 입력받는다.
        Scanner sc = new Scanner(System.in);
        String selectedFruit = sc.nextLine();

        String order = "";
        int price = 0;

        switch (selectedFruit) {
            case "apple":
                order = "apple";
                price = 1000;
                break;
            case "banana":
                order = "banana";
                price = 3000;
                break;
            case "melon":
                order = "melon";
                price = 2000;
                break;
            case "grape":
                order = "grape";
                price = 5000;
                break;
        }
        System.out.println(order + "의 가격은 " + (price) +"입니다.");
    }
}
