package mx.kodemia.tallergit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Login : AppCompatActivity() {
    private lateinit var btnIniciarSesion: Button
    private lateinit var tilLoginUsuario: TextInputLayout
    private lateinit var tilLoginContrasena: TextInputLayout
    private lateinit var tietLoginUsuario: TextInputEditText
    private lateinit var tietLoginContrasena: TextInputEditText
    private lateinit var textoUsuario: String
    private lateinit var textoPsw: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
        iniciarSesion()
    }
    fun init(){
        btnIniciarSesion = findViewById(R.id.btn_login_ingresar)
        tilLoginUsuario = findViewById(R.id.til_login_usuario)
        tilLoginContrasena = findViewById(R.id.til_login_contrasena)
        tietLoginUsuario = findViewById(R.id.tiet_usuario)
        tietLoginContrasena = findViewById(R.id.tiet_contrasena)
        textoUsuario = ""
        textoPsw = ""
    }

    fun iniciarSesion(){
        btnIniciarSesion.setOnClickListener {
            textoUsuario = tilLoginUsuario.editText?.text?.trim().toString()
            textoPsw = tilLoginContrasena.editText?.text?.trim().toString()
            if(textoUsuario.isNotEmpty() && textoUsuario.isNotBlank() &&
                textoPsw.isNotEmpty() && textoPsw.isNotBlank()){
                if (validarCorreo() && validarContrasena()){
                    startActivity(Intent(this,MainActivity::class.java))
                }
            }else{
                Toast.makeText(this, R.string.campo_vacio, Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun validarCorreo(): Boolean{
        return if(tietLoginUsuario.text.toString().trim().isEmpty()){
            tietLoginUsuario.error = getString(R.string.campo_vacio)
            false
        }else{
            if (android.util.Patterns.EMAIL_ADDRESS.matcher(tietLoginUsuario.text.toString()).matches()){
                tilLoginUsuario.isErrorEnabled = false
                true
            }else{
                tilLoginUsuario.error = getString(R.string.error_correo)
                false
            }
        }
    }

    private fun validarContrasena(): Boolean{
        return if(tietLoginContrasena.text.toString().trim().isEmpty()){
            tietLoginContrasena.error = getString(R.string.campo_vacio)
            false
        }else{
            true
        }
    }
}