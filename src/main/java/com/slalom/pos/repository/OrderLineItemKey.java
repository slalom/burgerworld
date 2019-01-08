package com.slalom.pos.repository;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class OrderLineItemKey {
    @PrimaryKeyColumn(type= PrimaryKeyType.PARTITIONED)
    private String orderId;

    @PrimaryKeyColumn(type=PrimaryKeyType.CLUSTERED)
    private String orderLineItemId;
}
