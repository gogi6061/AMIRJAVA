package homework.HW0803;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PolishNotation {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        String s = new Scanner(System.in).nextLine();
        Scanner scan = new Scanner(s);
        String i;
        char[] digits = {'1','2','3','4','5','6','7','8','9','0'};


        while (scan.hasNext()) {
            try {
                i = scan.next();

                if (isDigit(i)) {
                    stack.push(Double.parseDouble(i));
                    System.out.println(stack);
                }
                if (stack.size() >= 2 & ("^×*/+-").contains(i)) {
                    Double a = stack.pop();
                    Double b = stack.pop();

                    switch (i) {
                        case "*" -> stack.push(a * b);
                        case "×" -> stack.push(a * b);
                        case "/" -> stack.push((b / a));
                        case "-" -> stack.push(a - b);
                        case "+" -> stack.push(a + b);
                        case "^" -> stack.push(Math.pow(b, a));

                    }

                }
            } catch (Exception ig) {
                ig.printStackTrace();
            }


        }
        System.out.println(stack);
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
