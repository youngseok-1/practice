package com.ohgiraffers.test1.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 카테고리 번호를 카테고리 이름으로 변환하는 메소드
    private String getCategoryName() {
        String categoryName;
        switch (this.category) {
            case 1:
                categoryName = "인문";
                break;
            case 2:
                categoryName = "자연과학";
                break;
            case 3:
                categoryName = "의료";
                break;
            case 4:
                categoryName = "기타";
                break;
            default:
                categoryName = "알 수 없음";
                break;
        }
        return categoryName;
    }

    @Override
    public String toString() {
        return "등록된 책의 정보 " +
                "도서 번호 = " + bNo +
                " 도서 제목 = " + title + '\'' +
                " 도서 장르 = " + getCategoryName() + '\'' +
                " 도서 저자 = " + author + '\'';
    }
}