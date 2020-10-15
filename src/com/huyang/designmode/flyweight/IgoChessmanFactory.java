/**
 * Copyright (C) 2017 The BEST Authors
 */
package com.huyang.designmode.flyweight;

import com.huyang.designmode.flyweight.impl.BlackIgoChessman;
import com.huyang.designmode.flyweight.impl.WhiteIgoChessman;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BG460559
 * @since
 */
public class IgoChessmanFactory {

    private static final IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Map map;

    private IgoChessmanFactory() {
        map = new HashMap();
        IgoChessman blackChess = new BlackIgoChessman();
        IgoChessman whiteChess = new WhiteIgoChessman();
        map.put("b",blackChess);
        map.put("w",whiteChess);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public IgoChessman getIgoChessman(String color){
        IgoChessman chess = (IgoChessman) map.get(color);
        return chess;
    }
}
    