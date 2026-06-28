package com.renanmdreis.stocksync.app.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.renanmdreis.stocksync.app.data.local.converter.Converters
import com.renanmdreis.stocksync.app.data.local.dao.MaterialDao
import com.renanmdreis.stocksync.app.data.local.entity.Material


@Database(
    entities = [Material::class],
    version = 1,
    exportSchema = true,
)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun materialDao(): MaterialDao
}