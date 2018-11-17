package com.project.ordermanager.services;

import com.project.ordermanager.model.Order;

public interface OrderServise {

    Order get();
    Order save(Order user);

}
