package com.renanmdreis.stocksync.app.data.local.dao

import androidx.room.*
import com.renanmdreis.stocksync.app.data.local.entity.Material

interface MaterialDao {
    @Insert
    fun insert(vararg  material: Material)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg materials: List<Material>)

    @Delete
    fun delete(material: Material)

    @Query("SELECT * FROM material")
    fun getAll(): List<Material>

    @Query("SELECT * FROM material WHERE id = :id")
    fun getById(id: Long): Material?

    @Query("DELETE FROM material")
    suspend fun deleteAll()

}