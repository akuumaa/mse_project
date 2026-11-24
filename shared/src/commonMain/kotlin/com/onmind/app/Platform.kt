package com.onmind.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform