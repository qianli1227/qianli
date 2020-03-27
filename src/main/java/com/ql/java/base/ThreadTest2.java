package com.ql.java.base;

/**
 * 方式2实现Runnable接口的类
 * 1：创建一个实现了Runnable接口的类
 * 2：实现类去实现Runnable 中的抽象方法 run()方法
 * 3：创建实现类的对象
 * 4：将此对象作为参数 传递到Thread类的构造器中 创建 Thread类的对象
 * 5；通过Thread 的对象调用start
 */


class Method2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

}

public class ThreadTest2 {
    public static void main(String[] args) {
        Method2 method2 = new Method2();
        new Thread(method2).start();
    }
}
