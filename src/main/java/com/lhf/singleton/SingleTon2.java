package com.lhf.singleton;

/**
 * 懒汉式单例
 * 有bug。。多线程存在bug
 * @author liuhongfei
 * @since v1.0.0
 **/
public class SingleTon2 {

    private static SingleTon2 INSTANCE = null;

    private SingleTon2(){}

    public static SingleTon2 getInstance(){
        if (SingleTon2.INSTANCE==null){
            SingleTon2.INSTANCE = new SingleTon2();
        }
        return SingleTon2.INSTANCE;
    }
}
