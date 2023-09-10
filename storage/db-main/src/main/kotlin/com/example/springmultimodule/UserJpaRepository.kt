package com.example.springmultimodule

import org.springframework.data.jpa.repository.JpaRepository

internal interface UserJpaRepository: JpaRepository<UserEntity, Long>