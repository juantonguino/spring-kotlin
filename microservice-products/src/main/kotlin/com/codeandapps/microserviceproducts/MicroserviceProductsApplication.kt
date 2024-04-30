package com.codeandapps.microserviceproducts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceProductsApplication

fun main(args: Array<String>) {
    runApplication<MicroserviceProductsApplication>(*args)
}
