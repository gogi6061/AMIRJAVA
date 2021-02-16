package Learning.geekbrains.homework5;

import java.util.*;

public class Words {

    static public int getNum(ArrayList<String> s, String word) {
        int count = 0;

        for (String value : s) {
            if (word.equals(value)) {
                count++;
            }


        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("dsad", "sadas", "aaaa", "asdasdad", "aaa", "aaa", "aaa"));
        Iterator<String> iter = str.iterator();

        Set<String> set = new HashSet<>(str);
        System.out.println(set);
        System.out.println(getNum(str, "aaa"));


    }
}
