package com.example.shoppingmall

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class ShoppingmallApplication

fun main(args: Array<String>) {
    runApplication<ShoppingmallApplication>(*args)
}
