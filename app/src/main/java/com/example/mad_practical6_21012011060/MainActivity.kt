package com.example.mad_practical6_21012011060
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val play: FloatingActionButton = findViewById(R.id.floatingActionButton);
        val stop: FloatingActionButton = findViewById(R.id.floatingActionButton5);
        play.setOnClickListener { playbtn() }
        stop.setOnClickListener { stopbtn() }
    }
    fun playbtn()
    {
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply { startService(this) }
    }
    fun stopbtn()
    {
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply { stopService(this) }
    }
}


