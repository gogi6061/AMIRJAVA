package homework.library;

import java.io.*;

import java.util.*;

public class Catalog {
    private HashMap<String, HashSet<Book>> catalog = new HashMap<>();

    public Catalog() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\steam\\IdeaProjects\\DZ(9.10.20)\\src\\homework\\library\\resources\\spisok.txt"))) {
            Scanner scan = new Scanner(reader);

            String author;
            String nameBook;
            Integer u;

            while (scan.hasNextLine()) {
                String[] str1 = scan.nextLine().split("\\^");
                if (Integer.parseInt(str1[2]) != 0) {
                    add(new Book(str1[1], str1[0], Integer.parseInt(str1[2])));
                } else {
                    System.out.println("Нет книг " + str1[1]);
                }


            }


        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }

    public void add(Book book) {
        if (!catalog.containsKey(book.getAuthor())) {
            catalog.put(book.getAuthor(), new HashSet<>());
            catalog.get(book.getAuthor()).add(book);

        } else {
            catalog.get(book.getAuthor()).add(book);
        }


    }

    public HashMap<String, HashSet<Book>> getCatalog() {
        return catalog;
    }
}
