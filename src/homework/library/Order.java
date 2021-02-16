package homework.library;

public class Order {
    private String author;
    private String bookName;
    OrderList list = new OrderList();

    public Order(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;

    }

    public String getAuthor() {
        return author;
    }


    public String getBookName() {
        return bookName;
    }

}
