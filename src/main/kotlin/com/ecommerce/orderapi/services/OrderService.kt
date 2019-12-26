package com.ecommerce.orderapi.services

import com.ecommerce.orderapi.models.Order
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class OrderService(
        val restTemplate: RestTemplate,
        @Value("\${inventory-service-url}")
        val inventoryServiceUrl: String
) {

    fun placeOrders(orders: List<Order>) {
        val httpEntity: HttpEntity<List<Order>> = HttpEntity(orders)
        restTemplate.postForEntity(inventoryServiceUrl, orders, List::class.java)
    }
}