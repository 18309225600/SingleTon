package com.lhf.singleton;

/**
 * 枚举单例模式
 *
 * 枚举在java中与普通类一样，都能拥有字段与方法，而且枚举实例创建是线程安全的，在任何情况下，它都是一个单例。我们可直接以SingleTon.INSTANCE
 * @author liuhongfei
 * @since v1.0.0
 **/
public enum SingleTon5 {

    INSTANCE;
}
