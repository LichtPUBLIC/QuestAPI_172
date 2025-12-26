package com.example.prak9.repositori

import com.example.prak9.modeldata.DataSiswa
import com.example.prak9.apiservice.ServiceApiSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
    suspend fun getSatuSiswa(id:Int) : DataSiswa
    suspend fun editSatuSiswa (id:Int,datasiswa: DataSiswa) : retrofit2.Response<Void>
    suspend fun hapusSatuSiswa (id:Int) : retrofit2.Response<Void>
}