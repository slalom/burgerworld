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
}