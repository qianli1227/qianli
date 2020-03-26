package com.ql.java.base;

public class ThreadTest {


    public static void main(String[] args){

        method1 method1=new method1();
        method1.start();
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }


}
class method1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2==0){
                Thread.currentThread().setName("线程方式1");
                System.out.println(method1.currentThread().getName()+":"+i);
            }
        }
    }
}




