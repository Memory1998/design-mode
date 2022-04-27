package com.example.design.mode.factory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author breeze
 * @version 1.0
 * @createDate
 **/
@AllArgsConstructor
@Getter
public enum ShapeTypeEnum {


    CIRCLE("CIRCLE", "CIRCLE"),
    RECTANGLE("RECTANGLE", "RECTANGLE"),
    SQUARE("SQUARE", "SQUARE");

    private String type;

    public String desc;

}
