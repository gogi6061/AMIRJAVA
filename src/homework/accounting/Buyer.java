package homework.accounting;

public class Buyer {
    private String name;
    private int age;
    private String gender;

    public String getName1() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Buyer(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

}
