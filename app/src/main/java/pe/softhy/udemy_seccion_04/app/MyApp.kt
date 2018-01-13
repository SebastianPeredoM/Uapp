package pe.softhy.udemy_seccion_04.app

import android.app.Application
import pe.softhy.udemy_seccion_04.otros.MySharedPreferences

/**
 * Created by SONY VAIO 15TS on 13/01/2018.
 */

val preferences: MySharedPreferences by lazy { MyApp.prefs!! }

class MyApp : Application() {

    companion object {
        var prefs: MySharedPreferences? = null
    }

    override fun onCreate() {
        super.onCreate()
        prefs = MySharedPreferences(applicationContext)
    }
}