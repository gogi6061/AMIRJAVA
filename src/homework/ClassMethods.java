package homework;

public class ClassMethods {


    static int rankOfNumbers(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static char[] reverseString(String a) {
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char dop = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = dop;

        }
        //StringBuilder str = new StringBuilder(a).reverse();
        //return str.toString();
        return chars;
    }

    public static int maxNum(Integer[] mass) {
        int maxNum = -1;
        for (Integer a : mass) {
            if (a > maxNum) {
                maxNum = a;
            }
        }
        return maxNum;
    }

    public static Integer[] skleyka(Integer[] mass1, Integer[] mass2) {
        Integer[] newMass = new Integer[mass1.length + mass2.length];
        for (int i = 0; i < newMass.length; i++) {
            if (i < mass1.length) {
                newMass[i] = mass1[i];

            }
            if (i >= mass1.length) {
                newMass[i] = mass2[i - mass1.length];
            }
        }
        return newMass;


    }


    public static Integer[][] transPon(Integer[][] matrix1) {
        Integer[][] mass21 = new Integer[matrix1[0].length][matrix1.length];
        for (int i = 0; i < matrix1[0].length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                mass21[i][j] = matrix1[j][i];
            }
        }
        return mass21;

    }

    public static Integer[][] sumOfMatrix(Integer[][] matrix1, Integer[][] matrix2) {
        Integer[][] sumMatrix = new Integer[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }

        }
        return sumMatrix;
    }


}


