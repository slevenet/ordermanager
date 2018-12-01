package com.project.ordermanager.entity;



import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue
    private long order_id;
    private StrategyEntity strategy;
    private OrderTypeEntity order_type;
    private StatusEntity status;
    private double tp;
    private double sl;
    private String instrument;


    public OrderEntity() {
    }

    public OrderEntity(StrategyEntity strategy, OrderTypeEntity order_type, StatusEntity status, double tp, double sl, String instrument) {
        this.strategy = strategy;
        this.order_type = order_type;
        this.status = status;
        this.tp = tp;
        this.sl = sl;
        this.instrument = instrument;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public void setStrategy(StrategyEntity strategy) {
        this.strategy = strategy;
    }

    public void setOrder_type(OrderTypeEntity order_type) {
        this.order_type = order_type;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public long getOrder_id() {
        return order_id;
    }

    public StrategyEntity getStrategy() {
        return strategy;
    }

    public OrderTypeEntity getOrder_type() {
        return order_type;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public double getTp() {
        return tp;
    }

    public double getSl() {
        return sl;
    }

    public String getInstrument() {
        return instrument;
    }
}
