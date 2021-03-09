package Learning.aisd;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> massiv = CreateArray.createShuffledArray.apply(20);
        massiv.forEach(System.out::println);
        System.out.println("---");

        bubbleSort(massiv).forEach(System.out::println);


    }

    public static List<Integer> bubbleSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size()-2 ;j > -1; j--) {
                if(list.get(j) >= list.get(j+1)){
                    int tmp = list.get(j);
                    list.set(j,j+1);
                    list.set(j+1,tmp);
                }
            }

        }


        return list;
    }

}
