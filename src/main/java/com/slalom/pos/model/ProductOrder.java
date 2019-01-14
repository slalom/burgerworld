package com.slalom.pos.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.Date;

@Table
public class ProductOrder {
    @PrimaryKey
    private String id;
    private String poNumber;
    private String customerName;
    private Date orderDate;

    public ProductOrder(String id, String poNumber, String customerName, Date orderDate) {
        this.id = id;
        this.poNumber = poNumber;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
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