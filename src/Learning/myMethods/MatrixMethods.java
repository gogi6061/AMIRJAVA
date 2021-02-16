package Learning.myMethods;

import java.util.Scanner;

public class MatrixMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int x = scan.nextInt();
        int y = scan.nextInt();
        Integer[][] matrix = MatrixMethods.matrixInit(x, y);
        matrixOut(matrix);
        System.out.println(proverkaN(matrix));


    }

    public static <T> void matrixOut(T[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            MassivMethods.<T>massOut(matrix[i]);
            System.out.println(" ");


        }


    }

    static boolean proverkaN(Integer[][] matrix) {
        boolean flag = false;
        int count = 0;
        int i = matrix.length / 2;
        if (matrix.length % 2 != 0) {
            return false;
        }
        for (int j = 0; j < i * 2; j++) {
            if (matrix[j][j] % 2 == 0) {
                count++;

            }
        }
        if (count == i) {
            flag = true;
        }
        return flag;

    }


  public  static <T> Integer[][] matrixInit(int strok, int stolb) {
        Integer[][] mass = new Integer[strok][stolb];
        for (int i = 0; i < strok; i++) {
            for (int j = 0; j < stolb; j++) {
                mass[i][j] = (int) (Math.random() * 10);

            }
        }
        return mass;

    }

    static void sumMatrix(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                m1[i][j] += m2[i][j];

            }
        }



    }

    static void transPon(int[][] m1, int s1) {
        int[][] newMatrix = new int[s1][s1];
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s1; j++) {
                newMatrix[i][j] = m1[j][i];

            }
        }
        for (int i = 0; i < s1; i++) {
            for (int a : m1[i]) {
                System.out.print(a + " ");
            }
            System.out.println();
        }


    }

    static void deter(int[][] m1) {
        int m1Det = 0;
        if (m1.length == 2) {
            m1Det = m1[0][0] * m1[1][1] - m1[0][1] * m1[1][0];

        }
        if (m1.length == 3) {
            m1Det = (m1[0][0] * m1[1][1] * m1[2][2] + m1[0][1] * m1[1][2] * m1[2][0] + m1[1][0] * m1[2][1] * m1[0][2]) - (m1[0][2] * m1[1][1] * m1[2][0] + m1[2][1] * m1[1][2] * m1[0][0] + m1[1][0] * m1[0][1] * m1[2][2]);
        }
        System.out.println(m1Det);
    }


}







