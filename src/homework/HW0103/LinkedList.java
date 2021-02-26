package homework.HW0103;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.*;
import java.util.Queue;
import java.util.stream.Stream;

public class LinkedList<T> implements Iterable<T> {
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private static class Node<T> {
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

    List<T> list = new ArrayList<>();

    class ListIterator implements Iterator<T> {

        int x = 0;


        @Override
        public boolean hasNext() {
            return x != list.size();
        }

        @Override
        public T next() {
            T im = list.get(x);
            x++;
            return im;

        }

    }


    T pop() {
        try {

            list.remove(list.get(0));
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, list.get(i + 1));

            }
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Стэк пустой. Возврат пустого узла");
        }
        return list.get(0);

    }

    T peek() {

        try {
            return list.get(0);
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Стэк пустой. Возврат пустого узла");
        }
        return (null);

    }

    void add(T elem) {
        list.add(elem);

    }

    T get(int i) {
        return list.get(i);

    }

    void remove(int i) {
        list.remove(i);
    }

    int count() {
        return list.size();

    }

}
