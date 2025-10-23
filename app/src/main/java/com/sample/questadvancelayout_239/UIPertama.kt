package com.sample.questadvancelayout_239

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
        Text(text = stringResource(id = R.string.univ),
            fontSize = 20.sp)
            Spacer(modifier = Modifier.height(25.dp))
            Card(modifier = Modifier.fillMaxWidth(fraction = 1f)
            .padding(10.dp),) {
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE0E0E0)
                )){
                Row(modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically){
                    Image(painter = painterResource(id = R.drawable.ic_baseline_school_24),
                        contentDescription = "Icon Pendidikan",
                        modifier = Modifier.size(40.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    Column{
                        Text(text = stringResource(id = R.string.s1),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold)
                        Text(text = stringResource(id = R.string.s2),
                            fontSize = 16.sp)
                        Text(text = stringResource(id = R.string.s3),
                            fontSize = 16.sp)
                    }
                }
            }
    }
}

class UIPertama {
}