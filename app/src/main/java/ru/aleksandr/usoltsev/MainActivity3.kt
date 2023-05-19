package ru.aleksandr.usoltsev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun intent3(view: View) {
        val intent1= Intent(this@MainActivity3, MainActivity::class.java)
        startActivity(intent1)
        finish()
    }
}