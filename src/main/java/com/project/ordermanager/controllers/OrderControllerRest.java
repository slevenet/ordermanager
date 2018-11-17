package com.project.ordermanager.controllers;

import com.project.ordermanager.model.Order;
import com.project.ordermanager.services.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("orders")
public class OrderControllerRest {


    private OrderServiceImpl orderService;

    @PostMapping
    public Order post(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping
    public Order get() {
        return orderService.get();
    }
}
