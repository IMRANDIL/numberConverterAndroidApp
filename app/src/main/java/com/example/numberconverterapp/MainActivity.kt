// MainActivity.kt
package com.example.numberconverterapp

import android.content.*
import android.os.Bundle
import android.os.Environment
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var inputEditText: EditText
    private lateinit var convertButton: Button
    private lateinit var outputTextView: TextView
    private lateinit var copyButton: Button
    private lateinit var exportButton: Button
    private lateinit var clearButton: Button
    private lateinit var themeToggle: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputEditText = findViewById(R.id.inputEditText)
        convertButton = findViewById(R.id.convertButton)
        outputTextView = findViewById(R.id.outputTextView)
        copyButton = findViewById(R.id.copyButton)
        exportButton = findViewById(R.id.exportButton)
        clearButton = findViewById(R.id.clearButton)
        themeToggle = findViewById(R.id.themeToggle)

        // Theme Toggle
        val isNightMode = AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES
        themeToggle.isChecked = isNightMode

        themeToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        convertButton.setOnClickListener {
            val input = inputEditText.text.toString()
            val formatted = formatNumbers(input)
            outputTextView.text = formatted
        }

        copyButton.setOnClickListener {
            val output = outputTextView.text.toString()
            if (output.isNotEmpty()) {
                copyToClipboard(output)
            } else {
                toast("No output to copy.")
            }
        }

        exportButton.setOnClickListener {
            val output = outputTextView.text.toString()
            if (output.isNotEmpty()) {
                exportToFile(output)
            } else {
                toast("No output to export.")
            }
        }

        clearButton.setOnClickListener {
            inputEditText.text.clear()
            outputTextView.text = ""
            toast("Cleared input and output")
        }
    }

    private fun formatNumbers(input: String): String {
        return input
            .replace(",", " ")
            .split(Regex("\\s+|\\n+"))
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .joinToString(", ") { "'$it'" }
    }

    fun openGitHub(view: android.view.View) {
        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://github.com/IMRANDIL"))
        startActivity(intent)
    }

    private fun copyToClipboard(text: String) {
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Converted Numbers", text)
        clipboard.setPrimaryClip(clip)
        toast("Copied to clipboard")
    }

    private fun exportToFile(text: String) {
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val fileName = "converted_numbers_${timeStamp}.txt"
        val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val file = File(downloadsDir, fileName)

        try {
            FileOutputStream(file).use { stream ->
                stream.write(text.toByteArray())
            }
            toast("Exported to: Downloads/${fileName}")
        } catch (e: Exception) {
            e.printStackTrace()
            toast("Failed to export file")
        }
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
