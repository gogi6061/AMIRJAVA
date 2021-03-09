package homework.HW0803;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class CheckString {


    public static void main(String[] args) {
        try {
            Stack<Character> stack = new Stack<>();
            //String string = "{()}{((}";
            char[] charString = new Scanner(System.in).nextLine().toCharArray();

            for (char o : charString) {
                if (o == '{' || o == '[' || o == '(') {
                    stack.push(o);
                }


                if (o == '}' || o == ']' || o == ')') {
                    stack.pop();
                }
            }


            if (stack.size() != 0) {
                System.out.println("Строка неправильная");
            } else {
                System.out.println("Строка правильная");
            }

        } catch (EmptyStackException exc) {
            System.out.println("Строка неправильная");
        }


    }
}
