package com.project.ordermanager.model;

public class Price {
    private double ask;
    private double bid;
    private double mid;

    public Price() {
    }

    public Price(double ask, double bid) {
        this.ask = ask;
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public double getBid() {
        return bid;
    }

    public double getMid() {
        return mid;
    }

}
