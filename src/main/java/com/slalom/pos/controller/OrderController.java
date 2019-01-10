package com.slalom.pos.controller;

import com.slalom.pos.model.ProductOrder;
import com.slalom.pos.service.interfaces.IOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;


@RestController
@RequestMapping("api/v1/")
public class OrderController {

    private IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "productorder", method = RequestMethod.GET)
    public Collection<ProductOrder> list(){
        return orderService.getOrders();
    }

    @RequestMapping(value = "productorder/getOrderByPoNumber", method = RequestMethod.GET)
    public ProductOrder getOrderByPoNumber(@RequestParam(value = "poNumber", required=true) String poNumber){
        return orderService.getByPoNumber(poNumber);
    }

    @RequestMapping(value = "productorder", method = RequestMethod.POST)
    public ProductOrder create(@RequestBody ProductOrder order) {
        String generatedOrderId = UUID.randomUUID().toString();
        ProductOrder orderToAdd = new ProductOrder(generatedOrderId, order.getPoNumber(), order.getCustomerName(), order.getOrderDate());
        return orderService.createOrder(orderToAdd);
    }

    @RequestMapping(value = "productorder/{orderId}", method = RequestMethod.PUT)
    public ProductOrder update(@PathVariable String orderId, @RequestBody ProductOrder order) throws Exception {
        ProductOrder orderToUpdate = orderService.getOrderById(order.getId());

        orderService.updateOrder(order.getId(), order);
        return order;

    }

    @RequestMapping(value = "productorder/{orderId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String orderId) {
        orderService.deleteOrder(orderId);
    }
}
