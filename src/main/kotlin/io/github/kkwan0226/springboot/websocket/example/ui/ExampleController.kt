package io.github.kkwan0226.springboot.websocket.example.ui

import io.github.kkwan0226.springboot.websocket.example.application.ExampleService
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class ExampleController(
  private val exampleService: ExampleService
) {
  @MessageMapping("/publish/example")
  @SendTo("/subscribe/example")
  fun send(@Payload exampleRequest: ExampleRequest): ExampleResponse {
    return exampleService.save(exampleRequest)
  }
}
