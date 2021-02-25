package Learning.aisd;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> masssiv = CreateArray.createArray.apply(20);

        masssiv.forEach(System.out::println);
        System.out.println(binarySearch(masssiv, 199999));


    }

    public static boolean binarySearch(List<Integer> massiv, int chislo) {
        int lowerBound = 0;
        int upperBound = massiv.size() - 1;

        while (true) {
            int middle = (lowerBound + upperBound) / 2;
            if (chislo == massiv.get(middle)) return true;
            else if (lowerBound > upperBound) return false;
            else if (chislo > massiv.get(middle)) {
                lowerBound = middle + 1;


            } else if (chislo < massiv.get(middle)) {
                upperBound = middle - 1;


            }
        }


    }
}
