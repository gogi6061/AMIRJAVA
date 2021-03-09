package homework.accounting;

import java.util.ArrayList;
import java.util.Arrays;

public class OrdersList {
    private ArrayList<Order> ordersList = new ArrayList<>();

    public void getOrdersList() {
        for (int i = 0; i < ordersList.size(); i++) {


            System.out.printf("Orders name is: %s\n Price is: %d\n Goods is %s\n factory is: %s \n",
                    ordersList.get(i).getBuyer().getName1(),
                    ordersList.get(i).getGoods().getPrice(),
                    ordersList.get(i).getGoods().getName(),
                    ordersList.get(i).getGoods().getManufacturer());

        }
    }

    public void setInOrderList(Order... o) {
        ordersList.addAll(Arrays.asList(o));
    }

}
