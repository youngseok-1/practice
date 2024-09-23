package com.ohgiraffers.test1.controller;

import com.ohgiraffers.test1.model.dto.BookDTO;
import com.ohgiraffers.test1.sort.AscCategory;
import com.ohgiraffers.test1.sort.DescCategory;

import java.util.ArrayList;
import java.util.Collections;
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
        return -1; // 도서를 찾지 못하면 -1을 반환
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

    // 오름차순 또는 내림차순으로 정렬된 리스트 반환
    public List<BookDTO> sortedBookList(int select) {
        List<BookDTO> sortedList = new ArrayList<>(bookList); // 기존 리스트 복사

        // select 값에 따라 정렬 방식 선택
        if (select == 1) {
            Collections.sort(sortedList, new AscCategory());
            System.out.println("오름차순으로 정렬되었습니다.");
        } else if (select == 2) {
            Collections.sort(sortedList, new DescCategory());
            System.out.println("내림차순으로 정렬되었습니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        return sortedList;
    }
    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i; // 일치하는 도서의 인덱스를 반환
            }
        }
        return -1; // 도서명이 일치하지 않으면 -1 반환
    }
}