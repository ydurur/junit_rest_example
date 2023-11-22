package com.example.junitexample.model;

public class Rectangle implements Shape {
    Integer witdh;
    Integer heigth;

    public Rectangle(Integer witdh, Integer heigth) {
        this.witdh = witdh;
        this.heigth = heigth;
    }

    @Override
    public Long getArea() {
        return Math.round(witdh * heigth * 1.0);
    }

    public Integer getWitdh() {
        return witdh;
    }

    public void setWitdh(Integer witdh) {
        this.witdh = witdh;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }
}
