package pe.softhy.udemy_seccion_04

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLifeCycle          = findViewById<Button>(R.id.buton1)
        val btnClickEvents        = findViewById<Button>(R.id.buton2)
        val btnAndroidExt         = findViewById<Button>(R.id.buton3)
        val btnPicasso            = findViewById<Button>(R.id.buton4)
        val btnListView           = findViewById<Button>(R.id.buton5)
        val btnIntents            = findViewById<Button>(R.id.buton6)
        val btnPermission         = findViewById<Button>(R.id.buton7)
        val btnSharedPreferences  = findViewById<Button>(R.id.buton8)
        val btnExtensionFunctions = findViewById<Button>(R.id.buton9)

        btnLifeCycle.setOnClickListener { goToLifeCycleActivity() }
        btnClickEvents.setOnClickListener { goToClickEventsActivity() }
        btnAndroidExt.setOnClickListener { goToKotlinAndroidExtActivity() }
        btnPicasso.setOnClickListener { goToPicassoActivity() }
        btnListView.setOnClickListener { goToListViewActivity() }
        btnIntents.setOnClickListener { goToIntentsActivity() }
        btnPermission.setOnClickListener { goToPermissionsActivity() }
        btnSharedPreferences.setOnClickListener { goToSharedPreferencesActivity() }
        btnExtensionFunctions.setOnClickListener { goToExtensionsFunctionsActivity() }
    }

    fun showToast() {
        Toast.makeText(this, "Hola chechitar", Toast.LENGTH_SHORT).show()
    }

    fun showSnackBar() {
        val layout = findViewById<ScrollView>(R.id.constraint)
        Snackbar.make(layout, "Chechitar", Snackbar.LENGTH_LONG).show()
        Snackbar.make(layout, "Chechitar", Snackbar.LENGTH_INDEFINITE).setAction("X") {
            //Snackbar.make(layout, "Cesitar ")
        }.show()
    }

    private fun goToLifeCycleActivity()           = startActivity(Intent(this, LifeCycleActivity::class.java))
    private fun goToClickEventsActivity()         = startActivity(Intent(this, ClickEventActivity::class.java))
    private fun goToKotlinAndroidExtActivity()    = startActivity(Intent(this, KotlinAndroidExtensionsActivity::class.java))
    private fun goToPicassoActivity()             = startActivity(Intent(this, PicassoActivity::class.java))
    private fun goToListViewActivity()            = startActivity(Intent(this, ListViewActivity::class.java))
    private fun goToIntentsActivity()             = startActivity(Intent(this, IntentsActivity::class.java))
    private fun goToPermissionsActivity()         = startActivity(Intent(this, PermissionsActivity::class.java))
    private fun goToSharedPreferencesActivity()   = startActivity(Intent(this, SharedPreferencesActivity::class.java))
    private fun goToExtensionsFunctionsActivity() = startActivity(Intent(this, ExtensionsFunctionsActivity::class.java))
}
