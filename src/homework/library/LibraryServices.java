package homework.library;



import java.util.*;

public class LibraryServices {
    private HashMap<Visitor, HashSet<Book>> issuedBooks = new HashMap<>();
    public void checkNull(Book book,Order order){
        if (book == null) {
            System.out.printf("\nПроизведение %s не нашлось",order.getBookName());
        } else {
            System.out.printf("\nПроизведение %s нашлось", order.getBookName());
        }


    }

    public Book searchBook(Catalog catalog, Order order, Visitor visitor, BlackList blackList){
        Book book1 = null;


        for (Book book : catalog.getCatalog().get(order.getAuthor())) {
            if(blackList.getBlackList().contains(visitor)){
                System.out.printf("\nПользователь %s в черном списке",visitor.getName());
                break;

            }
            if (book.getName().equals(order.getBookName())) {
                if (book.getColvo() < 1) {
                    System.out.printf("\nИзвините, но экзепляры %s закончились", book.getName());
                    break;
                }



                if (visitor.getVisitorBooks().contains(book)) {
                    System.out.println("\nУ вас уже есть это произведение");
                    break;
                }
                book1 = book;
                visitor.addBooks(book);
                book.decColvo();


            }

        }
        checkNull(book1,order);
        return book1;

    }
    public void addBook(Order order, Catalog catalog, Visitor visitor, BlackList blackList) {
        Book book1 = searchBook(catalog, order, visitor, blackList);


        try {
            if(book1 != null){
                addIssuedBooks(visitor,book1,issuedBooks);
            }

        } catch (NullPointerException exc) {
            System.out.println("Проверьте правильность названия произведения и\\или автора");

        }
    }

    public void addIssuedBooks(Visitor visitor, Book book, HashMap<Visitor, HashSet<Book>> issuedBooks) {
        if (!issuedBooks.containsKey(visitor)) {
            issuedBooks.put(visitor, new HashSet<>());
            issuedBooks.get(visitor).add(book);

        } else {
            issuedBooks.get(visitor).add(book);
        }


    }

    public HashMap<Visitor, HashSet<Book>> getIssuedBooks() {
        return issuedBooks;
    }
}
