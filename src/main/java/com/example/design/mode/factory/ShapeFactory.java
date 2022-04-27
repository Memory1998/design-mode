package com.example.design.mode.factory;

import com.example.design.mode.factory.enums.ShapeTypeEnum;
import com.example.design.mode.factory.impl.Circle;
import com.example.design.mode.factory.impl.Rectangle;
import com.example.design.mode.factory.impl.Square;

/**
 * @author breeze
 * @version 1.0
 * @createDate
 **/
public class ShapeFactory {

    /**
     *
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (null == shapeType ){
            return null;
        }

        if(shapeType.equalsIgnoreCase(ShapeTypeEnum.CIRCLE.getType())){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(ShapeTypeEnum.RECTANGLE.getType())){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase(ShapeTypeEnum.SQUARE.getType())){
            return new Square();
        }
        return null;
    }

}
