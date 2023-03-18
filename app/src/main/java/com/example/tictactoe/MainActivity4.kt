package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    private var player1:String?=null
    private var player2:String?=null
    private var draw:String?=null
    private var result_tv:TextView?=null
    private var playagain:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        //hiding the status bar from on activity only using code from one activity only!
         setContentView(R.layout.activity_main4)
        result_tv=findViewById(R.id.resultv)
        playagain=findViewById(R.id.playagainid)
        val i=intent
        val value=i.getIntExtra("num",0)
        if(value==1){
            val intent=intent
            player1=intent.getStringExtra("player1wins")
            result_tv?.text=player1+" win's"
        }
        else if(value==2){
            val intent=intent
            player2=intent.getStringExtra("player2wins")
            result_tv?.text=player2+" win's"

        }
        else if(value==0){
            val intent=intent
            draw=intent.getStringExtra("draw")
            result_tv?.text=draw
        }
        playagain?.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}