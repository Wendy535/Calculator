package com.example.calculator

import android.view.View
import android.widget.EditText
import kotlin.math.sqrt
import kotlin.math.pow

object Calculations {

    private var currentEquation = ""
    private var currentResult = ""
    private var inMemory = ""
    private var numberArray: ArrayList<String> = ArrayList()
    private var isEmpty = ""
    private var operation = ""

    fun addElement(item: String): String {
        currentEquation += item
        return currentEquation
    }

    fun clear(): String {
        currentEquation = ""
        return currentEquation
    }

    fun memorize() {
        inMemory = currentEquation
    }

    fun insert(): String {
        return inMemory
    }

    fun plus() {
        if (currentEquation != isEmpty) {
            numberArray.add(currentEquation)
            currentEquation = isEmpty
            operation = "addition"
        }
    }

    fun minus() {
        if (currentEquation != isEmpty) {
            numberArray.add(currentEquation)
            currentEquation = isEmpty
            operation = "decrease"
        }
    }

    fun mult() {
        if (currentEquation != isEmpty) {
            numberArray.add(currentEquation)
            currentEquation = isEmpty
            operation = "multiply"
        }
    }

    fun divide() {
        if (currentEquation != isEmpty) {
            numberArray.add(currentEquation)
            currentEquation = isEmpty
            operation = "division"
        }
    }

    fun root() {
            operation = "root"
    }

    fun power() {
        if (currentEquation != isEmpty) {
            numberArray.add(currentEquation)
            currentEquation = isEmpty
            operation = "power"
        }
    }

    fun calculate(): String {
        currentResult = isEmpty
        if (currentEquation != isEmpty) {
            numberArray.add(currentEquation)
            when (operation) {
                "addition" -> currentResult = (numberArray[0].toDouble() + numberArray[1].toDouble()).toString()
                "decrease" -> currentResult = (numberArray[0].toDouble() - numberArray[1].toDouble()).toString()
                "multiply" -> currentResult = (numberArray[0].toDouble() * numberArray[1].toDouble()).toString()
                "division" -> currentResult = (numberArray[0].toDouble() / numberArray[1].toDouble()).toString()
                "root" -> currentResult = (sqrt(numberArray[0].toDouble()).toString())
                "power" -> currentResult = (numberArray[0].toDouble().pow(numberArray[1].toDouble()).toString())
            }
        }
        numberArray.clear()
        return currentResult
    }
}