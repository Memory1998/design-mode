package com.example.design.mode.strategy.impl;

import com.example.design.mode.strategy.Strategy;

/**
 * @author breeze
 * @version 1.0
 * @createDate
 **/
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
