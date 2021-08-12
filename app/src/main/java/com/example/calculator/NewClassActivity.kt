package com.example.calculator;

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R


public class NewClassActivity : AppCompatActivity() {
    private var result: TextView? = null
    private var height: EditText? = null
    private var result_btn: Button? = null
    private var male: Button? = null
    private var female: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result = findViewById(R.id.result)
        height = findViewById(R.id.height)
        result_btn = findViewById(R.id.result_btn)
        male = findViewById(R.id.male)
        female = findViewById(R.id.female)
        val stat = ""
        male?.setOnClickListener(View.OnClickListener { val mal = "m" })
        female?.setOnClickListener(View.OnClickListener { val fem = "f" })
        result_btn?.setOnClickListener(View.OnClickListener {
            if (height?.text.toString().equals("")) Toast.makeText(this@NewClassActivity, R.string.no_user_input, Toast.LENGTH_LONG).show() else {
                val height_info = height?.getText().toString()
            }
        })
    }
}