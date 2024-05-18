package com.srujal.calculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButtom(
    symbol : String ,
    modifier: Modifier,
    onCLick: () -> Unit
){
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable { onCLick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 35.sp,
            color =  Color.White
        )
    }

}