package com.example.homework3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewBase : Fragment(R.layout.fragment_view_base) {
    lateinit var controller: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.messages)


        controller = findNavController()
        val btnback = view.findViewById<Button>(R.id.btnBack)

        btnback.setOnClickListener {
            controller.navigate(R.id.action_viewBase_to_addBase)
        }






        lifecycleScope.launch(Dispatchers.IO) {
            val posts = (requireActivity() as MainActivity).database.getDao().getPosts()
            val adapter = Adapter(requireContext(), posts)
            withContext(Dispatchers.Main){
                recyclerView.adapter = adapter
            }
        }


    }
/*
    companion object {
        @JvmStatic
        fun newInstance() =
            ViewFragment()
    }

 */
}