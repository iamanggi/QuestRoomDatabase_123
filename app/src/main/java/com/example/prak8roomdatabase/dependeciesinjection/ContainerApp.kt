package com.example.prak8roomdatabase.dependeciesinjection

import android.content.Context
import com.example.prak8roomdatabase.data.database.krsDatabase
import com.example.prak8roomdatabase.repository.LocalRepositoryMhs
import com.example.prak8roomdatabase.repository.RepositoryMhs

interface InterfacesContainerApp {
    val repositoryMhs:RepositoryMhs
}

class ContainerApp(private val context: Context ) : InterfacesContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(krsDatabase.getDatabase(context).mahasiswaDao())
    }

}