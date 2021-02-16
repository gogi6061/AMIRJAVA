package Learning.other;

import java.io.IOException;
import java.lang.*;
import java.net.*;

public class Threads {
    public static String hello = "hello";
    public static Integer nums = 0;

    public static void inc(){
        nums++;
    }

    public static void dec(){
        nums--;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods methods = new ThreadMethods();
        Thread t3 = new Thread(methods::method1);


//        Thread t1 = new Thread(methods::method1);
//        Thread t2 = new Thread(methods::method2);
//
//        t1.start();
//
//        t2.start();
//
//
//        System.out.println("end "+nums);


    }
}

class ThreadMethods {



    public synchronized void method1() {
        System.out.println("m1-start");
        synchronized (Threads.nums) {


            for (int i = 0; i < 100; i++) {
                Threads.inc();
                try {
                    Thread.sleep(10);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


            System.out.println("m1-end");
        }
    }


    public synchronized void method2()  {
        System.out.println("m2-start");
        synchronized (Threads.nums) {

            for (int i = 0; i < 100; i++) {
                Threads.dec();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            System.out.println("m2-end");
        }
    }




}



