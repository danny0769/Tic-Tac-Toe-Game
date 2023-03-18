package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private var PlayButton:Button?=null
    //made it of nullable type to assign value to it later on!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //code to programatically hide the status bar from only one activity only
        setContentView(R.layout.activity_main2)

        //all the beginning of the code stars from here:
        PlayButton=findViewById(R.id.play_buttonid)
        //connection made between the ui element and the code element:
        PlayButton?.setOnClickListener {
            val obj=findViewById<EditText>(R.id.playerid1)
            val objtwo=findViewById<EditText>(R.id.playertv2)
            val person1:String=obj.text.toString()
            val person2:String=objtwo.text.toString()
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("name1",person1)
            intent.putExtra("name2",person2)
            startActivity(intent)
            //this is the typical use of the intent  which will help us to jump from one activity
            //to other new activity
        }
        //this is known as safety null check which we must do with every variable of the type null
        //made coz its imp to check ki jiss object pr hm actually call krrein hain method ko khiin
        //woh null value to nhi le baitha hai kynuki agr uski value null hai toh then in this case
        //we can not call on that specific object for the method:

    }
}