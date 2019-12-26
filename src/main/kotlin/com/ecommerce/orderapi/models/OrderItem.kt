package com.ecommerce.orderapi.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class OrderItem(
        @Id
        @GeneratedValue
        val id: Long,
        val product: Product,
        val order: Order,
        val quantity: Int = 1
)
