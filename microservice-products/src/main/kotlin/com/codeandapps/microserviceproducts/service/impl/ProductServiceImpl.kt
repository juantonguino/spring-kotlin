package com.codeandapps.microserviceproducts.service.impl

import com.codeandapps.microserviceproducts.model.Product
import com.codeandapps.microserviceproducts.repsitory.IProductRepository
import com.codeandapps.microserviceproducts.service.IProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ProductServiceImpl(@Autowired var productRepository:IProductRepository): IProductService {

    override fun saveProduct(product: Product):Product{
    return productRepository.save(product)
    }

    override fun findById(id:Long):Product{
    return productRepository.findById(id).orElse(Product(id=null, nombre = "", codigo = "", precio = 0.0))
    }

}