package com.example.prak8roomdatabase

import android.app.Application
import com.example.prak8roomdatabase.dependeciesinjection.ContainerApp

class KrsApp : Application() {

    //fungsinya untuk menyimpan instance containerApp dari dependencies injection
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()

        // membuat instance containerApp
        containerApp = ContainerApp(this)
        // instance adalah object yang dibuat dari class4
    }
}