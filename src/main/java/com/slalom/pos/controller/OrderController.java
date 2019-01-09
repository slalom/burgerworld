package com.slalom.pos.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.slalom.pos.service.interfaces.IOrderService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.slalom.pos.model.Order;


@RestController

public class OrderController {

    private IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "order", method = RequestMethod.GET)
    public Collection<Order> list(){
        return orderService.getOrders();
    }

    @RequestMapping(value = "order/getOrderByPoNumber", method = RequestMethod.GET)
    public Order getOrderByPoNumber(@RequestParam(value = "poNumber", required=true) String poNumber){
        return orderService.getOrderByPoNumber(poNumber);
    }

    @RequestMapping(value = "order", method = RequestMethod.POST)
    public Order create(@RequestBody Order order) {
        String generatedOrderId = UUID.randomUUID().toString();
        Order orderToAdd = new Order(generatedOrderId, order.getPoNumber(), order.getCustomerName(), order.getOrderDate());
        return orderService.createOrder(orderToAdd);
    }

    @RequestMapping(value = "order/{orderId}", method = RequestMethod.PUT)
    public Order update(@PathVariable String orderId, @RequestBody Order order) throws Exception {
        Order orderToUpdate = orderService.getOrderById(order.getOrderId());

        orderService.updateOrder(order.getOrderId(), order);
        return order;

    }

    @RequestMapping(value = "order/{orderId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String orderId) {
        orderService.deleteOrder(orderId);
    }
}
