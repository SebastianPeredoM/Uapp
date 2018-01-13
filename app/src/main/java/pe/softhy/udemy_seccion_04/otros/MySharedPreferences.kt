package pe.softhy.udemy_seccion_04.otros

import android.content.Context

/**
 * Created by SONY VAIO 15TS on 13/01/2018.
 */
class MySharedPreferences(context: Context) {
    // Nombre del fichero shared preferences}
    private val fileName = "Mis preferencias"

    // Instancia del fichero
    private val prefs = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)

    // Cada variable que vamos a guardar en nuestro fichero shared preferences
    var name: String
        get() = prefs.getString("name","")
        set(value) = prefs.edit().putString("name", value).apply()

    var age: Int
        get() = prefs.getInt("age",-1)
        set(value) = prefs.edit().putInt("age", value).apply()
}