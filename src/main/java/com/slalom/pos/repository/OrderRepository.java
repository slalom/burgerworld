package com.slalom.pos.repository;

import com.slalom.pos.model.ProductOrder;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface OrderRepository extends CassandraRepository<ProductOrder, String> {

    @AllowFiltering
    //public List<Order> getByPoNumber(String poNumber);
    //public List<Order> getOrders();

    public ProductOrder getById(String orderId);

    public ProductOrder getByPoNumber(String poNumber);
}