/**
 * Copyright (C) 2017 The BEST Authors
 */
package com.huyang;

/**
 * a
 *
 * @author BG460559
 * @since
 */
public class TestPrintStackTrace3 {
    public static void f() throws Exception{
        throw new Exception("出问题啦！");
    }

    public static void g() throws Exception{
        try {
            f();
        }catch(Exception e){
            e.printStackTrace();
            //不要忘了强制类型转换
            throw (Exception)e.fillInStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            g();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
    