package com.test.ehan;

/**
 * Created by pzh on 2022/9/6.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}

    public static Singleton getInstance() {
        return instance;
    }
}
