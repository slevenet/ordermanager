package com.project.ordermanager.services;

import com.project.ordermanager.model.Order;

import java.util.List;

public interface OrderServise {

    List getOrders();
    Order save(Order user);

}
