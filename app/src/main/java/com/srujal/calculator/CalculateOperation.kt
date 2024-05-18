package com.srujal.calculator

sealed class CalculateOperation(val Symbol:String) {

    object Add:CalculateOperation("+")
    object Substact:CalculateOperation("-")
    object Multiply:CalculateOperation("*")
    object Divide:CalculateOperation("/")




}