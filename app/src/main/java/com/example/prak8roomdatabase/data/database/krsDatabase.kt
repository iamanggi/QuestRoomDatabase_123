package com.example.prak8roomdatabase.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.prak8roomdatabase.data.dao.MahasiswaDao
import com.example.prak8roomdatabase.data.entity.Mahasiswa

// mendefinisikan database dengan tabel mahasiswa
// exprotschema = mau eksprot database apa ga
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class krsDatabase : RoomDatabase() {

    //mendefinisikan fungsi untuk mengakses data mahasiswa
    // mahasiswaDao = untuk mengambil data dari kelas mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile //memastikan bahwa nilai variabel instance selalu sama di semua thread
        private var Instance: krsDatabase? = null


        fun getDatabase(context: Context): krsDatabase {
            return (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    krsDatabase::class.java,  //class database
                    "KrsDatabase"       // nama database
                )
                    .build().also { Instance = it }
            })
        }
    }

}