package com.betrybe.sociallogin

import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var email: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email_text_input_layout)
        password = findViewById(R.id.password_text_input_layout)
        button = findViewById(R.id.login_button)

        email.editText?.addTextChangedListener{
            validateInputs()
        }

        password.editText?.addTextChangedListener {
            validateInputs()
        }

    }
    private fun validateInputs () {
        val inputEmail = email.editText?.text.toString().trim()
        val inputPassowrd = password.editText?.text.toString().trim()

        button.isEnabled = inputEmail.isNotEmpty() && inputPassowrd.isNotEmpty()
    }

}
