package Learning.geekbrains.homework6;

import javax.print.attribute.standard.Sides;
import java.util.Arrays;

public class ArrayCountV2 {
    static final int SIZE = 10000000;
    static float[] array = new float[SIZE];

    public static void main(String[] args) throws InterruptedException {
        long a = System.currentTimeMillis();

        Arrays.fill(array, 1.0f);


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < SIZE / 2; i++) {
                array[i] = array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));


            }
        });
        ;


        Thread t2 = new Thread(() -> {
            for (int i = SIZE / 2; i < SIZE; i++) {
                array[i] = array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));


            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(System.currentTimeMillis() - a);


    }
}
