package com.okihita.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.okihita.myapplication.ui.main.MainFragment
import com.okihita.mylib.MyLibraryClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        MyLibraryClass.createGreeter(this, "Xena")
    }
}