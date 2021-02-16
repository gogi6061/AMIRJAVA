package homework.library;


import java.util.*;

public class Librarian {
    private String name;
    LibraryServices services = new LibraryServices();

    public Librarian(String name) {
        this.name = name;
    }



    public LibraryServices getServices(){
        return services;
    }







}
