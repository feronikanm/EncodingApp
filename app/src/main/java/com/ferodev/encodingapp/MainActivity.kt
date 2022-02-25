package com.ferodev.encodingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.ferodev.encodingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)

        val row1 = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
        val row2 = arrayOf("q", "w", "e", "r", "t", "y", "u", "i", "o", "p")
        val row3 = arrayOf("a", "s", "d", "f", "g", "h", "j", "k", "l", ";")
        val row4 = arrayOf("z", "x", "c", "v", "b", "n", "m", ",", ".", "/")

        val message = binding.edtText.text.toString().trim()

        binding.btnSendActivity.setOnClickListener {

            if (message != null){
                binding.tvResult.text = message
            }else{
                binding.tvResult.text = "-"
            }
        }

    }



    fun flipHorizontal(): String {
        var output = arrayListOf<String>()

        return output
    }
}