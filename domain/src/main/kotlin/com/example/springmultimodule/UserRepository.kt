package com.example.springmultimodule

import org.springframework.stereotype.Repository

interface UserRepository {
    fun add(name: String): Long
    fun read(id: Long): User?
}