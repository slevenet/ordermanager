package com.project.ordermanager;

import com.project.ordermanager.entity.OrderEntity;
import com.project.ordermanager.services.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderManager {

    @Autowired
    OrderServiceImpl orderService;

    @Scheduled(fixedRate = 6000)
    public void checkDB(){
        List<OrderEntity> closedOrders = orderService.getClosedOrders();
        //TO DO: time of the open and close
        //closedOrders.get(0).get
    }
}
