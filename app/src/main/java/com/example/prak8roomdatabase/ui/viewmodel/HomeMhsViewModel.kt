package com.example.prak8roomdatabase.ui.viewmodel

import com.example.prak8roomdatabase.data.entity.Mahasiswa

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)