package com.example.calculator_kotlin

class AddOperation : Operation() {
    override fun operate(num1: Double, num2: Double): Double {
       return num1 + num2
    }
}
