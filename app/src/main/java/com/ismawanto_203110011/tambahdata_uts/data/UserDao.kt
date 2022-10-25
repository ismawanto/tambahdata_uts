package com.ismawanto_203110011.tambahdata_uts.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ismawanto_203110011.tambahdata_uts.model.User

// TODO 1: Kelas utama untuk menentukan interaksi database.
@Dao
interface UserDao {

    //Untuk implementasi metode akan memasukkan parameternya ke dalam database.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    //Untuk metode dalam kelas beranotasi sebagai metode pembaruan.
    @Update
    suspend fun updateUser(user: User)

    //Untuk implementasi metode menghapus parameternya dari database.
    @Delete
    suspend fun deleteUser(user: User)

    //Digunakan  untuk delete user
    @Query("DELETE FROM user_table")
    suspend fun deleteAllUsers()

    //Untuk menyimpulkan konten oleh room dari tipe pengembalian.
    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

}