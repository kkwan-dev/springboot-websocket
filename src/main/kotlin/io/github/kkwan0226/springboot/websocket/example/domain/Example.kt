package io.github.kkwan0226.springboot.websocket.example.domain

import javax.persistence.*

@Entity
class Example private constructor(
  @Column private val string: String
) {
  companion object {
    fun from(string: String): Example = Example(string)
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private val id: Long = 0

  fun getId(): Long = this.id

  fun getString(): String = this.string
}
