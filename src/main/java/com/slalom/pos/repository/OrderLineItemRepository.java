package com.slalom.pos.repository;

import com.slalom.pos.model.OrderLineItem;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface OrderLineItemRepository extends CassandraRepository<OrderLineItem, String> {

}