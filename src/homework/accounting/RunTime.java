package homework.accounting;

public class RunTime {


    public static void main(String[] args) {
        Buyer b1 = new Buyer("Amir",18,"male");
        Goods g1 = new Goods("ps5", 7000, "Sony");
        Goods g2 = new Goods("ps5a", 7000, "Sony");
        OrdersList orders = new OrdersList();

        Order o1 = new Order(b1,g1);
        Order o2 = new Order(b1,g2);
        orders.setInOrderList(o1,o2);
        orders.getOrdersList();
    }
}
