package com.codeandapps.microserviceproducts.controller

import com.codeandapps.microserviceproducts.controller.dto.ProductDTO
import com.codeandapps.microserviceproducts.controller.mapper.ProductMapper
import com.codeandapps.microserviceproducts.model.Product
import com.codeandapps.microserviceproducts.service.IProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("products")
class ProductController(@Autowired var productService:IProductService, var productMapper: ProductMapper) {

    @GetMapping("/index")
    fun index(@RequestParam("name") name: String):String{
        return "hola desde $name"
    }

    @PostMapping("/")
    fun findByIndex(@RequestBody productDTO: ProductDTO): ResponseEntity<ProductDTO>{
        var product:Product= productMapper.toBean(productDTO)
        var result:ProductDTO = productMapper.toDto(productService.saveProduct(product))
        return ResponseEntity.ok(result)
    }

    @GetMapping("/{id}")
    fun findByIndex(@PathVariable("id") id:Long): ResponseEntity<ProductDTO>{
        var result:ProductDTO = productMapper.toDto(productService.findById(id))
        return ResponseEntity.ok(result)
    }
}