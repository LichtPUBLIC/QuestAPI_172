package com.example.prak9.uicontroller.route

import com.example.prak9.R

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}