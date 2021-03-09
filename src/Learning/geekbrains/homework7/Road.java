package Learning.geekbrains.homework7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Road extends Stage {
    CyclicBarrier cb = new CyclicBarrier(4);
    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    @Override
    public void go(Car c)  {
        try {
            cb.await();
            System.out.println(c.getName() + " начал этап: " + description);

            Thread.sleep(length / c.getSpeed() * 1000);

            System.out.println(c.getName() + " закончил этап: " + description);


        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }


    }
}