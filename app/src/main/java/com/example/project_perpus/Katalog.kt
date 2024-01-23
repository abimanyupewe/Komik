package com.example.project_perpus


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.project_perpus.databinding.ActivityKatalogBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_katalog.*
import kotlinx.android.synthetic.main.fragment_bookmark.*

class Katalog : AppCompatActivity() {

    lateinit var  bottomNav: BottomNavigationView
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katalog)

        loadFragment(BerandaFragment())
        bottomNav = findViewById(R.id.bottom_navigation_view) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.berandaFragment -> {
                    loadFragment(BerandaFragment())
                    true
                }

                R.id.cariFragment -> {
                    loadFragment(CariFragment())
                    true
                }

                R.id.bookmarkFragment -> {
                    loadFragment(BookmarkFragment())
                    true
                }

                R.id.profilFragment -> {
                    loadFragment(ProfilFragment())
                    true
                }
                else -> {

                }
            }
            true
        }

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        navController = navHostFragment.navController.
//
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
//        setupWithNavController(bottomNavigationView , navController)
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment,fragment)
        transaction.commit()
    }

}