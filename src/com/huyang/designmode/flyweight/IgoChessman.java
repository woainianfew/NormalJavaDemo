/**
 * Copyright (C) 2017 The BEST Authors
 */
package com.huyang.designmode.flyweight;

/**
 * aa
 *
 * @author BG460559
 * @since
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("棋子颜色："+getColor()+"，棋子位置：【"+coordinates.getX()+","+coordinates.getY()+"】");
    }
}
    