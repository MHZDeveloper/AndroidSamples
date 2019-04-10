package com.example.mhz.fragment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun selectFragment(view: View) {
        val fragmentManager = getFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment1 = FragmentOne()
        val fragment2 = FragmentTwo()
        if (view == findViewById(R.id.button1)) {
            fragmentTransaction.replace(R.id.fragment_place, fragment1)
        } else {
            fragmentTransaction.replace(R.id.fragment_place, fragment2)
        }
        fragmentTransaction.commit()
    }
}
