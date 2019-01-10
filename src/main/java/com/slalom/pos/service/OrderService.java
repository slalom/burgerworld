package com.slalom.pos.service;

import com.slalom.pos.model.Item;
import com.slalom.pos.model.ProductOrder;
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

    public List<ProductOrder> getOrders() {
        return orderRepository.findAll();
    }

    public ProductOrder getOrderById(String orderId) {
        return orderRepository.getById(orderId);
    }

    public ProductOrder getByPoNumber(String poNumber) {
        return orderRepository.getByPoNumber(poNumber);
    }

    public ProductOrder createOrder(ProductOrder order) {
        return orderRepository.insert(order);
    }

    public ProductOrder updateOrder(String orderId, ProductOrder productOrder) throws Exception {
        ProductOrder existingOrder = orderRepository.getById(orderId);

        if(existingOrder == null) {
            throw new Exception("ID: " + orderId + " does not exist");
        }

        if (orderId.compareTo(existingOrder.getId()) != 0)
            throw new Exception("ID passed in is " + orderId + " and is not the same as " + productOrder.getId());

        orderRepository.save(productOrder);
        return productOrder;
    }

    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }
}
