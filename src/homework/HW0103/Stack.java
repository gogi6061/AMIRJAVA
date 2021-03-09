package homework.HW0103;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> implements Iterable<T> {
    List<T> stack = new ArrayList<>();
    Iterator<T> iter = stack.iterator();


    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    class StackIterator implements Iterator<T> {
        int x = 0;


        @Override
        public boolean hasNext() {
            return x != stack.size();
        }

        @Override
        public T next() {
            T im = stack.get(x);
            x++;
            return im;

        }


    }


    static class Node<T> {
        private T obj;

        private Node(T obj1) {
            obj = obj1;
        }

        private Node() {
        }

        public T getObj() {
            return obj;
        }
    }

    void push(T item) {
        stack.add(item);

    }

    T pop() {
        Node<T> tmp = new Node<>();
        try {

            stack.remove(stack.get(0));
            for (int i = 0; i < stack.size() - 1; i++) {
                stack.set(i, stack.get(i + 1));

            }
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Стэк пустой. Возврат пустого узла");
        }
        return stack.get(0);

    }

    T peek() {

        try {
            return stack.get(stack.size() - 1);
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Стэк пустой. Возврат пустого узла");
        }
        return (null);

    }
}
