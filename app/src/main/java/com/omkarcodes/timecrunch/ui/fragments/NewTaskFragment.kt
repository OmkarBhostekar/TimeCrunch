package com.omkarcodes.timecrunch.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omkarcodes.timecrunch.R
import com.omkarcodes.timecrunch.databinding.FragmentNewTaskBinding

class NewTaskFragment : Fragment(R.layout.fragment_new_task){

    private var _binding: FragmentNewTaskBinding? = null
    private val binding: FragmentNewTaskBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNewTaskBinding.bind(view)
    }

     override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}