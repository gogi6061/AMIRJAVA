package homework.library;

import java.util.*;

public class Visitor {
    private String name;
    private int age;


    private ArrayList<Book> selfBooks = new ArrayList<>();

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public ArrayList<Book> getVisitorBooks() {
        return selfBooks;
    }

    public void addBooks(Book book) {
        selfBooks.add(book);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void returnBookToTheLibrary(String bookName) {
        Book book1 = null;
        for (Book book : selfBooks) {
            if (book.getName().equals(bookName)) {
                System.out.printf("\nВы вернули книгу %s ", bookName);
                book.incColvo();
                book1 = book;
                break;
            }
        }
        if (book1==null) {
            System.out.println("У вас нет этой книги");
        }
    }




    @Override
    public boolean equals(Object v) {
        Visitor v1 = (Visitor) v;
        return this.name.equals(v1.name);
    }
}
