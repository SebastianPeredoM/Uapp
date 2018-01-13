package pe.softhy.udemy_seccion_04

import android.app.Activity
import android.support.design.widget.Snackbar
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast

/**
 * Created by SONY VAIO 15TS on 23/12/2017.
 */
fun Activity.ToastShort(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
fun Activity.ToastLong(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun getText(texto: EditText?): String {
    texto?.let {
        return texto.text.toString()
    }
    return ""
}

fun clear(texto: EditText) {
    texto.text.clear()
}

fun String.log() {
    Log.i("lOG-SISTEMA", this)
}

// De la clase

fun Int.isNatural() = this >= 0

fun Activity.Toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Activity.snackBar(message: CharSequence,
                      view: View? = findViewById(R.id.ext_fun_layout),
                      duration: Int = Snackbar.LENGTH_SHORT, action: String? = null,
                      actionEvt: (v: View) -> Unit = { }) {
    view?.let {
        "Entro al let".log()
        val snackBar = Snackbar.make(view, message, duration)

        if(!action.isNullOrEmpty()) {
            snackBar.setAction(action, actionEvt)
        }
        snackBar.show()
    }
}

fun ViewGroup.inflate(layoutId: Int) = LayoutInflater.from(context).inflate(layoutId, this, false)