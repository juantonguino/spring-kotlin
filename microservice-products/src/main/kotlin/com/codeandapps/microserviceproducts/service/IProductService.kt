package com.codeandapps.microserviceproducts.service

import com.codeandapps.microserviceproducts.model.Product
import java.util.Optional

interface IProductService {

    fun saveProduct(product: Product): Product

    fun findById(id:Long): Product
}