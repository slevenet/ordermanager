package com.project.ordermanager.services;

import com.project.ordermanager.model.Order;
import com.project.ordermanager.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderServise {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List getOrders() {
        return orderRepository.selectAll();
    }

    @Override
    public Order save(Order user) {
        return null;
    }
}
