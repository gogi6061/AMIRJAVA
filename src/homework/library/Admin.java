package homework.library;

public class Admin extends Librarian {

    public Admin(String name) {
        super(name);
    }

    public void addToBlackList(Visitor visitor, BlackList blackList) {
        blackList.getBlackList().add(visitor);


    }

    public void removeFromBlackList(Visitor visitor, BlackList blackList) {
        blackList.getBlackList().remove(visitor);
    }
}
