package com.project.ordermanager.controllers;

import com.project.ordermanager.entity.OrderEntity;
import com.project.ordermanager.model.Order;
import com.project.ordermanager.services.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("rest")
public class OrderControllerRest {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping
    public void post(@RequestBody OrderEntity order) {
         orderService.newOrder(order);
    }

    @GetMapping("/orders")
    public List<OrderEntity> get() {
        return orderService.getOrders();
    }

    @GetMapping("/test")
    public List<OrderEntity> gett() {
        return orderService.getOrdersByStatus("1");
    }

    @GetMapping("/test2")
    public List<OrderEntity> gettt() {
        orderService.updateStatus((OrderEntity) orderService.getNotOpenOrders().get(0));
        return orderService.getProcessedOrders();
    }
}
