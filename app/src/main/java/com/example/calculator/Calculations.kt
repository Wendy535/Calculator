package com.example.calculator

import kotlin.math.pow
import kotlin.math.roundToInt

object Calculations {

    private const val EMPTY_STRING = ""
    private const val PLUS = "addition"
    private const val MINUS = "decrease"
    private const val MULT = "multiply"
    private const val DIVIDE = "division"
    private const val ROOT = "root"
    private const val POWER = "power"

    private var currentEquation = ""
    private var currentResult = ""
    private var inMemory = ""
    private var numberArray: ArrayList<String> = ArrayList()

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
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
            numberArray.add(PLUS)
            currentEquation = EMPTY_STRING
        }
    }

    fun minus() {
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
            numberArray.add(MINUS)
            currentEquation = EMPTY_STRING
        }
    }

    fun mult() {
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
            numberArray.add(MULT)
            currentEquation = EMPTY_STRING
        }
    }

    fun divide() {
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
            numberArray.add(DIVIDE)
            currentEquation = EMPTY_STRING
        }
    }

    fun root() {
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
            numberArray.add(ROOT)
            currentEquation = EMPTY_STRING
        }
    }

    fun power() {
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
            numberArray.add(POWER)
            currentEquation = EMPTY_STRING
        }
    }

    private fun calcPlus(x: Double, y: Double): String {
        return (x+y).toString()
    }

    private fun calcMinus(x: Double, y: Double): String {
        return (x - y).toString()
    }

    private fun calcMult (x: Double, y: Double) : String {
        return (x * y).toString()

    }

    private fun calcDivide (x: Double, y: Double) : String {
        return (x/y).toString()
    }

    private fun calcRoot (x: Double, y: Double) : String {
        return x.pow(1/y).toString()
    }

    private fun calcPower(x: Double, y: Double) : String {
        return x.pow(y).toString()
    }

    fun calculate(): String {
        currentResult = numberArray[0]
        if (currentEquation != EMPTY_STRING) {
            numberArray.add(currentEquation)
        }

        for (x in 0 until numberArray.size) {
            when (numberArray[x]) {
                PLUS -> currentResult = calcPlus(currentResult.toDouble(), numberArray[x + 1].toDouble())
                MINUS -> currentResult = calcMinus(currentResult.toDouble(), numberArray[x + 1].toDouble())
                MULT -> currentResult = calcMult(currentResult.toDouble(), numberArray[x + 1].toDouble())
                DIVIDE -> currentResult = calcDivide(currentResult.toDouble(), numberArray[x + 1].toDouble())
                ROOT -> currentResult = calcRoot(currentResult.toDouble(), numberArray[x + 1].toDouble())
                POWER -> currentResult = calcPower(currentResult.toDouble(), numberArray[x + 1].toDouble())
            }
        }
        val text = currentResult.substringAfter('.')
        for (x in text) {
            if (x == '0') {
                currentResult = currentResult.substringBefore('.')
            } else {
                if (text.length > 10) {
                    currentResult = currentResult.toDouble().roundToInt().toString()
                }
            }
        }
        numberArray.clear()
        return currentResult
    }
}