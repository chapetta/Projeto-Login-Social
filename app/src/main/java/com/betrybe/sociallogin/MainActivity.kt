package com.betrybe.sociallogin

import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var email: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var button: Button
    private lateinit var invalidEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email_text_input_layout)
        password = findViewById(R.id.password_text_input_layout)
        button = findViewById(R.id.login_button)
        email.helperText = null
        password.helperText = null


        email.editText?.addTextChangedListener{
            validateInputs()
        }

        password.editText?.addTextChangedListener {
            validateInputs()
        }

        button.setOnClickListener{
            val inputEmail = email.editText?.text.toString().trim()
            val inputPassword = password.editText?.text.toString().trim()
            if (isEmailValid(inputEmail)) {
                email.helperText = null
            } else {
                email.helperText = getString(R.string.email_warning)
            }
            if (inputPassword.length < 4) {
                password.helperText = getString(R.string.password_warning)
            } else {
                password.helperText = null
            }
            validateInputs()
            sucessfulLogin()

        }

    }
    private fun validateInputs () {
        val inputEmail = email.editText?.text.toString().trim()
        val inputPassowrd = password.editText?.text.toString().trim()

        button.isEnabled = inputEmail.isNotEmpty() && inputPassowrd.isNotEmpty()
    }

    private fun isEmailValid(email: String): Boolean {
        val regex = Regex("^[A-Za-z0-9._-]+@[A-Za-z]+\\.[A-Za-z]+\$")

        return regex.matches(email)
    }

    private fun sucessfulLogin() {
        Snackbar.make(button, getString(R.string.login_succeeded), Snackbar.LENGTH_LONG).show()
    }

}
