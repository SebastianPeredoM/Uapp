package pe.softhy.udemy_seccion_04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_click_event.*

class ClickEventActivity : AppCompatActivity(), View.OnLongClickListener {

    // 1) Click en XML
    // 2) Click en linea
    // 3) Click by IDS en 'when'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_event)

        val btn1 = btnMultiple1
        val btn2 = btnMultiple2
        val btn3 = btnMultiple3

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)

        clickInLine()
    }

    /*
    Regla obligatoria para clicks en XMLS:
    El método tiene que ser público. Los nombres tienen que coincidir, y recibe un solo parámetro (View)
     */
    fun xmlClick(view: View) {
        ToastLong("Click by XML")
    }

    fun clickInLine() {
        val btn = findViewById<Button>(R.id.btnClickInLine)
        btn.setOnClickListener { ToastLong("Click in line") }
    }

    override fun onLongClick(view: View): Boolean {
        when(view.id) {
            R.id.btnMultiple1 -> ToastLong("Click multi 1")
            R.id.btnMultiple2 -> ToastLong("Click multi 2")
            R.id.btnMultiple3 -> ToastLong("Click multi 3")
        }
        return true
    }
}