package pe.softhy.udemy_seccion_04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onBackPressed() {
        if(exitEnabled)
            super.onBackPressed()
        exitEnabled = true
        ToastLong("Click back again to exit this screen")
        Handler().postDelayed(Runnable { exitEnabled = false }, 2000)

    }
}
