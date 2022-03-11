package io.github.kkwan0226.springboot.websocket.example.application

import io.github.kkwan0226.springboot.websocket.example.domain.ExampleRepository
import io.github.kkwan0226.springboot.websocket.example.ui.ExampleRequest
import io.github.kkwan0226.springboot.websocket.example.ui.ExampleResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class ExampleService(
  private val exampleRepository: ExampleRepository
) {
  @Transactional
  fun save(exampleRequest: ExampleRequest): ExampleResponse {
    val example = exampleRepository.save(exampleRequest.toEntity())

    return ExampleResponse.fromEntity(example)
  }
}
