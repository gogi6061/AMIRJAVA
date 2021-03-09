package homework.library;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Book {
    private String name;
    private String author;
    private int colvo;


    Predicate<Integer> checkColvo = check -> check > 0;


    public int getColvo() {
        return colvo;
    }

    public void decColvo() {
        this.colvo -= 1;
    }

    public void incColvo() {
        this.colvo += 1;
    }


    public Book(String name, String author, int colvo) {
        this.name = name;
        this.author = author;
        this.colvo = colvo;
    }

    public Book() {

    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return this.getName();
    }
}
