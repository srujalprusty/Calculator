package com.srujal.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonspacing: Dp = 8.dp,
    onAction: (CalculateActions) -> Unit

){
    Box(modifier = modifier){

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonspacing)

        ) {
            Text(
                text = state.number1 + (state.operation?.Symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 45.dp),
                 fontSize = 70.sp ,
                color = Color.White,
                maxLines = 2
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonspacing)
            ){
                CalculatorButtom(
                    symbol = "AC",
                      modifier = Modifier
                          .background(Color.LightGray)
                          .aspectRatio(2f)
                          .weight(2f),
                    onCLick = {
                        onAction(CalculateActions.Clear)
                    }
                )
                CalculatorButtom(
                    symbol = "DEL",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Delete)
                    }
                )
                CalculatorButtom(
                    symbol = "/",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Operations(CalculateOperation.Divide))
                    }
                )


            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonspacing)
            ){
                CalculatorButtom(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(7))
                    }
                )
                CalculatorButtom(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(8))

                    }
                )
                CalculatorButtom(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(9))
                    }
                )
                CalculatorButtom(
                    symbol = "*",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Operations(CalculateOperation.Multiply))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonspacing)
            ){
                CalculatorButtom(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(4))
                    }
                )
                CalculatorButtom(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(5))
                    }
                )
                CalculatorButtom(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(6))
                    }
                )
                CalculatorButtom(
                    symbol = "-",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Operations(CalculateOperation.Substact))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonspacing)
            ){
                CalculatorButtom(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(1))
                    }
                )
                CalculatorButtom(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(2))
                    }
                )
                CalculatorButtom(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Number(3))
                    }
                )
                CalculatorButtom(
                    symbol = "+",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Operations(CalculateOperation.Add))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonspacing)
            ){
                CalculatorButtom(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onCLick = {
                        onAction(CalculateActions.Number(0))
                    }
                )
                CalculatorButtom(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Decimal)
                    }
                )
                CalculatorButtom(
                    symbol = "=",
                    modifier = Modifier
                        .background(Color.Cyan)
                        .aspectRatio(1f)
                        .weight(1f),
                    onCLick = {
                        onAction(CalculateActions.Calculate)
                    }
                )
            }



        }

    }
}