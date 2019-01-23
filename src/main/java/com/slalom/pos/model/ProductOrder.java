package com.slalom.pos.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.Date;
import java.util.List;

@Table
public class ProductOrder {
    @PrimaryKey
    private String id;
    private String poNumber;
    private String customerName;
    private Date orderDate;
    private List<OrderLineItem> orderLineItems;

    public ProductOrder(String id, String poNumber, String customerName, Date orderDate, List<OrderLineItem> orderLineItems) {
        this.id = id;
        this.poNumber = poNumber;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderLineItems = orderLineItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date value) {
        this.orderDate = value;
    }

    public List<OrderLineItem> getOrderLineItems() { return orderLineItems; }

    public void setOrderLineItems(List<OrderLineItem> value){
        this.orderLineItems = value;
    }
}