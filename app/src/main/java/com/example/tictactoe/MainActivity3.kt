package com.example.tictactoe
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {

    private var player1:Boolean?=null
    private var player2:Boolean?=null
    private var ButtonOne:Button?=null
    private var ButtonTwo:Button?=null
    private var ButtonThree:Button?=null
    private var ButtonFour:Button?=null
    private var ButtonFive:Button?=null
    private var ButtonSix:Button?=null
    private var ButtonSeven:Button?=null
    private var ButtonEight:Button?=null
    private var ButtonNine:Button?=null
    //button declared of the grid:
    private  var total_moves:Int=0
    private  var turn:Int=1
    private var playername1:String?=null
    private var playername2:String?=null
    var message:String?=null
    var nameone:String?=null
    var nameTwo:String?=null
    private val draw:String="It's a Draw!"
    private var num:Int?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //code to programatically hide the status bar from only one activity only!
        setContentView(R.layout.activity_main3)
        //logic:
        val i=intent
        nameone=i.getStringExtra("name1")
        nameTwo=i.getStringExtra("name2")
       // Toast.makeText(this,nameone,Toast.LENGTH_LONG).show()
        ButtonOne=findViewById(R.id.button1)
        ButtonTwo=findViewById(R.id.button2)
        ButtonThree=findViewById(R.id.button3)
        ButtonFour=findViewById(R.id.button4)
        ButtonFive=findViewById(R.id.button5)
        ButtonSix=findViewById(R.id.button6)
        ButtonSeven=findViewById(R.id.button7)
        ButtonEight=findViewById(R.id.button8)
        ButtonNine=findViewById(R.id.button9)

        //LOGIC:

        ButtonOne?.setOnClickListener {
            total_moves++
            OnPress(ButtonOne!!)
        }
        ButtonTwo?.setOnClickListener {
            total_moves++
            OnPress(ButtonTwo!!)
        }
        ButtonThree?.setOnClickListener {
            total_moves++
            OnPress(ButtonThree!!)
        }
        ButtonFour?.setOnClickListener {
            total_moves++
            OnPress(ButtonFour!!)
        }
        ButtonFive?.setOnClickListener {
            total_moves++
            OnPress(ButtonFive!!)
        }
        ButtonSix?.setOnClickListener {
            total_moves++
            OnPress(ButtonSix!!)
        }
        ButtonSeven?.setOnClickListener {
            total_moves++
            OnPress(ButtonSeven!!)
        }
        ButtonEight?.setOnClickListener {
            total_moves++
            OnPress(ButtonEight!!)
        }
        ButtonNine?.setOnClickListener {
            total_moves++
            OnPress(ButtonNine!!)
        }


    }

    private fun OnPress(btn:Button){
        if(btn.text==""){
            if(turn==1){
                btn.text="X"
                turn=2
            }
            else{
                turn=1
                btn.text="O"
            }
        }
        checkResult()

        if(player1==true){
            //call activity 4
            val i = Intent(applicationContext, MainActivity4::class.java)
            num=1
            i.putExtra("player1wins",nameone)
            i.putExtra("num",num)
            startActivity(i)
        }
        if(player2==true){
            val i = Intent(applicationContext, MainActivity4::class.java)
            num=2
            i.putExtra("player2wins",nameTwo)
            i.putExtra("num",num)
            startActivity(i)
            //Toast.makeText(this,nameTwo,Toast.LENGTH_LONG).show()
        }
       if(player2!=true && player1!=true && total_moves==9){
           num=0
           val i = Intent(applicationContext, MainActivity4::class.java)
           i.putExtra("num",num)
           i.putExtra("draw",draw)
           startActivity(i)
           //Toast.makeText(this,"draw",Toast.LENGTH_LONG).show()
       }
    }
    fun checkResult(){

        //case if player 1 has won the game:

        //if a player wins instantly jump to new activity which will avoid further picks:

        if(ButtonOne?.text=="X" && ButtonTwo?.text=="X" && ButtonThree?.text=="X"){

            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonFour?.text=="X" && ButtonFive?.text=="X" && ButtonSix?.text=="X"){
            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonSeven?.text=="X" && ButtonEight?.text=="X" && ButtonNine?.text=="X"){
            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonOne?.text=="X" && ButtonFour?.text=="X" && ButtonSeven?.text=="X"){
            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonTwo?.text=="X" && ButtonFive?.text=="X" && ButtonEight?.text=="X"){
            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonThree?.text=="X" && ButtonSix?.text=="X" && ButtonNine?.text=="X"){
            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }

        if(ButtonOne?.text=="X" && ButtonFive?.text=="X" && ButtonNine?.text=="X"){
            player1=true
           // Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }

        if(ButtonThree?.text=="X" && ButtonFive?.text=="X" && ButtonSeven?.text=="X"){
            player1=true
            //Toast.makeText(this,"player 1 wins",Toast.LENGTH_LONG).show()
        }

        //case if player two wins:

        if(ButtonOne?.text=="O" && ButtonTwo?.text=="O" && ButtonThree?.text=="O"){
            player2=true
           // Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonFour?.text=="O" && ButtonFive?.text=="O" && ButtonSix?.text=="O"){
            player2=true
           // Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonSeven?.text=="O" && ButtonEight?.text=="O" && ButtonNine?.text=="O"){
            player2=true
           // Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonOne?.text=="O" && ButtonFour?.text=="O" && ButtonSeven?.text=="O"){
            player2=true
           // Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonTwo?.text=="O" && ButtonFive?.text=="O" && ButtonEight?.text=="O"){
            player2=true
            //Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }
        if(ButtonThree?.text=="O" && ButtonSix?.text=="O" && ButtonNine?.text=="O"){
            player2=true
            //Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }

        if(ButtonOne?.text=="O" && ButtonFive?.text=="O" && ButtonNine?.text=="O"){
            player2=true
           // Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }

        if(ButtonThree?.text=="O" && ButtonFive?.text=="O" && ButtonSeven?.text=="O"){
            player2=true
            //Toast.makeText(this,"player 2 wins",Toast.LENGTH_LONG).show()
        }


    }


}
