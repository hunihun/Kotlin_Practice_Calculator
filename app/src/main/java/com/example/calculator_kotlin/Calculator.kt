package com.example.calculator_kotlin

class Calculator(num1 : Int, num2 : Int) {
    var num1 = 0
    var num2 = 0
    init {
        this.num1 = num1
        this.num2 = num2
    }
    fun add() : Int {
        return num1 + num2
    }
    fun subtraction() : Int {
        return num1 - num2
    }
    fun multiply() : Int {
        return num1 * num2
    }
    fun divide() : Int {
        return num1 / num2
    }
    fun remainder() : Int {
        return num1%num2
    }
}