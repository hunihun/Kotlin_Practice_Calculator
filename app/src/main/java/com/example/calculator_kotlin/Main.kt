package com.example.calculator_kotlin

fun main() {

    println("2개의 숫자를 입력하세요")

    var num1 = readLine()!!.toDouble()
    var num2 = readLine()!!.toDouble()

    println("연산을 선택하세요")
    println("1. 덧셈")
    println("2. 뺄셈")
    println("3. 곱셈")
    println("4. 나눗셈")

    var operation = readLine()!!.toInt()

    var calc = Calculator()

    when(operation) {
        1 -> {
            println(calc.addOperation(num1, num2, AddOperation()))
        }
        2 -> {
            println(calc.substractOperation(num1, num2, SubstractOperation()))
        }
        3 -> {
            println(calc.multiplyOperation(num1, num2, MultiplyOperation()))
        }
        4 -> {
            println(calc.divideOperation(num1, num2, DivideOperation()))
        }
        else -> {
            println("올바른 번호를 입력하세요.")
        }
    }

}
