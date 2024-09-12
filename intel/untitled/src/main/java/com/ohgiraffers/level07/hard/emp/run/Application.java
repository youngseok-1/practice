package com.ohgiraffers.level07.hard.emp.run;

import com.ohgiraffers.level07.hard.emp.model.dto.EmployeeVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeVO ev = new EmployeeVO();

        // 스캐너로 직원 정보 입력받기
        System.out.print("직원 번호: ");
        ev.setNumber(sc.nextInt());
        sc.nextLine();  // 개행 문자 처리 이걸 쓰면 줄바꿈이된다 엔터라고 생각하면 편하다. // 안쓰면 출력이 이렇게 된다.직원 번호: 200
//이름: 부서:

        System.out.print("이름: ");
        ev.setName(sc.nextLine());

        System.out.print("부서: ");
        ev.setDept(sc.nextLine());

        System.out.print("직책: ");
        ev.setJob(sc.nextLine());

        System.out.print("나이: ");
        ev.setAge(sc.nextInt());
        sc.nextLine();  // 개행 문자 처리

        System.out.print("성별: ");
        ev.setGender(sc.nextLine().charAt(0));

        System.out.print("연봉: ");
        ev.setSalary(sc.nextInt());

        System.out.print("보너스 포인트: ");
        ev.setBonusPoint(sc.nextDouble());
        sc.nextLine(); // 개행 문자 처리

        System.out.print("전화번호: ");
        ev.setPhone(sc.nextLine());

        System.out.print("주소: ");
        ev.setAddress(sc.nextLine());


        System.out.println("===== 입력된 직원 정보 =====");
        System.out.println("직원 번호: " + ev.getNumber());
        System.out.println("이름: " + ev.getName());
        System.out.println("부서: " + ev.getDept());
        System.out.println("직책: " + ev.getJob());
        System.out.println("나이: " + ev.getAge());
        System.out.println("성별: " + ev.getGender());
        System.out.println("연봉: " + ev.getSalary());
        System.out.println("보너스 포인트: " + ev.getBonusPoint());
        System.out.println("전화번호: " + ev.getPhone());
        System.out.println("주소: " + ev.getAddress());
    }
}