
package com.kodewala.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.OrderEntity;
import com.kodewala.request.response.OrderRequest;
import com.kodewala.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(
            @RequestBody OrderRequest request) {

        OrderEntity order = orderService.createOrder(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
