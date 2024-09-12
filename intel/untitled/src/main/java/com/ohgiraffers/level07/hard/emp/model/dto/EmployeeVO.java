package com.ohgiraffers.level07.hard.emp.model.dto;

public class EmployeeVO {

    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    // 기본 생성자 추가
    public EmployeeVO() {}

    // 필드 초기화 생성자
    public EmployeeVO(int number, String name, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    // Getter와 Setter

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}