package com.slalom.pos.service.interfaces;

import com.slalom.pos.model.OrderLineItem;

import java.util.List;

public interface IOrderLineItemService {
    public List<OrderLineItem> getOrderLineItems();
    public List<OrderLineItem> getOrderLineItemsByOrderId(String orderId);
    public OrderLineItem createOrderLineItem(String orderId, OrderLineItem orderLineItem);
    public OrderLineItem updateOrderLineItem(String orderLineItemId, OrderLineItem orderLineItem);
    public void deleteOrderLineItem(String orderLineItemId, OrderLineItem orderLineItem);
}
