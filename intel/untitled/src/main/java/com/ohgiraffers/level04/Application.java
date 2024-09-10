package com.ohgiraffers.level04;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Person person = new Person();

        Scanner sc = new Scanner(System.in);

            System.out.println("휴대폰 사용 프로그램");
            System.out.println("1.화면켜기");
            System.out.println("2.화면끄기");

            int no = sc.nextInt();

            switch (no) {
                case 1 : person.on();
                case 2 :
                    System.out.println("화면을 끕니다.");
                    System.exit(0);
                    break;
            }
        }
    }



