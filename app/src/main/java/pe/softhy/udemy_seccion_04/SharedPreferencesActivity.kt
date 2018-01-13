package pe.softhy.udemy_seccion_04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_shared_preferences.*
import pe.softhy.udemy_seccion_04.app.preferences

class SharedPreferencesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        preferences.name = ""
        btnSharedPreferences.setOnClickListener {
            setValuesSharedPreferences();
            cleanEditText();
            getValuesSharedPreferences();
        }
        getValuesSharedPreferences()
    }

    private fun getValuesSharedPreferences() {
        "Entro al get".log()
        if(preferences.name.isNotEmpty() && preferences.age >= 0) {
            "Entro al if correcto".log()
            txtvShared.text = "Bienvenido ${preferences.name}, tu edad es ${preferences.age}"
        }
        else {
            "Entro al if incorrecto".log()
            txtvShared.text = "No es ta registrado"
        }
    }

    private fun setValuesSharedPreferences() {
        "Entro al set".log()
        if(!etxtNombre.text.toString().trim().isNullOrEmpty() && !etxtEdad.text.toString().trim().isNullOrEmpty()) {
            "Entro al if del set".log()
            preferences.name = getText(etxtNombre)
            preferences.age  = getText(etxtEdad).toInt()
            ToastLong("Se registró correctamente")
        }
    }

    private fun cleanEditText() {
        clear(etxtNombre)
        clear(etxtEdad)

    }
}
