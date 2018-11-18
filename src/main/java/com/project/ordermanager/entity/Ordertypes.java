package com.project.ordermanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_types")
public class Ordertypes {

    @Id
    private long order_type_id;
    private String value;

    public Ordertypes() {
    }

    public Ordertypes(long order_type_id, String value) {
        this.order_type_id = order_type_id;
        this.value = value;
    }

    public void setOrder_type_id(long order_type_id) {
        this.order_type_id = order_type_id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getOrder_type_id() {
        return order_type_id;
    }

    public String getValue() {
        return value;
    }
}
