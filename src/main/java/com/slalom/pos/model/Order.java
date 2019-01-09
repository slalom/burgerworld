package com.slalom.pos.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.Date;

@Table
public class Order {
    @PrimaryKey
    private String orderId;
    private String poNumber;
    private String customerName;
    private Date orderDate;

    public Order(String orderId, String poNumber, String customerName, Date orderDate) {
        this.orderId = orderId;
        this.poNumber = poNumber;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }
}