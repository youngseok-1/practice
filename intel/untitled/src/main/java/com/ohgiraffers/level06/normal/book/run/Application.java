package com.ohgiraffers.level06.normal.book.run;

import com.ohgiraffers.level06.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO bd = new BookDTO();
        System.out.println(bd.getTitle() + " , " + bd.getPublisher() + " , " + bd.getAuthor() + " , " + bd.getPrice() + " , " + bd.getDiscountRate());

        BookDTO bd2 = new BookDTO("자바의 정석" , "도우출판" , "남궁성");
        System.out.println(bd2.getTitle() + " , " + bd2.getPublisher() + " , " + bd2.getAuthor() + " , " + bd.getPrice() + " , " + bd.getDiscountRate());

        BookDTO bd3 = new BookDTO("홍길동전", "활빈당", "허균", 500000 ,0.5);
        System.out.println(bd3.getTitle() + " , " + bd3.getPublisher() + " , " + bd3.getAuthor() + " , " + bd3.getPrice() + " , " + bd3.getDiscountRate());
    }
}
