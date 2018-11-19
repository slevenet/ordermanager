package com.project.ordermanager.entity;



import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue
    private long order_id;
    private long strategy_id;
    private long order_type_id;
    private long status_id;
    private double tp;
    private double sl;
    private String instrument;


    public OrderEntity() {
    }

    public OrderEntity(long order_id, long strategy_id, long order_type_id, long status_id, double tp, double sl, String instrument) {
        this.order_id = order_id;
        this.strategy_id = strategy_id;
        this.order_type_id = order_type_id;
        this.status_id = status_id;
        this.tp = tp;
        this.sl = sl;
        this.instrument = instrument;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public void setStrategy_id(long strategy_id) {
        this.strategy_id = strategy_id;
    }

    public void setOrder_type_id(long order_type_id) {
        this.order_type_id = order_type_id;
    }

    public void setStatus_id(long status_id) {
        this.status_id = status_id;
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

    public long getStrategy_id() {
        return strategy_id;
    }

    public long getOrder_type_id() {
        return order_type_id;
    }

    public long getStatus_id() {
        return status_id;
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
