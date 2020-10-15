/**
 * Copyright (C) 2017 The BEST Authors
 */
package com.huyang;

/**
 * a
 *
 * @author BG460559
 * @since a
 */
public class TestPrintStackTrace {
    public static void f() throws Exception{
        throw new Exception("出错了");
    }

    public static void g() throws Exception{
        f();
    }

    public static void main(String[] args) {
        try{
            g();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("=======================");
            for(StackTraceElement ele : e.getStackTrace()){
                System.out.println(ele);
            }
        }
    }
}
    