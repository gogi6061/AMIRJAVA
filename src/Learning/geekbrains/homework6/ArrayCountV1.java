package Learning.geekbrains.homework6;

import java.util.Arrays;

public class ArrayCountV1 {
    public static void main(String[] args) {
        final int SIZE  = 10000000;
        float[] array = new float[SIZE];
        Arrays.fill(array,1.0f);

        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5)* Math.cos(0.2f + i / 5)* Math.cos(0.4f + i / 2));

        }
        System.out.println(System.currentTimeMillis()-a);

    }
}
