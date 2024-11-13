
package rmg;

import java.util.*;

public class Customer {
    String customerId,name,email,phone;
    List<Order>orders=new ArrayList<>();
    void placeOrder(Order order){
        orders.add(order);
    }
     List<Order> viewOrders(){
         return orders;   
     }
}
