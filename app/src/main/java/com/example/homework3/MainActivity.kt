package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.*
import androidx.activity.viewModels
import androidx.room.Room
import com.example.homework3.R


class MainActivity : AppCompatActivity() {
    //private val dataModel: DataModel by viewModels()
    lateinit var database: PostDatabase



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(this, PostDatabase::class.java, "post")
            .build()
    }



    //var myList = listOf (cat)
    //Log.d("Test")




}
