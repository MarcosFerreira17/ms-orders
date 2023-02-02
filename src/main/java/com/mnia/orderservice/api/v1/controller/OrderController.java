package com.mnia.orderservice.api.v1.controller;

import com.mnia.orderservice.domain.dtos.OrderDetailDto;
import com.mnia.orderservice.domain.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> placeOrder(@RequestBody OrderDetailDto orderDetailDto){
        orderService.placeOrder(orderDetailDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Order created Successfully");
    }
}
