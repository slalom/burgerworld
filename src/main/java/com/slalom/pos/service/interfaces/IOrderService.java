package com.slalom.pos.service.interfaces;

import com.slalom.pos.model.ProductOrder;

import java.util.List;


public interface IOrderService {
    public List<ProductOrder> getOrders();
    public ProductOrder getOrderById(String orderId);
    public ProductOrder getByPoNumber(String poNumber);
    public ProductOrder createOrder(ProductOrder order);
    public ProductOrder updateOrder(String orderId, ProductOrder order) throws Exception;
    public void deleteOrder(String orderId);
}
