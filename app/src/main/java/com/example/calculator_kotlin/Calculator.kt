package com.example.calculator_kotlin

class Calculator() {
    fun operate(num1 : Double, num2 : Double, num3 : Double, operation1: Operation, operation2: Operation): Double {
        var firstOperation =  operation1.operate(num1,num2)
        return operation2.operate(firstOperation,num3)
    }
}
