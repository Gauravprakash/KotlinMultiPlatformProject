package com.example.kotlinhomeproject

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = "Gaurav" + UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()