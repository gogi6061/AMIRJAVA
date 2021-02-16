package homework.accounting;

public class Goods {
    private String name;
    private int price;
    private String manufacturer;

    public Goods(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
