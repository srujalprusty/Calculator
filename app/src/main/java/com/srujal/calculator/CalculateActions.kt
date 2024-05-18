package com.srujal.calculator

sealed class CalculateActions {

    data class Number(val number:Int) : CalculateActions()
    object Clear : CalculateActions()
    object Delete : CalculateActions()
    object Decimal: CalculateActions()
    object Calculate: CalculateActions()

    data class Operations(val operation: CalculateOperation) : CalculateActions()






}