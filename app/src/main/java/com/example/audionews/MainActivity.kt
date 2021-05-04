package com.example.audionews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as HomePageFragment
            val navController = navHostFragment.findNavController()

        }
    }
}