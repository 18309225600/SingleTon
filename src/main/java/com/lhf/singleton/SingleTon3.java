package com.lhf.singleton;

/**
 * 饿汉式双重锁(Double check lock)
 * 如果不加volatile这种情况可能存在bug。。可能出现DCL失效，因为JVM存在乱序执行功能
 *
 * 乱序执行功能：（INSTANCE = new SingleTon3(); 这个过程在内存中分为三个步骤）
 *      1.对内开辟内存空间
 *      2.在堆内实例化SingleTon3的各个参数
 *      3.把对象指向堆内存空间
 *      可能出现在2没有完成的情况下先完成了3这样如果切换了线程，那么使用这个对象就会存在异常。（volatile关键字规避了这一点）
 * @author liuhongfei
 * @since v1.0.0
 **/
public class SingleTon3 {

    private static volatile SingleTon3 INSTANCE = null;

    private SingleTon3(){}

    public static SingleTon3 getInstance(){
        if (INSTANCE==null){
            synchronized (SingleTon3.class){
                if (INSTANCE==null){
                    INSTANCE = new SingleTon3();
                }
            }
        }
        return INSTANCE;
    }
}
