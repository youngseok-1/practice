package com.ohgiraffers.test1.controller;

import com.ohgiraffers.test1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<BookDTO> bookList = new ArrayList<>();
    private int bookNumber = 1; // 도서 번호 1부터 시작

    public BookManager() {}

    public void addBook(BookDTO book) {
        // 도서 번호 1번부터 추가
        book.setbNo(bookNumber++);
        bookList.add(book);
        System.out.println("도서가 추가되었습니다: " + book);
    }

    public int searchBook(int bookNumber) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getbNo() == bookNumber) {
                return i; // 도서를 찾으면 해당 인덱스를 반환
            }
        }
        return -1; // 도서를 찾지 못하면 -1을 반환ㅓㅓㅓㅓ
    }

    public int deleteBook(int bookNumber) {
        int index = searchBook(bookNumber);

        if (index != -1) {
            bookList.remove(index);
            return 0; // 성공적으로 삭제
        } else {
            return 1; // 도서가 존재하지 않음
        }
    }

    public List<BookDTO> getBookList() {
        return bookList;
    }
}