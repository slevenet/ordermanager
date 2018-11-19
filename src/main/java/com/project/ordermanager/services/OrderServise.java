package com.project.ordermanager.services;

import com.project.ordermanager.model.Order;

import java.util.List;

public interface OrderServise {

    List getOrders();
    List getOrdersByStatus(String value);
    Order save(Order user);

}
