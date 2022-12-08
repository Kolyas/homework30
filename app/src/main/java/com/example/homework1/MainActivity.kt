package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    init {
        //Animal(Name, Size, countLap.hishnik,live,eat)


    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)


    }
            override fun onStart() {
        super.onStart()
                setContentView(R.layout.activity_main)
                var live = liveAnimal("Дом", "Россия")
                var eat = eatAnimal("Mouse", "Нора")
                val cat = Animal("cat", "small", 4, "Hishnik", live, eat)


                live = liveAnimal("Улица", "Австралия")
                eat = eatAnimal("Трава", "Земля")
                val kenga = Animal("Кенгуру", "Большая", 4, "Травоядная", live, eat)

                live = liveAnimal("Дом", "Повсеместно")
                eat = eatAnimal("Кости", "В теле животного")
                val dog = Animal("Собака", "Средняя", 4, "Hishnik", live, eat)

                live = liveAnimal("Кит", "Гренландия")
                eat = eatAnimal("Планктон", "Океан")
                val whale = Animal("Кит", "Огромный", 0, "Hishnik", live, eat)

var txt = listOf("${cat.Name} - ${cat.hishnik} - Обитает ${cat.live}. Ест ${cat.eat}\n" +
        "${kenga.Name} - ${kenga.hishnik} - Обитает ${kenga.live}. Ест ${kenga.eat}\n" +
        "${dog.Name} - ${dog.hishnik} - Обитает ${dog.live}. Ест ${dog.eat}\n" +
        "${whale.Name} - ${whale.hishnik} - Обитает ${whale.live}. Ест ${whale.eat}"
).toString()

    //kenga, dog, whale).toString()
                Log.d("**** Test ******",  txt)


                val textView = findViewById<TextView>(R.id.text_view_id)
               textView.setText(txt);




                //var t = listOf(cat).toString()
        //println(t)
        //Log.d("test", t)


    }
    //var myList = listOf (cat)
    //Log.d("Test")




}
