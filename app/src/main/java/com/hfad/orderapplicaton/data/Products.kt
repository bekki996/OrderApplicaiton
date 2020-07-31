package com.hfad.orderapplicaton.data

data class Products(
    val buying: Double,
    val id: Int,
    val order: Int,
    val product: ProductX,
    val quantity: Int,
    val selling: Double
)