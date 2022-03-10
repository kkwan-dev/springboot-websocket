package io.github.kkwan0226.springboot.websocket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebsocketApplication

fun main(args: Array<String>) {
	runApplication<WebsocketApplication>(*args)
}
