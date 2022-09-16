package com.test.innerclass;

/**
 * Created by pzh on 2022/9/6.
 */
public class InnerClassTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
    }
}
