package com.codeandapps.microserviceproducts.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "PRODUCTS")
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id:Long?=null,
        @Column(name = "nombre")
        var nombre:String,
        @Column(name = "codigo")
        var codigo:String,
        @Column(name = "precio")
        var precio:Double
)
