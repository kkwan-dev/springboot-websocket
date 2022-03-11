package io.github.kkwan0226.springboot.websocket.example.ui

import io.github.kkwan0226.springboot.websocket.example.domain.Example

class ExampleRequest private constructor(
  private val string: String
) {
  fun toEntity() = Example.from(string)

  fun getString() = this.string
}
