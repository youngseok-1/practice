package com.ohgiraffers.level05.basic.member.run;

import com.ohgiraffers.level05.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO md = new MemberDTO();

        System.out.println("id : " + md.getId());
        System.out.println("pwd : " + md.getPwd());
        System.out.println("name : " + md.getName());
        System.out.println("age : " + md.getAge());
        System.out.println("gender : " + md.getGender());
        System.out.println("phone : " + md.getPhone());
        System.out.println("email : " + md.getEmail());

        md.setId("user01");
        md.setPwd("pass01");
        md.setName("홍길동");
        md.setAge(20);
        md.setGender('M');
        md.setPhone("010-1234-5678");
        md.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + md.getId());
        System.out.println("변경 후 pwd : " + md.getPwd());
        System.out.println("변경 후 name : " + md.getName());
        System.out.println("변경 후 age : " + md.getAge());
        System.out.println("변경 후 gender : " + md.getGender());
        System.out.println("변경 후 phone : " + md.getPhone());
        System.out.println("변경 후 email : " + md.getEmail());

    }
}
