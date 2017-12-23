package pe.softhy.udemy_seccion_04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

open class LifeCycleEventsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ToastLong("onCreate")
    }

    override fun onStart() {
        super.onStart()
        ToastLong("onStart")
    }

    override fun onResume() {
        super.onResume()
        ToastLong("onResume")
    }

    override fun onPause() {
        super.onPause()
        ToastLong("onPause")
    }

    override fun onStop() {
        super.onStop()
        ToastLong("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        ToastLong("onDestroy")
    }
}
