package com.project.ordermanager.model;

public class Order {
    private Price openPrice;
    private Price tp;
    private Price sl;
    private long lifetime;
    private String type;

    public Order() {
    }

    public Order(Price openPrice, Price tp, Price sl, long lifetime, String type) {
        this.openPrice = openPrice;
        this.tp = tp;
        this.sl = sl;
        this.lifetime = lifetime;
        this.type = type;
    }

    public Price getOpenPrice() {
        return openPrice;
    }

    public Price getTp() {
        return tp;
    }

    public Price getSl() {
        return sl;
    }

    public long getLifetime() {
        return lifetime;
    }

    public String getType() {
        return type;
    }

    public void setOpenPrice(Price openPrice) {
        this.openPrice = openPrice;
    }

    public void setTp(Price tp) {
        this.tp = tp;
    }

    public void setSl(Price sl) {
        this.sl = sl;
    }

    public void setLifetime(long lifetime) {
        this.lifetime = lifetime;
    }

    public void setType(String type) {
        this.type = type;
    }
}
