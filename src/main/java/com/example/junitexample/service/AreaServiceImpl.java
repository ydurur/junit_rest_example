package com.example.junitexample.service;

import com.example.junitexample.model.Circle;
import com.example.junitexample.model.Rectangle;
import com.example.junitexample.model.Shape;
import com.example.junitexample.model.Square;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService{

    @Override
    public String getAreaResult() {
        Shape shape = new Circle(4);
        StringBuilder areaStr=new StringBuilder("Circle area is: ").append( shape.getArea());

        shape = new Square(5);
        areaStr.append(" Square area is ").append(shape.getArea());

        shape = new Rectangle(5,2);
        areaStr.append(" Reactangle area is :").append(shape.getArea());

        return areaStr.toString();

    }
}
