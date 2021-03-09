package Learning.aisd;

import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {

        List<Integer> massiv = CreateArray.createShuffledArray.apply(20);
        massiv.forEach(System.out::println);
        System.out.println("---");
        selectionSort(massiv).forEach(System.out::println);

    }

    public static List<Integer> selectionSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    int tmp = min;
                    min = list.get(j);
                    list.set(i, min);
                    list.set(j, tmp);


                }
            }

        }

        return list;
    }
}

