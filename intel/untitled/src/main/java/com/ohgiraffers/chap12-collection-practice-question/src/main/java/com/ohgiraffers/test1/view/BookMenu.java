package com.ohgiraffers.test1.view;

import com.ohgiraffers.test1.controller.BookManager;
import com.ohgiraffers.test1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void displayMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // 엔터 (개행)

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2 :
                    System.out.println("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순)");
                    int num = sc.nextInt();
                    if (num == 1) {
                        System.out.println("오름차순을 진행합니다.");
                    } else if (num == 2) {
                        System.out.println("내림차순을 진행합니다.");
                    } else {
                        System.out.println("번호를 잘못입력하였습니다.");
                    }
                    break;
                case 3 :
                   deleteBook();
                   break;
                case 4 :
                    System.out.println("검색하고 싶은 도서 제목을 적어주세요.");
                case 5 :
                    displayAll();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            System.out.println(); // 엔터 (개행)
        }
    }

    private void addBook() {
        System.out.println("=== 새 도서 추가 ===");
        System.out.println("도서 번호는 1부터 입력됩니다.");
        System.out.print("도서 카테고리(1:인문, 2:자연과학, 3:의료, 4:기타): ");
        int category = sc.nextInt();
        sc.nextLine(); // 엔터 (개행)
        System.out.print("도서 제목: ");
        String title = sc.nextLine();
        System.out.print("도서 저자: ");
        String author = sc.nextLine();

        BookDTO newBook = new BookDTO(category, title, author);
        bm.addBook(newBook);
    }
    public void deleteBook() {
        System.out.print("삭제할 도서 번호: ");
        int bookNo = sc.nextInt();

        int result = bm.deleteBook(bookNo);

        if (result == 0) {
            System.out.println("성공적으로 삭제되었습니다.");
        } else {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        }
    }
    private void displayAll() {
        if (bm.getBookList().isEmpty()) {
            System.out.println("등록된 책이 없습니다.");
        } else {
            for (BookDTO book : bm.getBookList()) {
                System.out.println(book);
            }
        }
    }
}

