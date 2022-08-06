package com.okihita.mylib

import android.content.Context
import android.widget.Toast

class MyLibraryClass {

    companion object {
        fun createGreeter(context: Context, name: String) {
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        }
    }
}