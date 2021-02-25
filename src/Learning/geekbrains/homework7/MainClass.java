package Learning.geekbrains.homework7;

import java.util.concurrent.*;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static CountDownLatch cd2 = new CountDownLatch(4);


    public static void main(String[] args) throws Exception {
        CountDownLatch cd = new CountDownLatch(4);
        CyclicBarrier cb = new CyclicBarrier(4);


        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }


        for (int i = 0; i < CARS_COUNT; i++) {

            final int w = i;
            new Thread(() -> {
                cars[w].run();
                cd.countDown();


            }).start();


        }
        cd2.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        cd.await();


        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}