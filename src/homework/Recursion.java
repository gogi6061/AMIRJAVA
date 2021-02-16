package homework;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(akkFunc(1, 4));


    }

    static int factNum(int n) {
        int z = n;
        if (z > 1) {
            z *= factNum(n - 1);
        }
        ;
        return z;

    }

    static void outputAtoB(int a, int b) {
        int dop = a;
        System.out.print(a + " ");
        if (dop < b) {
            outputAtoB(a + 1, b);
        }
    }

    static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);


    }

    static int akkFunc(int m, int n) {
        int j = 0;
        if (m == 0) {
            j = n + 1;
        }
        if (m > 0 & n == 0) {
            j = akkFunc(m - 1, 1);
        } else if (m > 0 & n > 0) {


            j = akkFunc(m - 1, akkFunc(m, n - 1));
        }
        return j;


    }


}
