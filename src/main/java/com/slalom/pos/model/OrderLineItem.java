package com.slalom.pos.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import com.slalom.pos.repository.OrderLineItemKey;

@Table
public class OrderLineItem {
    @PrimaryKey
    private OrderLineItemKey orderLineItemKey;

    private String id;
    private String name;
    private Double price;
    private int quantity;
}