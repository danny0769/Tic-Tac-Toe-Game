package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import android.content.Intent
class MainActivity : AppCompatActivity() {
    private var OnevOneButton:Button?=null
    private var vsComputer:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        //code to hide status bar from one activity only at a time using the above lines of code:
        OnevOneButton=findViewById(R.id.onevone)
        vsComputer=findViewById(R.id.vscomputer)
        vsComputer?.setOnClickListener {
            Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show()
        }
        OnevOneButton?.setOnClickListener {
            val i = Intent(applicationContext, MainActivity2::class.java)
            startActivity(i)
        }
    }
}
