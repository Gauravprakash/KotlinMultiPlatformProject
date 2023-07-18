package com.example.kotlinhomeproject

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return " ${platform.name}!"
    }
}