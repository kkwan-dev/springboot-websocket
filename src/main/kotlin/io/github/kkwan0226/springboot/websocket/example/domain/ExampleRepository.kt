package io.github.kkwan0226.springboot.websocket.example.domain

import org.springframework.data.jpa.repository.JpaRepository

interface ExampleRepository : JpaRepository<Example, Long> {
}
