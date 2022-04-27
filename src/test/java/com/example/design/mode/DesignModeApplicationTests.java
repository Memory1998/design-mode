package com.example.design.mode;

import com.example.design.mode.factory.Shape;
import com.example.design.mode.factory.ShapeFactory;
import com.example.design.mode.factory.enums.ShapeTypeEnum;
import com.example.design.mode.strategy.Context;
import com.example.design.mode.strategy.Strategy;
import com.example.design.mode.strategy.impl.OperationAdd;
import com.example.design.mode.strategy.impl.OperationMultiply;
import com.example.design.mode.strategy.impl.OperationSubtract;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DesignModeApplicationTests {

    @Test
    void contextLoads() {
        log.info(">>>>>>>>>>>>");
    }

    @Test
    void strategyMode() {
        log.info(">>>>>>>>>>>>策略模式");
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

    /**
     *
     */
    @Test
    void factory() {

        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape(ShapeTypeEnum.CIRCLE.getType());

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape(ShapeTypeEnum.RECTANGLE.getType());

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape(ShapeTypeEnum.SQUARE.getType());

        //调用 Square 的 draw 方法
        shape3.draw();
    }

}
