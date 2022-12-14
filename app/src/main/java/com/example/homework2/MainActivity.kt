package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.*
import androidx.activity.viewModels
import com.example.homework2.R


class MainActivity : AppCompatActivity() {
    private val dataModel: DataModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataModel.idclick.observe(this,{})
    }



    //var myList = listOf (cat)
    //Log.d("Test")




}
