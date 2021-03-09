package Learning.geekbrains.homework4;

import java.util.*;

public class Box<T extends Fruit> {
    private ArrayList<T> arrayFriuts = new ArrayList<>();

    public Box(T... fruits) {
        arrayFriuts.addAll(Arrays.asList(fruits));
    }

    public T getFruit(int num) {
        return arrayFriuts.get(num);
    }

    public void setArrayFriuts(T... fruits) {
        arrayFriuts.addAll(Arrays.asList(fruits));
    }

    public ArrayList<T> getArray() {
        return arrayFriuts;
    }

    public float getAllWeight() {
        float weight = 0.0f;
        for (int i = 0; i < this.getArray().size(); i++) {
            weight += this.getFruit(i).getWeight();

        }
        return weight;
    }

    public boolean compare(Box<?> s) {
        return this.getAllWeight() == s.getAllWeight();
    }

    public void transfer(Box<T> s) {
        s.getArray().addAll(this.getArray());
        this.getArray().clear();
    }


    public static void main(String[] args) {
        Box<Apple> boxWithApples = new Box<>();
        boxWithApples.setArrayFriuts(new Apple(77), new Apple(88));
        Box<Orange> boxWithOranges = new Box<>();
        boxWithOranges.setArrayFriuts(new Orange(77), new Orange(88));
        Box<Apple> anthBoxWithApples = new Box<>(new Apple(66), new Apple(66));


        System.out.printf("w1: %.2f\nw2: %.2f", boxWithApples.getAllWeight(), boxWithOranges.getAllWeight());
        System.out.println("\n" + boxWithApples.compare(boxWithOranges));
        boxWithApples.transfer(anthBoxWithApples);
        System.out.println(anthBoxWithApples.getFruit(2).getWeight());
    }


}
