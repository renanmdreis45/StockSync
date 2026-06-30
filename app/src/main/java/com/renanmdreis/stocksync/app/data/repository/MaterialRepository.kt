package com.renanmdreis.stocksync.app.data.repository

import com.renanmdreis.stocksync.app.data.local.dao.MaterialDao
import com.renanmdreis.stocksync.app.data.local.entity.Material
import kotlinx.coroutines.flow.Flow

class MaterialRepository (
    private val materialDao: MaterialDao,
) {
   fun getAllMaterials(): Flow<List<Material>> {
        return materialDao.getAll()
    }

    suspend fun insertMaterial(material: Material) {
        materialDao.insert(material)
    }

    suspend fun updateMaterial(material: Material) {
        materialDao.update(material)
    }

    suspend fun deleteMaterial(material: Material) {
        materialDao.delete(material)
    }
}
