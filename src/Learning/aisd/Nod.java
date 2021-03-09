package Learning.aisd;

import java.util.Scanner;

class Nod {
    public static void main(String[] args) {
        String[] numbers = new Scanner(System.in).nextLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        while (a * b != 0) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }

            // put your code here
        }

        if (b > 0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
