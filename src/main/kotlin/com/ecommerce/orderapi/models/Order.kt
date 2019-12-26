package com.ecommerce.orderapi.models

import javax.persistence.GeneratedValue
import javax.persistence.Id


data class Order (
        @Id
        @GeneratedValue
        val id: Long,
        val items: List<OrderItem>
)
