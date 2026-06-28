package com.renanmdreis.stocksync.app.data.local.converter

import androidx.room.TypeConverter
import com.renanmdreis.stocksync.app.core.enums.SyncStatus

class Converters {

    @TypeConverter
    fun fromSyncStatus(syncStatus: SyncStatus): String {
        return syncStatus.name
    }

    @TypeConverter
    fun toSyncStatus(value: String): SyncStatus {
        return SyncStatus.valueOf(value)
    }
}