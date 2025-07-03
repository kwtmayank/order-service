package com.order.order_service.controller;

import com.order.order_service.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final ProductClient productClient;

    @Autowired
    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/{productId}")
    public String getOrder(@PathVariable("productId") String productId) {
        return productClient.getProduct(productId);
    }
}
