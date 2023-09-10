package com.example.springmultimodule.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = ["com.example.springmultimodule.storage.db.main"])
@EnableJpaRepositories(basePackages = ["com.example.springmultimodule.storage.db.main"])
interface MainJpaConfig {
}