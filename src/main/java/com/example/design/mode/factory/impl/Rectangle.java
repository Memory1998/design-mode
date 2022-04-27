package com.example.design.mode.factory.impl;

import com.example.design.mode.factory.Shape;

/**
 * @author breeze
 * @version 1.0
 * @createDate
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
