package homework.HW0103;

import java.util.Iterator;

public class StackRunTime {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Iterator<Integer> iter =  stack.iterator();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());

    }
}
