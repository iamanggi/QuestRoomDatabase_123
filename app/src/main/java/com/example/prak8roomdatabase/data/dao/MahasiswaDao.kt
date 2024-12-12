package com.example.prak8roomdatabase.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.prak8roomdatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {

    //fungsi get all data
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>

    // get Mahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")  //mengambil data mahasiswa berdasarkan NIM
    fun getMahasiswa(nim: String) : Flow<Mahasiswa>

    //Delete Mahasiswa
    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)  //menghapus data mahasiswa tertentu dari database

    @Insert
    suspend fun InsertMahasiswa(mahasiswa: Mahasiswa)
}