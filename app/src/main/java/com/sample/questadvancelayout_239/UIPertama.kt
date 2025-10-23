package com.sample.questadvancelayout_239

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
@composable
fun ActivitasPertama(modifier: Modifier){
    Column { modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally ){
        Text(text = stringResource(id = R.string.prodi),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold)
    }
}

class UIPertama {
}