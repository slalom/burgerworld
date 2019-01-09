package com.slalom.pos.service;

import com.slalom.pos.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void OrderService(OrderRepository orderRepo){
        orderRepository = orderRepo;
    }


}
