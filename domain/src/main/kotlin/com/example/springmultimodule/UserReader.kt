package com.example.springmultimodule

import org.springframework.stereotype.Component
import java.util.NoSuchElementException

@Component
class UserReader (
    private val userRepository: UserRepository
){
    fun read(id: Long): User {
        return userRepository.read(id) ?: throw NoSuchElementException()
    }
}