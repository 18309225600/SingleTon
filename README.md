# SingleTon
##单利模式示例代码

1.饿汉式：类加载时，实例化。（虽然没有用，对象就有了）

2.懒汉式：第一次使用时实例化对象（仅支持单线程）

3.双重锁：支持多线程

4.静态内部类：支持多线程

5.枚举单利：支持多线程