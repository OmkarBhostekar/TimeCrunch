package com.omkarcodes.timecrunch.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omkarcodes.timecrunch.R
import com.omkarcodes.timecrunch.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings){

    private var _binding: FragmentSettingsBinding? = null
    private val binding: FragmentSettingsBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)
    }

     override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}