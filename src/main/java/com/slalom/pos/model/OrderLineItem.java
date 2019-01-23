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

    public void setId(String value) {
        this.id = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setPrice(Double value) {
        this.price = value;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }
}