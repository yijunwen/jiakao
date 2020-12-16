package com.yj.jk;

/**
 * @Author: wen.yijun
 * @Description:
 * @Date: 2020/12/14
 **/
public class TestDemo {
    public static void main(String[] args)  {
        String a = null;
        try {
            throw new Exception("java.lang.NullPointerException");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
