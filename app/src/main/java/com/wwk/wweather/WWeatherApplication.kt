package com.wwk.wweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WWeatherApplication: Application() {      // 继承Application子类后，还需要在AndroidManifest.xml application:name 中指定

    companion object{
        @SuppressLint("StaticFieldLeak")    // ?
        lateinit var context: Context   // 延迟初始化
        const val TOKEN = "931a88553a454ffeb636cee612852c63"    // 常量（编译期确定）
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}