package com.slalom.pos.repository;

import com.slalom.pos.model.ProductOrder;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface OrderRepository extends CassandraRepository<ProductOrder, String> {

    @AllowFiltering
    public ProductOrder getById(String orderId);
    @AllowFiltering
    public ProductOrder getByPoNumber(String poNumber);
}