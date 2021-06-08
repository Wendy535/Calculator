package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var textResult: EditText
    private lateinit var buttonClear: Button
    private lateinit var buttonMemory: Button
    private lateinit var buttonInsert: Button
    private lateinit var buttonOne: Button
    private lateinit var buttonTwo: Button
    private lateinit var buttonThree: Button
    private lateinit var buttonFour: Button
    private lateinit var buttonFive: Button
    private lateinit var buttonSix: Button
    private lateinit var buttonSeven: Button
    private lateinit var buttonEight: Button
    private lateinit var buttonNine: Button
    private lateinit var buttonZero: Button
    private lateinit var buttonDot: Button
    private lateinit var buttonEquals: Button
    private lateinit var buttonPlus: Button
    private lateinit var buttonMinus: Button
    private lateinit var buttonDivide: Button
    private lateinit var buttonMultiply: Button
    private lateinit var buttonRoot: Button
    private lateinit var buttonInvolute: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textResult = findViewById(R.id.results)
        textResult.setText("")

        setNumberButtons()
        setMainButtons()
        setOperationsButtons()
        setEquality()

    }

    private fun setNumberButtons() {

        buttonOne = findViewById<Button>(R.id.button_1)
        buttonTwo = findViewById<Button>(R.id.button_2)
        buttonThree = findViewById<Button>(R.id.button_3)
        buttonFour = findViewById<Button>(R.id.button_4)
        buttonFive = findViewById<Button>(R.id.button_5)
        buttonSix = findViewById<Button>(R.id.button_6)
        buttonSeven = findViewById<Button>(R.id.button_7)
        buttonEight = findViewById<Button>(R.id.button_8)
        buttonNine = findViewById<Button>(R.id.button_9)
        buttonZero = findViewById<Button>(R.id.button_zero)
        buttonDot = findViewById<Button>(R.id.button_dot)

        buttonOne.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonOne.text.toString()))
        }

        buttonTwo.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonTwo.text.toString()))
        }

        buttonThree.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonThree.text.toString()))
        }

        buttonFour.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonFour.text.toString()))
        }

        buttonFive.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonFive.text.toString()))
        }

        buttonSix.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonSix.text.toString()))
        }

        buttonSeven.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonSeven.text.toString()))
        }

        buttonEight.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonEight.text.toString()))
        }

        buttonNine.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonNine.text.toString()))
        }

        buttonZero.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonZero.text.toString()))
        }

        buttonDot.setOnClickListener {
            textResult.setText(Calculations.addElement(buttonDot.text.toString()))
        }

    }

    private fun setMainButtons() {
        buttonClear = findViewById<Button>(R.id.button_delete)
        buttonMemory = findViewById<Button>(R.id.button_to_memory)
        buttonInsert = findViewById<Button>(R.id.button_insert )

        buttonClear.setOnClickListener {
            textResult.setText(Calculations.clear())
        }

        buttonMemory.setOnClickListener{
            Calculations.memorize()
        }

        buttonInsert.setOnClickListener {
            textResult.setText(Calculations.insert())
        }

    }

    private fun setOperationsButtons() {
        buttonPlus = findViewById<Button>(R.id.button_plus)
        buttonMinus = findViewById<Button>(R.id.button_minus)
        buttonDivide = findViewById<Button>(R.id.button_divide)
        buttonMultiply = findViewById<Button>(R.id.button_mult)
        buttonRoot = findViewById<Button>(R.id.button_root)
        buttonInvolute = findViewById<Button>(R.id.button_power)

        buttonPlus.setOnClickListener{
            Calculations.plus()
        }

        buttonMinus.setOnClickListener{
            Calculations.minus()
        }

        buttonMultiply.setOnClickListener {
            Calculations.mult()
        }

        buttonDivide.setOnClickListener {
            Calculations.divide()
        }

        buttonRoot.setOnClickListener {
            Calculations.root()
        }

        buttonInvolute.setOnClickListener {
            Calculations.power()
        }
    }

    private fun setEquality() {
        buttonEquals = findViewById<Button>(R.id.button_equals)
        buttonEquals.setOnClickListener {
            textResult.setText(Calculations.calculate())
        }
    }
}