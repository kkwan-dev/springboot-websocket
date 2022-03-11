package io.github.kkwan0226.springboot.websocket.example.ui

import io.github.kkwan0226.springboot.websocket.example.domain.Example

class ExampleResponse private constructor(
  private val id: Long,
  private val string: String
) {
  companion object {
    fun fromEntity(example: Example) = ExampleResponse(
      id = example.getId(),
      string = example.getString()
    )
  }

  fun getString() = this.string
}
