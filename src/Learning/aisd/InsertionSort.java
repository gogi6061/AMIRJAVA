package Learning.aisd;

import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> massiv = CreateArray.createShuffledArray.apply(20);
        massiv.add(20);
        massiv.add(12);
        massiv.forEach(System.out::println);
        System.out.println("---");
        insertionSort(massiv);
        noDups(massiv).forEach(System.out::println);


    }

    public static List<Integer> insertionSort(List<Integer> list) {
        int in, out;
        for (out = 1; out < list.size(); out++) {
            int tmp = list.get(out);
            in = out;
            while (in > 0 && list.get(in - 1) >= tmp) {
                list.set(in, list.get(in - 1));
                --in;
            }
            list.set(in, tmp);

        }
        return list;

    }

    public static List<Integer> noDups(List<Integer> list) {
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.set(i+1,list.get(i+2));



            }

        }


        return list;
    }


}
