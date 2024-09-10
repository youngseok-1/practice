package com.ohgiraffers.level04;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Phone {

    private boolean isOn;

    public void on() {
        if(isOn) {
            System.out.println("이미 화면이 켜져있습니다.");
        } else {
            this.isOn = true;
            System.out.println("화면을 켰습니다. 잠금을 풀어주세요.");

            lock();
        }
    }
    public void lock() {
        if(isOn) {
            System.out.println("비밀번호를 입력해주세요.");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if(number == 123) {
                System.out.println("잠금을 푸셨습니다. 메인페이지로 이동합니다.");
                screenOn();
            } else {
                System.out.println("틀렸습니다. 핸드폰이 꺼집니다.");
                System.exit(0);
            }
        }
    }
    public void screenOn() {
            Scanner sc = new Scanner(System.in);
            System.out.println("==============핸드폰 실행중===========");
            System.out.println("1번 앱 실행하기");
            System.out.println("2번 앱 실행하기");
            System.out.println("3.휴대폰 끄기");
            int no = sc.nextInt();
            Person person = new Person();

            switch (no) {
                case 1 : person.app1();
                case 2 :
                    System.out.println("2번 앱은 아직 개발중입니다. 이전으로 돌아갑니다.");
                    screenOn();
                case 3 :
                    System.out.println("핸드폰을 끕니다.");
                    System.exit(0);
                    break;
            }
        }
        public void app1() {
            System.out.println("========= 어플 실행중 =======");
            Scanner sc = new Scanner(System.in);
            System.out.println("1.앱 종료");
            System.out.println("2.핸드폰 종료");
            int no = sc.nextInt();
            Person person = new Person();

            switch (no) {
                case 1 :
                    System.out.println("어플을 종료합니다. 홈 화면으로 이동합니다.");
                    screenOn();
                    break;
                case 2 :
                    System.out.println("핸드폰을 끕니다.");
                    System.exit(0);
                    break;


            }

        }
    }

