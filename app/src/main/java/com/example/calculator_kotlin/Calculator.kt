package com.example.calculator_kotlin

class Calculator() {
    fun addOperation(num1 : Double, num2 : Double, addoperation:AddOperation): Double {
        return addoperation.operate(num1,num2)
    }

    fun substractOperation(num1 : Double, num2 : Double, substractOperation: SubstractOperation) : Double {
        return substractOperation.operate(num1,num2)
    }

    fun multiplyOperation(num1 : Double, num2 : Double, multiplyOperation: MultiplyOperation) : Double {
        return multiplyOperation.operate(num1,num2)
    }

    fun divideOperation(num1 : Double, num2 : Double, divideOperation: DivideOperation) : Double {
        return divideOperation.operate(num1,num2)
    }
}