package com.ohgiraffers.level06.normal.book.model.dto;

import java.awt.print.Book;

public class BookDTO {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {}

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher() {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate() {
        this.discountRate = discountRate;
    }

    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

}
