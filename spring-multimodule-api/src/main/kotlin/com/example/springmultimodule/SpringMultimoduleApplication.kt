package com.example.springmultimodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringMultimoduleApplication

fun main(args: Array<String>) {
    runApplication<SpringMultimoduleApplication>(*args)
}
