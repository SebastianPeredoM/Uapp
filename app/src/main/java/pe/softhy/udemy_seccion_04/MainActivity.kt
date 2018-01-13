package pe.softhy.udemy_seccion_04

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        val btnLifeCycle          = buton1
        val btnClickEvents        = buton2
        val btnAndroidExt         = buton3
        val btnPicasso            = buton4
        val btnListView           = buton5
        val btnIntents            = buton6
        val btnPermission         = buton7
        val btnSharedPreferences  = buton8
        val btnExtensionFunctions = buton9

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
