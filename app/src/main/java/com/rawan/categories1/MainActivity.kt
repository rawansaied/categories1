package com.rawan.categories1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun onClicking(view: View) {
        Toast.makeText(this, "checkup button clicked", Toast.LENGTH_LONG).show()

    }

    fun crown(view: View) {
        Toast.makeText(this, "Dental crown button clicked", Toast.LENGTH_LONG).show()
    }

    fun implant(view: View) {

        Toast.makeText(this, "Tooth implant button clicked", Toast.LENGTH_LONG).show()
    }
    fun care(view: View) {

        Toast.makeText(this, "Dental care button clicked", Toast.LENGTH_LONG).show()
    }
    fun polishing(view: View) {

        Toast.makeText(this, "Teeth_polishing button clicked", Toast.LENGTH_LONG).show()
    }
    fun installation(view: View) {

        Toast.makeText(this, "Orthodontic_installation button clicked", Toast.LENGTH_LONG).show()
    }

}

