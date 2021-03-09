package homework.accounting;

public class Order {

    private Buyer buyer;
    private Goods goods;


    public Order(Buyer buyer, Goods goods) {
        this.buyer = buyer;
        this.goods = goods;


    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }


}
