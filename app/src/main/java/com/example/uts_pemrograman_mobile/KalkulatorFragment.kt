package com.example.uts_pemrograman_mobile

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlin.math.sqrt

class KalkulatorFragment : Fragment(R.layout.fragment_kalkulator) {

    private lateinit var tvResult: TextView
    private var currentNumber: String = "" // Angka yang sedang diketik
    private var operand1: Double = 0.0      // Angka pertama yang disimpan
    private var lastOperation: String = "" // Operator terakhir (+, -, *, /)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvResult = view.findViewById(R.id.tvResult)

        // --- Hubungkan Listeners ---

        // Tombol Angka (Misalnya btn_0, btn_1, dst. - Anda harus menghubungkan semua 10 tombol)
        view.findViewById<Button>(R.id.btn_0)?.setOnClickListener { appendNumber("0") }
        view.findViewById<Button>(R.id.btn_1)?.setOnClickListener { appendNumber("1") }
        view.findViewById<Button>(R.id.btn_2)?.setOnClickListener { appendNumber("2") }
        view.findViewById<Button>(R.id.btn_3)?.setOnClickListener { appendNumber("3") }
        view.findViewById<Button>(R.id.btn_4)?.setOnClickListener { appendNumber("4") }
        view.findViewById<Button>(R.id.btn_5)?.setOnClickListener { appendNumber("5") }
        view.findViewById<Button>(R.id.btn_6)?.setOnClickListener { appendNumber("6") }
        view.findViewById<Button>(R.id.btn_7)?.setOnClickListener { appendNumber("7") }
        view.findViewById<Button>(R.id.btn_8)?.setOnClickListener { appendNumber("8") }
        view.findViewById<Button>(R.id.btn_9)?.setOnClickListener { appendNumber("9") }
        // Tombol Operasi Dasar
        view.findViewById<Button>(R.id.btn_plus)?.setOnClickListener { setOperation("+") }
        view.findViewById<Button>(R.id.btn_minus)?.setOnClickListener { setOperation("-") }
        view.findViewById<Button>(R.id.btn_multiply)?.setOnClickListener { setOperation("*") }
        view.findViewById<Button>(R.id.btn_divide)?.setOnClickListener { setOperation("/") }

        // Tombol Perhitungan Khusus
        view.findViewById<Button>(R.id.btn_square)?.setOnClickListener { calculateSquare() }
        view.findViewById<Button>(R.id.btn_sqrt)?.setOnClickListener { calculateSquareRoot() }

        // Tombol Aksi
        view.findViewById<Button>(R.id.btn_equal)?.setOnClickListener { performCalculation() }
        view.findViewById<Button>(R.id.btn_clear)?.setOnClickListener { clearAll() }

        updateDisplay()
    }

    private fun updateDisplay() {
        if (currentNumber.isEmpty()) {
            tvResult.text = "0"
        } else {
            tvResult.text = currentNumber
        }
    }

    private fun appendNumber(number: String) {
        currentNumber += number
        updateDisplay()
    }

    private fun setOperation(operation: String) {
        if (currentNumber.isNotEmpty()) {
            operand1 = currentNumber.toDouble()
            lastOperation = operation
            currentNumber = ""
        }
    }

    private fun performCalculation() {
        if (currentNumber.isNotEmpty() && lastOperation.isNotEmpty()) {
            val operand2 = currentNumber.toDouble()
            val result = when (lastOperation) {
                "+" -> operand1 + operand2
                "-" -> operand1 - operand2
                "*" -> operand1 * operand2
                "/" -> if (operand2 != 0.0) operand1 / operand2 else {
                    Toast.makeText(context, "Error: Divide by zero", Toast.LENGTH_SHORT).show()
                    clearAll(); return
                }
                else -> 0.0
            }
            currentNumber = result.toString()
            lastOperation = ""
            updateDisplay()
        }
    }

    private fun calculateSquare() { // Operasi Kuadrat
        if (currentNumber.isNotEmpty()) {
            val num = currentNumber.toDouble()
            currentNumber = (num * num).toString()
            updateDisplay()
        }
    }

    private fun calculateSquareRoot() { // Operasi Akar Kuadrat
        if (currentNumber.isNotEmpty()) {
            val num = currentNumber.toDouble()
            if (num >= 0) {
                currentNumber = sqrt(num).toString()
                updateDisplay()
            } else {
                Toast.makeText(context, "Error: Invalid input", Toast.LENGTH_SHORT).show()
                clearAll()
            }
        }
    }

    private fun clearAll() {
        currentNumber = ""
        lastOperation = ""
        operand1 = 0.0
        updateDisplay()
    }
}