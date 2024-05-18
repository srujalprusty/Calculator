package com.srujal.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {

    var state by mutableStateOf(CalculatorState())
    private set

    fun  onAction(action:CalculateActions){
        when(action){
            is CalculateActions.Number -> enterNumber(action.number)
            is CalculateActions.Decimal -> enterDecimal()
            is CalculateActions.Clear -> state = CalculatorState()
            is CalculateActions.Operations -> enterOperation(action.operation)
            is CalculateActions.Calculate -> performCalculator()
            is CalculateActions.Delete -> performDelete()
        }
    }




    private fun enterOperation(operation: CalculateOperation) {
        if (state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }



    private fun performCalculator() {

          val number1 = state.number1.toDoubleOrNull()
          val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null){
        val result = when(state.operation) {

            is CalculateOperation.Add -> number1 + number2
            is CalculateOperation.Substact -> number1 - number2
            is CalculateOperation.Multiply -> number1 * number2
            is CalculateOperation.Divide -> number1 / number2
            null -> return
        }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )

        }



    }

    private fun performDelete() {
       when{
           state.number2.isNotBlank() -> state = state.copy(
               number2 = state.number2.dropLast(1)
           )
           state.operation != null -> state = state.copy(
               operation = null
           )
           state.number1.isNotBlank() -> state= state.copy(
               number1 = state.number1.dropLast(1)
           )
       }
    }





    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()){
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()){
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if (state.operation == null){
            if(state.number1.length >= MAX_NUM_LENGTH){
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
             if(state.number2.length >= MAX_NUM_LENGTH){
                return
            }
            state = state.copy(
                number2 = state.number2 + number
            )
        }



    companion object{
        private const val MAX_NUM_LENGTH = 8
    }

}








