package com.example.kotlinhomeproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform