package com.renanmdreis.stocksync.app.data.local.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.renanmdreis.stocksync.app.data.local.entity.Material
import kotlinx.coroutines.flow.Flow

interface MaterialDao {
    @Insert
    suspend fun insert(vararg  material: Material)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg materials: List<Material>)

    @Update
    suspend fun update(material: Material)

    @Delete
    suspend fun delete(material: Material)

    @Query("SELECT * FROM material")
    fun getAll(): Flow<List<Material>>

    @Query("SELECT * FROM material WHERE id = :id")
    suspend fun getById(id: Long): Material?

    @Query("DELETE FROM material")
    suspend fun deleteAll()

}