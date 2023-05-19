package ru.aleksandr.usoltsev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val timer=object: CountDownTimer(10000,2000)
        {
            override fun onTick(millisUntilFinished: Long) {
            }
            override fun onFinish() {
                val intent1= Intent(this@MainActivity2, MainActivity3::class.java)
                startActivity(intent1)
                finish()
            }
        }
        timer.start()
    }
}