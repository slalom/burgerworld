package com.slalom.pos.service;

import com.slalom.pos.repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;

    public void OrderService(OrderRepository orderRepo){
        orderRepository = orderRepo;
    }


}
