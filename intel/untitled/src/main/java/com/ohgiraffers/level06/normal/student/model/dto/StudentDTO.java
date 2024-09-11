package com.ohgiraffers.level06.normal.student.model.dto;

import java.util.Scanner;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;


    public StudentDTO() {}


    public void printInformation(int grade, int classroom, String name, double height, char gender) {
        System.out.println("학년 : " + grade);
        System.out.println("반 : " + classroom);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("성별 : " + gender);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;
    }

    public int getClassroom(){
        return classroom;
    }

    public void setClassroom() {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }






}
