package com.example.prak9.view

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.prak9.R
import com.example.prak9.modeldata.DataSiswa

@Composable
fun DetailDataSiswa(
    siswa: DataSiswa, modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_medium)), colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ) { Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_medium)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium))
    ) {
        BarisDetailData(
            labelResID = R.string.nama1,
            itemDetail = siswa.nama,
            modifier = Modifier.padding(
                horizontal = dimensionResource(
                    R.dimen.padding_medium
                )
            )
        )
        BarisDetailData(
            labelResID = R.string.alamat1,
            itemDetail = siswa.alamat,
            modifier = Modifier.padding(
                horizontal = dimensionResource(
                    R.dimen.padding_medium
                )
            )
        )
        BarisDetailData(
            labelResID = R.string.telpon1,
            itemDetail = siswa.telpon,
            modifier = Modifier.padding(
                horizontal = dimensionResource(
                    R.dimen.padding_medium
                )
            )
        )
    } }
}

@Composable
fun BarisDetailData(
    @StringRes labelResID: Int, itemDetail: String, modifier: Modifier = Modifier
){
    Row(modifier = modifier) {
        Text(stringResource(labelResID))
        Spacer(modifier = Modifier.weight(1f))
        Text(itemDetail, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun DeleteConfirmationDialog(
    onDeleteConfirm: () -> Unit,
    onDeleteCancel:() -> Unit,
    modifier: Modifier = Modifier
){
    AlertDialog(onDismissRequest = {},
        title = { Text(stringResource(R.string.attention)) },
        text = {Text(stringResource(R.string.tanya))},
        modifier = modifier,
        dismissButton = {
            TextButton(onClick = onDeleteCancel) {
                Text(stringResource(R.string.no))
            }
        },
        confirmButton = {
            TextButton(onClick = onDeleteConfirm) {
                Text(stringResource(R.string.yes))
            }
        })
}