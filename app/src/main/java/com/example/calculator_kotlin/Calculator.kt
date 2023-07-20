package com.example.calculator_kotlin

class Calculator() {
    fun operate(num1 : Double, num2 : Double, num3 : Double, operation1: Operation, operation2: Operation): Double {
        var firstOperation =  operation1.operate(num1,num2)
        return operation2.operate(firstOperation,num3)
    }

    fun operate(inputs: List<Double>, operations: List<Operation>): Double {
        val newInputs = inputs.toMutableList()
        val newOperations = operations.toMutableList()

        while (newOperations.find {
                it is MultiplyOperation || it is DivideOperation
            } != null) {
            val operation = newOperations.find {
                it is MultiplyOperation || it is DivideOperation
            } ?: break
            val index = newOperations.indexOf(operation)
            newInputs[index] = operation.operate(newInputs[index], newInputs[index + 1])
            newInputs.removeAt(index + 1)
            newOperations.removeAt(index)
            println("newInputs >>> $newInputs")
        }

        while (newOperations.find {
                it is SubtractOperation || it is AddOperation
            } != null) {
            val operation = newOperations.find {
                it is SubtractOperation || it is AddOperation
            } ?: break
            val index = newOperations.indexOf(operation)
            newInputs[index] = operation.operate(newInputs[index], newInputs[index + 1])
            newInputs.removeAt(index + 1)
            newOperations.removeAt(index)
            println("newInputs2 >>> $newInputs")
        }

        return newInputs[0]
    }
}

