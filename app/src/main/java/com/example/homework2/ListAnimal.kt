package com.example.homework2

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.homework2.R


class ListAnimal : Fragment(R.layout.fragment_list_animal) {
    private val dataModel : DataModel by activityViewModels()

    lateinit var controller: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        var txt2 = listOf("${cat.Name} - ${cat.hishnik} - Обитает ${cat.live}. Ест ${cat.eat}",
            "${kenga.Name} - ${kenga.hishnik} - Обитает ${kenga.live}. Ест ${kenga.eat}",
            "${dog.Name} - ${dog.hishnik} - Обитает ${dog.live}. Ест ${dog.eat}",
            "${whale.Name} - ${whale.hishnik} - Обитает ${whale.live}. Ест ${whale.eat}"
        )


        var txt = listOf("${cat.Name}",
            "${kenga.Name}",
            "${dog.Name}",
            "${whale.Name}"
        )


        //kenga, dog, whale).toString()
        Log.d("**** Test ******",  txt.toString())

        //val textView = findViewById<TextView>(R.id.text_view_id)
        //textView.setText(txt);
        val ListView = view.findViewById<ListView>(R.id.ListView_id)
        //ListView.setText(txt);

        /*
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            activity as Context,
            android.R.layout.simple_list_item_1, txt
        )*/

        val arrayAdapter = ArrayAdapter<String>(
            activity as Context,
            android.R.layout.simple_list_item_1,
            txt
        )




        ListView.adapter = arrayAdapter
        //var t = listOf(cat).toString()
        //println(t)
        //Log.d("test", t)

        controller = findNavController()

        ListView.setOnItemClickListener{parent, view, position, id ->
            //Toast.makeText(activity as Context, "Item ${position}",   Toast.LENGTH_SHORT).show()
           // Toast.makeText(activity as Context, "${txt2[position]}",   Toast.LENGTH_SHORT).show()
dataModel.idclick.value = txt2[position]
            controller.navigate(R.id.action_listAnimal_to_infoAnimal)


        }

/*
        controller = findNavController()
        val button = view.findViewById<Button>(R.id.btnGoInfo)
        button.setOnClickListener {
            controller.navigate(R.id.action_listAnimal_to_infoAnimal)
        }

 */
    }



/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





    }

 */
}