package com.project.ordermanager.services;

import com.project.ordermanager.model.Order;
import com.project.ordermanager.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderServise {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order get() {
        return null;
    }

    @Override
    public Order save(Order user) {
        return null;
    }
}
