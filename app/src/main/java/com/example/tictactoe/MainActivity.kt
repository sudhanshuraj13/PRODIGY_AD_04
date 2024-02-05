package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var flag = 0
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener { check(binding.btn1) }
        binding.btn2.setOnClickListener { check(binding.btn2) }
        binding.btn3.setOnClickListener { check(binding.btn3) }
        binding.btn4.setOnClickListener { check(binding.btn4) }
        binding.btn5.setOnClickListener { check(binding.btn5) }
        binding.btn6.setOnClickListener { check(binding.btn6) }
        binding.btn7.setOnClickListener { check(binding.btn7) }
        binding.btn8.setOnClickListener { check(binding.btn8) }
        binding.btn9.setOnClickListener { check(binding.btn9) }
    }

    fun check(view: View) {

        val btnCurrent = view as Button

        if (btnCurrent.text == "") {
            count++

            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1;
            } else {
                btnCurrent.text = "O"
                flag = 0;
            }

            val b1 = binding.btn1.text.toString()
            val b2 = binding.btn2.text.toString()
            val b3 = binding.btn3.text.toString()
            val b4 = binding.btn4.text.toString()
            val b5 = binding.btn5.text.toString()
            val b6 = binding.btn6.text.toString()
            val b7 = binding.btn7.text.toString()
            val b8 = binding.btn8.text.toString()
            val b9 = binding.btn9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b4", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b7", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b2", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (count == 9){
                Toast.makeText(this@MainActivity, "Match is Draw", Toast.LENGTH_LONG).show()
                NewGame()
            }
        }
    }


    fun NewGame(){
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""
        flag = 0;
        count = 0;
    }


}