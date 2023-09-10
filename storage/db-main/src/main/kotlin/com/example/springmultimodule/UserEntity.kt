package com.example.springmultimodule

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
internal class UserEntity (
    @Column
    val name: String
): BaseEntity()