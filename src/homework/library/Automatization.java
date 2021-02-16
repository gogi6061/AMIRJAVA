package homework.library;

import java.io.*;
import java.util.*;

public class Automatization {

    public static void main(String[] args) {
        try (BufferedReader readerAuthors = new BufferedReader(new FileReader("C:\\Users\\steam\\IdeaProjects\\DZ(9.10.20)\\src\\homework\\library\\resources\\imena.txt"));
             BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\Users\\steam\\IdeaProjects\\DZ(9.10.20)\\src\\homework\\library\\resources\\spisok.txt")));
             BufferedReader readerNazv = new BufferedReader(new FileReader("C:\\Users\\steam\\IdeaProjects\\DZ(9.10.20)\\src\\homework\\library\\resources\\nazvania.txt"))) {
            Scanner scan = new Scanner(readerAuthors);
            Scanner scan1 = new Scanner(readerNazv);
            while (scan.hasNext()) {
                String s = scan.nextLine();
                try {
                    String s2;
                    while (!(s2 = scan1.nextLine()).equals("#")) {
                        writer.write(s + "^" + s2 + "^" + (int) (Math.random() * 10) + "\n");

                    }

                } catch (NoSuchElementException exc) {
                    System.out.println(exc.getMessage());

                }
            }


        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }


}
