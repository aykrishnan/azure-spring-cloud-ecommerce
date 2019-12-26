package com.ecommerce.orderapi.controllers

import com.ecommerce.orderapi.models.Order
import com.ecommerce.orderapi.services.OrderService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class OrderController(val orderService: OrderService) {

    @PostMapping
    fun foo(orders: List<Order>) {
        orderService.placeOrders(orders)
    }
}