package com.example.junitexample.model;

public class Circle implements Shape{

    Integer halfDiameter;

    public Circle(Integer halfDiameter) {
        this.halfDiameter = halfDiameter;
    }

    @Override
    public Long getArea() {
        return Math.round(Math.PI *Math.pow(getHalfDiameter(),2));
    }

    public Integer getHalfDiameter() {
        return halfDiameter;
    }

    public void setHalfDiameter(Integer halfDiameter) {
        this.halfDiameter =halfDiameter;
    }
}
