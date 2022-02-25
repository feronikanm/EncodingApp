package com.ferodev.encodingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.ferodev.encodingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val row1 = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
    private val row2 = arrayOf("q", "w", "e", "r", "t", "y", "u", "i", "o", "p")
    private val row3 = arrayOf("a", "s", "d", "f", "g", "h", "j", "k", "l", ";")
    private val row4 = arrayOf("z", "x", "c", "v", "b", "n", "m", ",", ".", "/")

    private val colomn1 = arrayOf("1", "q", "a", "z")
    private val colomn2 = arrayOf("2", "w", "s", "x")
    private val colomn3 = arrayOf("3", "e", "d", "c")
    private val colomn4 = arrayOf("4", "r", "f", "v")
    private val colomn5 = arrayOf("5", "t", "g", "b")
    private val colomn6 = arrayOf("6", "y", "h", "n")
    private val colomn7 = arrayOf("7", "u", "j", "m")
    private val colomn8 = arrayOf("8", "i", "k", ",")
    private val colomn9 = arrayOf("9", "o", "l", ".")
    private val colomn10 = arrayOf("10", "p", ";", "/")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)



        val message = binding.edtText.text.toString().trim()

        binding.btnSendActivity.setOnClickListener {

            if (message != null){
                binding.tvResult.text = message
            }else{
                binding.tvResult.text = "-"
            }
        }

    }



//    fun flipHorizontal(): String {
//        var output = arrayListOf<String>()
//
//        return output
//    }
}