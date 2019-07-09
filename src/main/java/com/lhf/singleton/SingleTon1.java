package com.lhf.singleton;

/**
 * 饿汉式单例
 * 在类加载在时就已经实例化了对象
 * @author liuhongfei
 * @since v1.0.0
 **/
public class SingleTon1 {
    private static SingleTon1 singleTon1 = new SingleTon1();
    private SingleTon1(){
        System.out.println("实例化时机。。。");
    }

    public static SingleTon1 getInstance(){
        return SingleTon1.singleTon1;
    }

    public static void main(String[] args) {
        System.out.println("---");
        SingleTon1 test1 = SingleTon1.getInstance();
        SingleTon1 test2 = SingleTon1.getInstance();
        System.out.println(test1==test2);
    }
}
