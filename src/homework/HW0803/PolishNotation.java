package homework.HW0803;

import java.util.Scanner;
import java.util.Stack;

public class PolishNotation {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        String s = "3 2 1 + * 3 /";
        Scanner scan = new Scanner(s);
        String i;


        while (scan.hasNext()) {
            try {
                i = scan.next();

                if ("1234567890".contains(i)) {
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
            }catch (Exception ig){

            }
//                try {
//                    if (stack.size() < 2 & ("*/+-").contains(i)) {
//                        String x = scan.next();
//
//                        while (!x.contains("1234567890")) {
//                            x = scan.next();
//                        }
//                        if (x.contains("1234567890")) {
//                            stack.push(Integer.parseInt(x));
//                        }
//
//                    }
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }


        }
        System.out.println(stack);
    }
}
