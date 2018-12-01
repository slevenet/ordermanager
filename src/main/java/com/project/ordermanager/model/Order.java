package com.project.ordermanager.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Order {

    private String strategy;
    private String order_type;
    private double sl;
    private double tp;
    private double price;
    private String instrument;

    public Order() {
    }

    public Order(String strategy, String order_type, double sl, double tp, double price, String instrument) {
        this.strategy = strategy;
        this.order_type = order_type;
        this.sl = sl;
        this.tp = tp;
        this.price = price;
        this.instrument = instrument;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getStrategy() {
        return strategy;
    }

    public String getOrder_type() {
        return order_type;
    }

    public double getSl() {
        return sl;
    }

    public double getTp() {
        return tp;
    }

    public double getPrice() {
        return price;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Order{" +
                "strategy='" + strategy + '\'' +
                ", order_type='" + order_type + '\'' +
                ", sl=" + sl +
                ", tp=" + tp +
                ", price=" + price +
                ", instrument='" + instrument + '\'' +
                '}';
    }

    public  void format(Order order, int scale){
        order.setSl(new BigDecimal(order.getSl()).setScale(scale, RoundingMode.UP).doubleValue());
        order.setTp(new BigDecimal(order.getTp()).setScale(scale, RoundingMode.UP).doubleValue());
        order.setPrice(new BigDecimal(order.getPrice()).setScale(scale, RoundingMode.UP).doubleValue());
    }
}
