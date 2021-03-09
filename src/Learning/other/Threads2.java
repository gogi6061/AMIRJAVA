package Learning.other;

import java.util.Scanner;

public class Threads2 {


    public static void main(String[] args) throws InterruptedException {
        ThreadClass t = new ThreadClass();
        Thread t1;
        Thread t2;

        synchronized (t) {

            t1 = new Thread(() -> {
                for (int i = 0; i < 100_000_000; i++) {
                    t.a++;
                }
            });
        }
        synchronized (t) {

            t2 = new Thread(() -> {

                for (int i = 0; i < 100_000_000; i++) {
                    t.a--;

                }
            });
        }


        t1.start();
        t2.start();
        t2.join();


        System.out.println(t.getA());
    }
}


