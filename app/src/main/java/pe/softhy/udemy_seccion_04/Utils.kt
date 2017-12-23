package pe.softhy.udemy_seccion_04

import android.app.Activity
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