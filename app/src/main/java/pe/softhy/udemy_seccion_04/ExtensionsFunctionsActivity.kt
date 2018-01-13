package pe.softhy.udemy_seccion_04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_extensions_functions.*

class ExtensionsFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extensions_functions)

        btnToast.setOnClickListener { Toast("Toast con extensions functions") }
        btnSnackBar.setOnClickListener { snackBar("I love extension functions!", action= "x") { Toast("Undo") } }
        btnLoadByUrl.setOnClickListener {  }
        btnGoToAcivity.setOnClickListener {  }
    }
}
