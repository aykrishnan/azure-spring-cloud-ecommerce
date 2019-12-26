package com.ecommerce.orderapi.models

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class Product(
        @Id
        @GeneratedValue
        val id: Long,
        val name: String,
        val description: String?,
        val price: BigDecimal
)
