package com.ql.java.base;
//方式一：继承thread
//6:yield():释放当前cpu的执行权
//7:join():在线程A中调用线程B的join方法，那么线程A进入阻塞状态，直到线程B完全执行完之后，线程A才结束阻塞状态
//8:stop():已过时，当执行此方法时候，强制结束当前线程
//9:sleep(long millitime):(子类重写的时候抛的异常不能比父类更大)让当前线程"睡眠"指定的miilitime毫秒，在指定的millitime 毫秒时间内，当前线程是阻塞状态
//10：isAlive():判断当前线程是否还存活

//线程的优先级

/** 高优先级的线程高概率被CPU执行
 * 1:public final static int MIN_PRIORITY = 1;
 * 2:public final static int NORM_PRIORITY=5;---默认的优先级
 * 3:public final static int MAX_PRIORITY=10;
 * setPriority
 *
 *
 */

//方式二：

/**
 * 什么
 */
public class ThreadTest {

    public static void main(String[] args) {

        method1 method1 = new method1("线程方式-1");
        method1.setPriority(8);
        Thread.currentThread().setPriority(1);
        method1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i+"|"+Thread.currentThread().getPriority());

//            if (i == 20) {
//                try {
//                    method1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(method1.isAlive());

    }

}

class method1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(method1.currentThread().getName() + ":" + i+"|"+method1.currentThread().getPriority());
            }
//            if (i % 20 == 0) {
//                //释放当前CPU的执行权
//                this.yield();
//            }
        }

    }

    method1(String name) {
        super(name);
    }
}
