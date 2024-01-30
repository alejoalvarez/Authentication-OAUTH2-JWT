package java8.defaultmethod;

import java.util.ArrayList;
import java.util.List;

public class SalesOrder implements IOrder{

    private List<IOrderItem> orderItems;

    @Override
    public List<IOrderItem> getOrderItem() {
        if(orderItems==null){
            orderItems = new ArrayList<>();
        }
        return orderItems;
    }
}