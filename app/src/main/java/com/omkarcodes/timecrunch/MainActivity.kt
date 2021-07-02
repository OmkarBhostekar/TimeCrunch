package com.omkarcodes.timecrunch

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.omkarcodes.timecrunch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.navHostFragment)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id){
                R.id.newTaskFragment,
                R.id.taskDetailFragment -> {
                    binding.bottomNav.visibility = View.GONE
                }
                R.id.settingsFragment,
                R.id.homeFragment -> {
                    binding.bottomNav.visibility = View.VISIBLE
                }
            }
        }

        binding.bottomNav.setupWithNavController(navController)
    }

    override fun onNavigateUp(): Boolean {
        return navController.navigateUp() || super.onNavigateUp()
    }
}