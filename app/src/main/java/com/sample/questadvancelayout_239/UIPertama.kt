package com.sample.questadvancelayout_239

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(25.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(fraction = 1f)
                    .padding(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Gray
                )
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.umy),
                        contentDescription = "Icon Pendidikan",
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(id = R.string.alamat),
                            fontSize = 16.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth(fraction = 1f)
                    .padding(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Blue
                )
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.umy),
                        contentDescription = "Icon Card 2",
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama1),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(id = R.string.alamat1),
                            fontSize = 16.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(id = R.string.no1),
                            fontSize = 16.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth(fraction = 1f)
                    .padding(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Green
                )
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.umy),
                        contentDescription = "Icon Card 3",
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama2),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(id = R.string.alamat2),
                            fontSize = 16.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(id = R.string.no2),
                            fontSize = 16.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }

        Text(
            text = stringResource(id = R.string.copy),
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}
