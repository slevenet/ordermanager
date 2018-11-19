package com.project.ordermanager.services;

import com.project.ordermanager.configuration.common.constants.Constants;
import com.project.ordermanager.entity.OrderEntity;
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

    @Override
    public List getOrdersByStatus(String value){
        return orderRepository.select(Constants.Status.FIELD_STATUS_ID, value);
    }

    public void newOrder(OrderEntity orderEntity){
        orderRepository.insert(orderEntity);
    }

    public List getClosedOrders(){
        return this.getOrdersByStatus(Constants.Status.CLOSED);
    }

    public List getOpenedOrders(){
        return this.getOrdersByStatus(Constants.Status.OPENED);
    }

    public List getNotOpenOrders(){
        return this.getOrdersByStatus(Constants.Status.NOT_OPEN);
    }

    public List getProcessedOrders(){
        return this.getOrdersByStatus(Constants.Status.PROCESSED);
    }

    public void updateStatus(OrderEntity orderEntity){
        orderEntity.setStatus_id(Long.parseLong(Constants.Status.PROCESSED, 10) );
        orderRepository.update(orderEntity);
    }
}
