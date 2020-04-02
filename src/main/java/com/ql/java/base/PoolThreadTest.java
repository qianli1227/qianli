package com.ql.java.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolThreadTest {
    public static void main(String[] args) {
        //1：提供指定数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //2:执行线程的操作，提供一个实现Runable或者 callable接口的实现类的对象

        executorService.execute(new NumberThread());//实现runable的实现类对象
//        executorService.submit()//实现callabe接口的实现类对象
        //3。关闭线程池
        executorService.shutdown();
    }
}


class NumberThread implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}