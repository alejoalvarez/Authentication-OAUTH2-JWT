package java8.defaultmethod;

import java.util.List;

public interface IOrder {

    public List<IOrderItem> getOrderItem();

    public default double getTotal(){
        double total = 0;
        for (IOrderItem item : getOrderItem()) {
            total += item.getTotal();
        }
        return total;
    }

    public default void addOrderItem(IOrderItem orderItem){
        getOrderItem().add(orderItem);
    }
    public default void addOrderItem2(IOrderItem orderItem){
        getOrderItem().add(orderItem);
    }
}
