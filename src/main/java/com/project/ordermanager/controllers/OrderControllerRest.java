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
        // orderService.save();
    }

    @GetMapping("/orders")
    public List<OrderEntity> get() {
        return orderService.getOrders();
    }
}
