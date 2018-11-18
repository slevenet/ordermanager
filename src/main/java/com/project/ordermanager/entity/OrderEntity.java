package com.project.ordermanager.entity;



import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {

    private long order_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="strategy_id")
    private Strategies strategy;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_type_id")
    private Ordertypes order_type;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="status_id")
    private Status status;


    public OrderEntity() {
    }

    public OrderEntity(long order_id, Strategies strategy, Ordertypes order_type, Status status) {
        this.order_id = order_id;
        this.strategy = strategy;
        this.order_type = order_type;
        this.status = status;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public void setStrategy(Strategies strategy) {
        this.strategy = strategy;
    }

    public void setOrder_type(Ordertypes order_type) {
        this.order_type = order_type;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getOrder_id() {
        return order_id;
    }

    public Strategies getStrategy() {
        return strategy;
    }

    public Ordertypes getOrder_type() {
        return order_type;
    }

    public Status getStatus() {
        return status;
    }
}
