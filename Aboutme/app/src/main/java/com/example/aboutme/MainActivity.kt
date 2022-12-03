package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Info", "addNickName: ")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ClickME.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view:View) {
        binding.apply {
            Log.d("Info", "addNickName: ")
//            binding.nickName.text = binding.textInputEditText.text.toString()
//            Log.d("Info", "addNickName: " + binding.textInputEditText.text.toString())
//            binding.addNickNameButton.visibility = View.GONE
//            binding.textInputEditText.visibility = View.GONE
//            binding.nickName.visibility = View.VISIBLE
        }
    }
}