package Learning.geekbrains.homework5;

import java.util.*;

public class TelephoneDirectory {
    private HashMap<String, HashSet<Integer>> s1 = new HashMap<>();

    public void add(String name, Integer num) {
        if (!s1.containsKey(name)) {
            s1.put(name, new HashSet<>());
            s1.get(name).add(num);

        } else {
            s1.get(name).add(num);
        }

    }

    public HashMap getDirectory() {
        return s1;
    }


    public static void main(String[] args) {
        TelephoneDirectory t1 = new TelephoneDirectory();
        t1.add("amir", 99999);
        t1.add("amir", 998888);
        t1.add("amir", 998888888);
        t1.add("arslan", 998888888);
        t1.add("arslan", 99888333);
        System.out.println(t1.getDirectory().get("arslan") + " " + t1.getDirectory().get("amir"));


    }

}
