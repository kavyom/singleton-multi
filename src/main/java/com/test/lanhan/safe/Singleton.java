package com.test.lanhan.safe;

/**
 * Created by pzh on 2022/9/6.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
