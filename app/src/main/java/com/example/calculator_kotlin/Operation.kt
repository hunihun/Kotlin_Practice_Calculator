package com.example.calculator_kotlin

abstract class Operation {
    abstract fun operate(num1: Double, num2: Double) : Double
}