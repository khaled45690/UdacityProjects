package com.example.aboutme

import android.content.ContentValues.TAG
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.addNickNameButton.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view:View) {
        binding.apply {
            binding.nickName.text = binding.textInputEditText.text.toString()
            Log.d(TAG, "addNickName: " + binding.textInputEditText.text.toString())
            invalidateOptionsMenu()
            binding.addNickNameButton.visibility = View.GONE
            binding.textInputEditText.visibility = View.GONE
            binding.nickName.visibility = View.VISIBLE
        }
    }
}