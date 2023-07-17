package com.example.calculator_kotlin

class Calculator() {
    fun operate(num1 : Double, num2 : Double, operation: Operation): Double {
        return operation.operate(num1,num2)
    }
}