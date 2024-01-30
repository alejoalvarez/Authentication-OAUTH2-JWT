package java8.defaultmethod;

import java.util.List;

public interface IOrderItem {

    public double getQuantity();
    public double getPrice();

    public default double getTotal(){
        return getQuantity() * getPrice();
    }
}
