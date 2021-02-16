package Learning.myMethods;


public class MassivMethods {
    public static Integer[] quickSort(Integer[] a, int left, int right) {
        int pivot = a[(left + right) / 2];
        int i = left;
        int j = right;
        while (i < j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int dop = a[i];
                a[i] = a[j];
                a[j] = dop;
                i++;
                j--;
            }
        }
        if (left < right) {
            quickSort(a, left, j);

        }
        if (right > i) {
            quickSort(a, i, right);
        }


        return a;


    }

    public static boolean binarySearch(Integer[] mass, int searchNum) {
        int left = 0;
        int right = mass.length - 1;
        boolean flag = false;

        while (left < right - 1) {
            int m = (left + right) / 2;
            if (mass[m] == searchNum) {
                flag = true;
                break;


            }
            if (mass[m] < searchNum) {
                left = m;
            }
            if (mass[m] > searchNum) {
                right = m;
            }
        }
        return flag;


    }


    public static <T> void massOut(T[] mass) {

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]  +"\n");

        }


    }

    public static Integer[] massInit(int size) {
        Integer[] massMeth = new Integer[size];
        for (int i = 0; i < size; i++) {
            massMeth[i] = (int) (Math.random() * 10);

        }
        return massMeth;

    }


    static void sort(int[] x) {
        for (int j : x) {
            System.out.println(j); //изначальный массив

        }

        int k = 0;
        int num = 0;
        for (int j = 0; j < x.length - 1; j++) {
            int min = 10 * 30;

            for (int i = j; i < x.length; i++) {


                if (x[i] < min) {
                    min = x[i];
                    num = i;
                }


            }
            k = x[j];
            x[j] = min;
            x[num] = k;
        }

        for (int j : x) {
            System.out.println(" new " + j);

        }


    }


    static void setDelNum(int[] x, int delNum) {
        for (int i : x) {
            System.out.print(" " + i);

        }
        int[] massDop = new int[x.length];
        int c = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= delNum) {
                x[c++] = x[i];


            }

        }
        for (int i = c; i < x.length; i++) {
            x[i] = 0;
        }


        for (int i : x) {
            System.out.print(" new " + i);
            ;
        }


    }


    static void bolsheMenshe(int[] x) {
        int max = 0;
        int min = 10 * 90;
        int maxNum = 0;
        int minNum = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
                maxNum = i;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
                minNum = i;
            }

        }
        System.out.println("min" + min + " max " + max);
        int dop = maxNum;
        x[maxNum] = min;
        x[minNum] = max;
        for (int i : x) {
            System.out.print("   " + i);
        }


    }


    public static void menshe(int[] x) {
        int summa = 0;
        int srarifm = 0;
        for (int i : x) {
            summa += i;

        }
        srarifm = summa / x.length;

        System.out.println("sred arifm " + srarifm);

        for (int i : x) {
            if (i < srarifm) {
                System.out.print(" " + i);
            }
        }


    }


    static int maxChet(int[] x) {
        int max = 0;
        for (int i : x) {
            if ((i % 2 == 0) & (i > max)) {
                max = i;
            }
        }
        return max;
    }


    static int summa1(int[] x) {
        int summa2 = 0;
        for (int i : x) {
            summa2 += i;
        }
        return summa2;


    }

}
