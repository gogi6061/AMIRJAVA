//сортируем слова по их "весу"(значение буквы в byte*j(переменная))
//работает за n^2



package homework;

import Learning.myMethods.*;

import java.io.*;

public class StringSort {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringToSort = reader.readLine().split(" ");
        Integer[] charToString = new Integer[stringToSort.length];

        for (int i = 0; i < stringToSort.length; i++) {
            charToString[i] = hashCode(stringToSort[i].toCharArray());
        }

        MassivMethods.quickSort(charToString, 0, charToString.length - 1);

        for (int i = 0; i < stringToSort.length; i++) {
            for (int j = 0; j < stringToSort.length; j++) {
                if (charToString[i] == hashCode(stringToSort[j].toCharArray())) {
                    stringToSort[i] = stringToSort[j];
                }

            }
        }
        MassivMethods.massOut(stringToSort);


    }


    static int hashCode(char[] strings) {
        int count = 0;
        int j = strings.length;
        if (j==1){
            return (byte) strings[0];
        }

        for (int i = 0; i < strings.length; i++) {

            count += (((byte) strings[i])*j*j*10);
            j--;


        }
        return count;
    }



}
