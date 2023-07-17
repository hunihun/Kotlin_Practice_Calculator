package com.example.calculator_kotlin

fun main() {

    println("2개의 숫자(정수)를 입력하세요")

    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    var calculator = Calculator(num1, num2)

    println("연산을 선택하세요")
    println("1. 덧셈")
    println("2. 뺄셈")
    println("3. 곱셈")
    println("4. 나눗셈")
    println("5. 나머지")

    var operation = readLine()!!.toInt()

    when(operation) {
        1 -> {
            println(calculator.add())
        }
        2 -> {
            println(calculator.subtraction())
        }
        3 -> {
            println(calculator.multiply())
        }
        4 -> {
            println(calculator.divide())
        }
        5 -> {
            println(calculator.remainder())
        }
        else -> {
            println("올바른 번호를 입력하세요.")
        }
    }

}
