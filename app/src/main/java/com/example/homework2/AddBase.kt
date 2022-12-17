package com.example.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddBase : Fragment(R.layout.fragment_add) {
    lateinit var controller: NavController


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val titleTxt = view.findViewById<EditText>(R.id.titleTxt)
        val author = view.findViewById<EditText>(R.id.author)
        val bodyTxt = view.findViewById<EditText>(R.id.bodyTxt)


        controller = findNavController()
        val btnview = view.findViewById<Button>(R.id.viewButton)
        btnview.setOnClickListener {
            controller.navigate(R.id.action_addBase_to_viewBase)
        }

        val btnadd = view.findViewById<Button>(R.id.addPost)
        btnadd.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO){
                (requireActivity() as MainActivity).database.getDao().insertPost(
                    Post(0,
                        titleTxt.text.toString(),
                        author.text.toString(),
                        bodyTxt.text.toString())
                )
            }
        }






    }

/*
    companion object {
        fun newInstance() =
            AddBase()
    }

 */
}