package mx.kodemia.tallergit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Login : AppCompatActivity() {

    lateinit var til_login:TextInputLayout
    lateinit var tiet_login:TextInputEditText
    lateinit var til_pass:TextInputLayout
    lateinit var tiet_pass:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        til_login = findViewById(R.id.til_login_usuario)
        tiet_login = findViewById(R.id.tiet_user)
        til_pass = findViewById(R.id.til_login_contrasena)
        tiet_pass = findViewById(R.id.tiet_password)

        setValidationListener(til_login, tiet_login)
        setValidationListener(til_pass, tiet_pass)
    }

    private fun setValidationListener(til: TextInputLayout, tiet: TextInputEditText) {
        tiet.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(txt: Editable?) {
                if (txt.toString().isEmpty()) {
                    til.error = applicationContext.resources.getString(R.string.require_field)
                } else {
                    til.isErrorEnabled = false
                    til.error = ""
                }
            }
        })
    }
}