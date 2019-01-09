package com.slalom.pos.repository;

import java.util.List;
import com.slalom.pos.model.Order;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface OrderRepository extends CassandraRepository<Order, String> {

    @AllowFiltering
    public List<Order> getByPoNumber(String poNumber);
    public List<Order> getOrders();

    public Order getOrderById(String orderId);

    public Order getOrderByPoNumber(String poNumber);
}