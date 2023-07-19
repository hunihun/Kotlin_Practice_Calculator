package com.example.calculator_kotlin

fun main() {
    while (true) {
        println("첫 번째 숫자를 입력하세요.")
        var n1 = readLine()!!.toDouble()
        chooseOperation()
        var operation1 = readLine()
        println("두 번째 숫자를 입력하세요.")
        var n2 = readLine()!!.toDouble()
        chooseOperation()
        var operation2 = readLine()
        println("세 번째 숫자를 입력하세요.")
        var n3 = readLine()!!.toDouble()

        var calc = Calculator()

        if (operation2 == "1") {
            when (operation1) {
                "1" -> println(calc.operate(n1, n2, n3, AddOperation(), AddOperation()))
                "2" -> println(calc.operate(n1, n2, n3, SubtractOperation(), AddOperation()))
                "3" -> println(calc.operate(n1, n2, n3, MultiplyOperation(), AddOperation()))
                "4" -> println(calc.operate(n1, n2, n3, DivideOperation(), AddOperation()))
                else -> println("올바른 연산을 입력하세요.")
            }
        } else if (operation2 == "2") {
            when (operation1) {
                "1" -> println(calc.operate(n1, n2, n3, AddOperation(), SubtractOperation()))
                "2" -> println(calc.operate(n1, n2, n3, SubtractOperation(), SubtractOperation()))
                "3" -> println(calc.operate(n1, n2, n3, MultiplyOperation(), SubtractOperation()))
                "4" -> println(calc.operate(n1, n2, n3, DivideOperation(), SubtractOperation()))
                else -> println("올바른 연산을 입력하세요.")
            }
        } else if (operation2 == "3") {
            when (operation1) {
                "1" -> println(calc.operate(n2, n3, n1, MultiplyOperation(), AddOperation()))
                "2" -> println(-(calc.operate(n2, n3, n1, MultiplyOperation(), SubtractOperation())))
                "3" -> println(calc.operate(n1, n2, n3, MultiplyOperation(), MultiplyOperation()))
                "4" -> println(calc.operate(n1, n2, n3, DivideOperation(), MultiplyOperation()))
                else -> println("올바른 연산을 입력하세요.")
            }
        } else if (operation2 == "4") {
            when (operation1) {
                "+" -> println(calc.operate(n2, n3, n1, DivideOperation(), AddOperation()))
                "-" -> println(-(calc.operate(n2, n3, n1, DivideOperation(), SubtractOperation())))
                "*" -> println(calc.operate(n1, n2, n3, MultiplyOperation(), DivideOperation()))
                "/" -> println(calc.operate(n1, n2, n3, DivideOperation(), DivideOperation()))
                else -> println("올바른 연산을 입력하세요.")
            }
        }
        else {
            println("올바른 연산을 입력하세요.")
        }
    }
}
private fun chooseOperation() {
    println("연산을 숫자로 입력하세요.")
    println("1. +")
    println("2. -")
    println("3. *")
    println("4. /")
}
