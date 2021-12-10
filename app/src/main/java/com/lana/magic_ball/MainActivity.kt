package com.lana.magic_ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
private const val LAST_SELECT_ITEM="item"

lateinit var bottomNavigationView: BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {

                R.id.razrab -> {
                    fragment = BallFragment()
                }

                R.id.ball -> {
                    fragment = aboutFragment()
                }

            }
            replaceFragment(
                fragment!!
            )
            true
        }
bottomNavigationView.selectedItemId= if (savedInstanceState!=null) savedInstanceState.getInt(
    LAST_SELECT_ITEM) else R.id.ball
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putInt(LAST_SELECT_ITEM, bottomNavigationView.selectedItemId)
    }
   private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}