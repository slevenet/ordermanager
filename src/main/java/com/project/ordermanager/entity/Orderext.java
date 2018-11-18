package com.project.ordermanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderext")
public class Orderext {

    @Id
    private long orderext_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private OrderEntity order;

    private long open_time;
    private long close_time;
    private double max_price;
    private double min_price;

    public Orderext() {
    }

    public Orderext(long orderext_id, OrderEntity order_id, long open_time, long close_time, double max_price, double min_price) {
        this.orderext_id = orderext_id;
        this.order = order_id;
        this.open_time = open_time;
        this.close_time = close_time;
        this.max_price = max_price;
        this.min_price = min_price;
    }

    public void setOrderext_id(long orderext_id) {
        this.orderext_id = orderext_id;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public void setOpen_time(long open_time) {
        this.open_time = open_time;
    }

    public void setClose_time(long close_time) {
        this.close_time = close_time;
    }

    public void setMax_price(double max_price) {
        this.max_price = max_price;
    }

    public void setMin_price(double min_price) {
        this.min_price = min_price;
    }

    public long getOrderext_id() {
        return orderext_id;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public long getOpen_time() {
        return open_time;
    }

    public long getClose_time() {
        return close_time;
    }

    public double getMax_price() {
        return max_price;
    }

    public double getMin_price() {
        return min_price;
    }
}
