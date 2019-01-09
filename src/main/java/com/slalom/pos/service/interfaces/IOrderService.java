package com.slalom.pos.service.interfaces;

import java.util.List;
import com.slalom.pos.model.Order;


public interface IOrderService {
    public List<Order> getOrders();
    public Order getOrderById(String orderId);
    public Order getOrderByPoNumber(String poNumber);
    public Order createOrder(Order order);
    public Order updateOrder(String orderId, Order order) throws Exception;
    public void deleteOrder(String orderId);
}
