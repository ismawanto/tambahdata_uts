package com.ismawanto_203110011.tambahdata_uts.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

// TODO 4: Untuk menjalankan input kolom nama user.
@Parcelize
@Entity(tableName = "user_table")

//Pada kelas memiliki tabel SQLite pemetaan dalam database.
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
): Parcelable