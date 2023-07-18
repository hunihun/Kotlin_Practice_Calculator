package com.example.calculator_kotlin

class SubtractOperation : Operation(){
    override fun operate(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}