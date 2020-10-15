/**
 * Copyright (C) 2017 The BEST Authors
 */
package com.huyang.designmode.flyweight;

import java.util.Objects;

/**
 * @author BG460559
 * @since
 */
public class Client {
    public static void main(String[] args) {
        IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getInstance();

        IgoChessman blackChess1 = igoChessmanFactory.getIgoChessman("b");
        IgoChessman blackChess2 = igoChessmanFactory.getIgoChessman("b");
        IgoChessman blackChess3 = igoChessmanFactory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同："+Objects.equals(blackChess1,blackChess2));

        IgoChessman whiteChess1 = igoChessmanFactory.getIgoChessman("w");
        IgoChessman whiteChess2 = igoChessmanFactory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同："+Objects.equals(whiteChess1,whiteChess2));

        blackChess1.display(new Coordinates(1,2));
        blackChess2.display(new Coordinates(3,4));
        blackChess3.display(new Coordinates(1,3));
        whiteChess1.display(new Coordinates(2,5));
        whiteChess2.display(new Coordinates(2,4));
    }
}
    