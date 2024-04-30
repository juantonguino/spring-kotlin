package com.codeandapps.microserviceproducts.controller.dto

data class ProductDTO (
        var id:Long?=null,
        var nombre:String,
        var codigo:String,
        var precio:Double
)