/*
Создаются каталог, библиотекарь, посетитель, администратор
 */


package homework.library;

public class RunTime {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Librarian libr1 = new Librarian("Amir");
        Visitor visitor = new Visitor("Kamila Ganieva", 17);
        Admin admin = new Admin("Arslan");
        BlackList blackList = new BlackList();
        libr1.getServices().addBook(new Order("Артур Конан Дойль", "Знак четырёх (1890)"), catalog, visitor, blackList);
        admin.addToBlackList(visitor, blackList);
        libr1.getServices().addBook(new Order("Александр Сергеевич Пушкин", "К** (Ты богоматерь, нет сомненья...). Стихотворение. (1826)."), catalog, visitor, blackList);
        admin.removeFromBlackList(visitor, blackList);
        libr1.getServices().addBook(new Order("Александр Сергеевич Пушкин", "К** (Ты богоматерь, нет сомненья...). Стихотворение. (1826)."), catalog, visitor, blackList);
        System.out.println("\n " + visitor.getVisitorBooks());

    }
}
