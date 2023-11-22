package com.example.junitexample.model;

public class Square implements Shape{
    Integer side;

    public Square(Integer side) {
        this.side = side;
    }

    @Override
    public Long getArea() {
        return Math.round(side * side*1.0);
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }
}
