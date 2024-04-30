package com.codeandapps.microserviceproducts.controller.mapper

import com.codeandapps.microserviceproducts.controller.dto.ProductDTO
import com.codeandapps.microserviceproducts.model.Product
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.factory.Mappers

@Mapper
interface ProductMapper {

    //val INSTANCE: ProductMapper = Mappers.getMapper(ProductMapper.class)

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "codigo", target = "codigo")
    @Mapping(source = "precio", target = "precio")
    fun toDto(product: Product): ProductDTO

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "codigo", target = "codigo")
    @Mapping(source = "precio", target = "precio")
    fun toBean(productDTO: ProductDTO): Product
}