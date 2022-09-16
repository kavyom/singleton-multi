package com.test.lanhan;

import com.test.lanhan.unsafe.Singleton;

/**
 * Created by pzh on 2022/9/6.
 */
public class LanhanTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
    }
}
