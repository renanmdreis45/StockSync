package com.renanmdreis.stocksync.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.renanmdreis.stocksync.app.core.enums.SyncStatus

@Entity(tableName = "material")
data class Material(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val code: String,

    val name: String,

    val description: String? = null,

    val quantity: Int,

    val minimumStock: Int,

    val unit: String,

    val location: String,

    val lastUpdated: Long = System.currentTimeMillis(),

    val syncStatus: SyncStatus = SyncStatus.SYNCED,

    val serverId: Long? = null,

    val version: Int = 1,

    val isDeleted: Boolean = false,
)
