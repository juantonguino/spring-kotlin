package com.codeandapps.microserviceproducts.repsitory

import com.codeandapps.microserviceproducts.model.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface  IProductRepository: CrudRepository<Product, Long> {
}