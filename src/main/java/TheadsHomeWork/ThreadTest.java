package TheadsHomeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThreadTest {
    static long k = 1L;

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

    }

    static long factorial(int start, int end) {
        long k = 1;
        for (int i = start; i < end + 1; i++) {
            k *= i;
        }
        return k;

    }
    //method1(number of fact)
    //sout(k) for answer
    static void method1(int chislo) throws InterruptedException {

        System.out.println("t1  start");
        Thread t1 = new Thread(() -> {
            k *= factorial(1, 5);
        });
        t1.start();
        t1.join();
        System.out.println("t1  end");
        Thread.sleep(1500);

        if (chislo >= 6 && chislo < 12) {
            System.out.println("t2  start");
            Thread t2 = new Thread(() -> {
                k *= factorial(6, chislo);
            });
            t2.start();
            t2.join();
            System.out.println("t2  end");
            Thread.sleep(1500);

        }

        if (chislo >= 13 && chislo < 16) {
            System.out.println("t3  start");
            Thread t3 = new Thread(() -> {
                k *= factorial(12, chislo);
            });
            t3.start();
            t3.join();
            System.out.println("t3 end");
            Thread.sleep(1500);
        }

        if (chislo >= 17 && chislo < 21) {
            System.out.println("t4  start");
            Thread t4 = new Thread(() -> {
                k *= factorial(16, chislo);
            });
            t4.start();
            t4.join();
            System.out.println("t4  end");
            Thread.sleep(1500);
        }

    }

    static void method2(File file) throws FileNotFoundException, InterruptedException {
        Scanner scan = new Scanner(new FileReader(file));
        List<String> chet = new ArrayList<>();
        List<String> nechet = new ArrayList<>();

        List<String> strings = scan.tokens()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        Thread t1 = new Thread(() -> {
            strings.stream().filter(x -> x.chars().distinct().count() % 2 == 0).forEach(x -> {
                chet.add(x);
                System.out.println(Thread.currentThread().getName() + " add chet");
            });

        });


        Thread t2 = new Thread(() -> {
            strings.stream().filter(x -> x.chars().distinct().count() % 2 != 0).forEach(x -> {
                nechet.add(x);
                System.out.println(Thread.currentThread().getName() + " add nechet");
            });

        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }
}
