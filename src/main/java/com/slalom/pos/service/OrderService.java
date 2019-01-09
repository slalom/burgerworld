package com.slalom.pos.service;

import com.slalom.pos.model.Item;
import com.slalom.pos.model.Order;
import com.slalom.pos.repository.OrderRepository;
import com.slalom.pos.service.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void OrderService(OrderRepository orderRepo){
        this.orderRepository = orderRepo;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String orderId) {
        return orderRepository.getOrderById(orderId);
    }

    public Order getOrderByPoNumber(String poNumber) {
        return orderRepository.getOrderByPoNumber(poNumber);
    }

    public Order createOrder(Order order) {
        return orderRepository.insert(order);
    }

    public Order updateOrder(String orderId, Order order) throws Exception {
        Order itemToUpdate = orderRepository.getOrderById(orderId);

        if(itemToUpdate == null) {
            throw new Exception("ID: " + orderId + " does not exist");
        }

        if (orderId.compareTo(itemToUpdate.getId()) == 1)
            throw new Exception("ID passed in is " + orderId + " and is not the same as " + order.getId());

        orderRepository.save(itemToUpdate);
        return order;
    }

    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }
}
