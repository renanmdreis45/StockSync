package com.renanmdreis.stocksync.app.feature.material.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.renanmdreis.stocksync.app.data.local.entity.Material
import com.renanmdreis.stocksync.app.data.repository.MaterialRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MaterialViewModel(
    private val repository: MaterialRepository
) : ViewModel() {

    private val _materials = MutableStateFlow<List<Material>>(emptyList())
    val materials = _materials.asStateFlow()

    init {
        observeMaterials()
    }

    private fun observeMaterials() {
        viewModelScope.launch {
            repository.getAllMaterials()
                .collect {
                    _materials.value = it
                }
        }
    }
}