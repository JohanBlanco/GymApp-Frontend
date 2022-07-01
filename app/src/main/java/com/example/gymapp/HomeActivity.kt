package com.example.gymapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.CollapsingToolbarLayout

class HomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val navController = findNavController(R.id.nav_host_fragment)
//        val appBarConfiguration = AppBarConfiguration(navController.graph)
//        findViewById<Toolbar>(R.id.toolbar)
//            .setupWithNavController(navController, appBarConfiguration)
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//        val appBarConfiguration = AppBarConfiguration(
//            topLevelDestinationIds = setOf(),
//            fallbackOnNavigateUpListener = ::onSupportNavigateUp
//        )
//        findViewById<Toolbar>(R.id.toolbar)
//            .setupWithNavController(navController, appBarConfiguration)


//        val layout = findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar_layout)
//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//        val appBarConfiguration = AppBarConfiguration(navController.graph)
//        layout.setupWithNavController(toolbar, navController, appBarConfiguration)

    }
}